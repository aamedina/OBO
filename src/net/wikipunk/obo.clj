(ns net.wikipunk.obo
  "Open Biological and Biomedical Ontology"
  (:require
   [clojure.string :as str]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.obo.boot]
   [net.wikipunk.rdf :as rdf]))

(defrecord OBO [vocab boot]
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this)

  rdf/NamespaceSpitter
  (emit [_ arg-map]
    (rdf/emit boot arg-map)))
