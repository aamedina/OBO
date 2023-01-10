(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [arachne.aristotle.registry :as reg]
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
   [net.wikipunk.obo :as obo]
   [net.wikipunk.obo.boot :as boot]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.rdf.acl :as acl]
   [net.wikipunk.rdf.adms :as adms]
   [net.wikipunk.rdf.as :as as]   
   [net.wikipunk.rdf.cc :as cc]
   [net.wikipunk.rdf.csvw :as csvw]
   [net.wikipunk.rdf.dcat :as dcat]
   [net.wikipunk.rdf.dcterms :as dcterms]
   [net.wikipunk.rdf.dpvo :as dpvo]
   [net.wikipunk.rdf.dpvo-gdpr :as dpvo-gdpr]
   [net.wikipunk.rdf.dpvo-pd :as dpvo-pd]
   [net.wikipunk.rdf.dpvo-risk :as dpvo-risk]
   [net.wikipunk.rdf.doap :as doap]
   [net.wikipunk.rdf.dqv :as dqv]
   [net.wikipunk.rdf.duv :as duv]
   [net.wikipunk.rdf.foaf :as foaf]
   [net.wikipunk.rdf.geo :as geo]
   [net.wikipunk.rdf.greg :as greg]
   [net.wikipunk.rdf.jsonld :as jsonld]
   [net.wikipunk.rdf.jsonschema :as jsonschema]
   [net.wikipunk.rdf.ldp :as ldp]
   [net.wikipunk.rdf.ma :as ma]
   [net.wikipunk.rdf.oa :as oa]
   [net.wikipunk.rdf.odrl :as odrl]
   [net.wikipunk.rdf.org :as org]
   [net.wikipunk.rdf.owl :as owl]
   [net.wikipunk.rdf.prov :as prov]
   [net.wikipunk.rdf.qb :as qb]
   [net.wikipunk.rdf.rdf :as rdf.rdf]
   [net.wikipunk.rdf.rdfa :as rdfa]
   [net.wikipunk.rdf.rdfs :as rdfs]
   [net.wikipunk.rdf.rev :as rev]
   [net.wikipunk.rdf.schema :as schema]
   [net.wikipunk.rdf.sd :as sd]
   [net.wikipunk.rdf.sioc :as sioc]
   [net.wikipunk.rdf.skos :as skos]
   [net.wikipunk.rdf.skosxl :as skosxl]
   [net.wikipunk.rdf.sm :as sm]
   [net.wikipunk.rdf.sosa :as sosa]
   [net.wikipunk.rdf.ssn :as ssn]
   [net.wikipunk.rdf.swrl :as swrl]
   [net.wikipunk.rdf.time :as time]
   [net.wikipunk.rdf.vann :as vann]
   [net.wikipunk.rdf.voaf :as voaf]
   [net.wikipunk.rdf.vcard :as vcard]
   [net.wikipunk.rdf.void :as void]
   [net.wikipunk.rdf.vs :as vs]
   [net.wikipunk.rdf.xsd :as xsd]
   [zprint.core :as zprint]))

(set-init
  (fn [_]
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
  (reg/with (assoc (merge (:rdf/ns-prefix-map (meta (rdf/mem-parse "http://purl.obolibrary.org/meta/context.jsonld")))
                      (:rdf/ns-prefix-map (meta (rdf/mem-parse "http://purl.obolibrary.org/meta/obo_context.jsonld"))))
                      "obo-meta" "http://purl.obolibrary.org/meta/")
               (->> (rdf/mem-parse "http://purl.obolibrary.org/meta/ontologies.jsonld")
                    (filter #(some-> (:dcat/accessURL %)
                                     (str/ends-with? ".owl")))
                    (map #(select-keys % [:dcat/accessURL :idot/preferredPrefix]))
                    (filter :idot/preferredPrefix)
                    (sort-by :idot/preferredPrefix)
                    (map (fn [m]
                           (list 'def (-> (:idot/preferredPrefix m)
                                          (str/lower-case)
                                          (str/replace #".owl" "")
                                          (symbol))
                                 (-> (set/rename-keys m {:dcat/accessURL       :rdfa/uri
                                                         :idot/preferredPrefix :rdfa/prefix})
                                     (assoc  :rdf/type :rdfa/PrefixMapping
                                             :dcat/downloadURL (:dcat/accessURL m))
                                     (update :rdfa/prefix str/lower-case)
                                     (update :rdfa/uri #(str/replace % #".owl" "#")))
                                 )))
                    (run! (fn [form]
                            (zprint/zprint form)
                            (newline))))))
