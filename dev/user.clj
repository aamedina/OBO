(ns user
  {:clojure.tools.namespace.repl/load false}
  (:require
   [clojure.edn]
   [clojure.repl]
   [clojure.tools.namespace.repl]
   [com.stuartsierra.component.user-helpers :refer [dev go reset]]))

(clojure.tools.namespace.repl/set-refresh-dirs "dev")

(Thread/setDefaultUncaughtExceptionHandler
  (reify Thread$UncaughtExceptionHandler
    (uncaughtException [_ thread ex]
      (binding [*out* *err*]
        (let [msg (str "Uncaught exception on " (.getName thread))]
          (println msg)
          (clojure.repl/pst ex))))))

(def reveal
  (delay
    (doto ((requiring-resolve 'vlaaad.reveal/ui))
      (add-tap))))

(defn reset-reveal
  []
  ((requiring-resolve 'vlaaad.reveal/close-all-views))
  (alter-var-root #'reveal (constantly (delay
                                         (doto ((requiring-resolve 'vlaaad.reveal/ui))
                                           (add-tap))))))

(defn HsapDv
  []
  (pmap require '[net.wikipunk.rdf.HsapDv
                  net.wikipunk.rdf.UBERON
                  net.wikipunk.rdf.BFO
                  net.wikipunk.rdf.IAO
                  net.wikipunk.rdf.CARO
                  net.wikipunk.rdf.oboInOwl
                  net.wikipunk.rdf.OBI
                  net.wikipunk.rdf.APOLLO_SV
                  net.wikipunk.rdf.STATO
                  net.wikipunk.rdf.PCO
                  net.wikipunk.rdf.RO
                  net.wikipunk.rdf.PATO
                  net.wikipunk.rdf.CL
                  net.wikipunk.rdf.NCBITaxon
                  net.wikipunk.rdf.ro]))
