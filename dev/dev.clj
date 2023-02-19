(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [arachne.aristotle.registry :as reg]
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.java.shell :as sh :refer [sh]]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.temple :as temple]
   [net.wikipunk.mop :as mop :refer [isa? descendants parents ancestors]]
   [net.wikipunk.mop.init]
   [net.wikipunk.obo :as obo]
   [net.wikipunk.obo.boot :as boot]
   [zprint.core :as zprint])
  (:refer-clojure :exclude [isa? descendants parents ancestors]))

(set-init
  (fn [_]
    #_(dorun (user/HsapDv))
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(defmacro inspect
  [& body]
  `(do (@user/reveal (do ~@body))
       true))

(comment
  (let [idx (update-vals (->> (rdf/parse "http://purl.obolibrary.org/meta/ontologies.ttl")
                              (filter :idot/preferredPrefix)
                              (map #(dissoc % :db/ident))
                              (group-by :idot/preferredPrefix))
                         first)]
    (->> (rdf/parse "http://purl.obolibrary.org/meta/obo_prefixes.ttl")
         (filter :sh/prefix)            
         (map #(assoc (merge % (get idx (:sh/prefix %)))
                      :rdf/type :rdfa/PrefixMapping
                      :rdfa/uri (get-in idx [(:sh/prefix %) :dcat/accessURL])
                      :rdfa/prefix (:sh/prefix %)))
         (map #(dissoc % :db/ident :dcat/contactPoint :dcat/contactPoint :obofmd/has_build_information))
         (filter :rdfa/uri)
         (map #(update % :rdfa/uri (fn [s] (if (str/ends-with? s ".owl") (str s "#") s))))
         (map #(set/rename-keys % {:dcat/accessURL :dcat/downloadURL}))
         (sort-by :sh/prefix)
         (run! (fn [m]
                 (zprint/zprint (list 'def (symbol (:sh/prefix m))
                                      (:dc11/description m)
                                      (reduce-kv (fn [m k v]
                                                   (if (keyword? k)
                                                     (assoc m k v)
                                                     m))
                                                 {} m))
                                {:map    {:justify?      true
                                          :nl-separator? false
                                          :hang?         true
                                          :indent        0
                                          :sort-in-code? true
                                          :force-nl?     true}
                                 :vector {:wrap? false}})
                 (newline))))))
