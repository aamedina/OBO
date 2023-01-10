(ns net.wikipunk.obo
  "Open Biological and Biomedical Ontology"
  (:require
   [clojure.string :as str]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.obo.boot]
   [net.wikipunk.rdf :as rdf]))

(defn quickstart
  [])

(defrecord OBO [vocab boot]
  com/Lifecycle
  (start [this]
    (try
      (binding [*ns* (find-ns (or (:quickstart-ns this) 'dev))]
        (quickstart))
      (catch Throwable ex))
    this)
  (stop [this]
    this)

  rdf/NamespaceSpitter
  (emit [_ arg-map]
    (rdf/emit boot arg-map)))
