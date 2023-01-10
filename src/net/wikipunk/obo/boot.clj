(ns net.wikipunk.obo.boot
  {:rdf/type :jsonld/Context}
  (:refer-clojure :exclude [pr mod]))

#_(def ontologies
  {:dcat/downloadURL "https://raw.githubusercontent.com/OBOFoundry/OBOFoundry.github.io/master/registry/ontologies.ttl"})

(def obo
  {:rdfa/prefix "obo"
   :rdfa/uri    "http://purl.obolibrary.org/obo/"
   :rdf/type    :rdfa/PrefixMapping})

(def ado
  {:rdfa/uri "http://purl.obolibrary.org/obo/ado.owl#",
   :rdfa/prefix "ado",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ado.owl"})

(def aeo
  {:rdfa/uri "http://purl.obolibrary.org/obo/aeo.owl#",
   :rdfa/prefix "aeo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/aeo.owl"})

(def agro
  {:rdfa/uri "http://purl.obolibrary.org/obo/agro.owl#",
   :rdfa/prefix "agro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/agro.owl"})

(def aism
  {:rdfa/uri "http://purl.obolibrary.org/obo/aism.owl#",
   :rdfa/prefix "aism",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/aism.owl"})

(def amphx
  {:rdfa/uri "http://purl.obolibrary.org/obo/amphx.owl#",
   :rdfa/prefix "amphx",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/amphx.owl"})

(def apo
  {:rdfa/uri "http://purl.obolibrary.org/obo/apo.owl#",
   :rdfa/prefix "apo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/apo.owl"})

(def apollo_sv
  {:rdfa/uri "http://purl.obolibrary.org/obo/apollo_sv.owl#",
   :rdfa/prefix "apollo_sv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/apollo_sv.owl"})

(def aro
  {:rdfa/uri "http://purl.obolibrary.org/obo/aro.owl#",
   :rdfa/prefix "aro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/aro.owl"})

(def bco
  {:rdfa/uri "http://purl.obolibrary.org/obo/bco.owl#",
   :rdfa/prefix "bco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bco.owl"})

(def bfo
  {:rdfa/uri "http://purl.obolibrary.org/obo/bfo.owl#",
   :rdfa/prefix "bfo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bfo.owl"})

(def bspo
  {:rdfa/uri "http://purl.obolibrary.org/obo/bspo.owl#",
   :rdfa/prefix "bspo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bspo.owl"})

(def bto
  {:rdfa/uri "http://purl.obolibrary.org/obo/bto.owl#",
   :rdfa/prefix "bto",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bto.owl"})

(def caro
  {:rdfa/uri "http://purl.obolibrary.org/obo/caro.owl#",
   :rdfa/prefix "caro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/caro.owl"})

(def cdao
  {:rdfa/uri "http://purl.obolibrary.org/obo/cdao.owl#",
   :rdfa/prefix "cdao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cdao.owl"})

(def cdno
  {:rdfa/uri "http://purl.obolibrary.org/obo/cdno.owl#",
   :rdfa/prefix "cdno",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cdno.owl"})

(def chebi
  {:rdfa/uri "http://purl.obolibrary.org/obo/chebi.owl#",
   :rdfa/prefix "chebi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/chebi.owl"})

(def cheminf
  {:rdfa/uri "http://purl.obolibrary.org/obo/cheminf.owl#",
   :rdfa/prefix "cheminf",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cheminf.owl"})

(def chiro
  {:rdfa/uri "http://purl.obolibrary.org/obo/chiro.owl#",
   :rdfa/prefix "chiro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/chiro.owl"})

(def chmo
  {:rdfa/uri "http://purl.obolibrary.org/obo/chmo.owl#",
   :rdfa/prefix "chmo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/chmo.owl"})

(def cido
  {:rdfa/uri "http://purl.obolibrary.org/obo/cido.owl#",
   :rdfa/prefix "cido",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cido.owl"})

(def cio
  {:rdfa/uri "http://purl.obolibrary.org/obo/cio.owl#",
   :rdfa/prefix "cio",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cio.owl"})

(def cl
  {:rdfa/uri "http://purl.obolibrary.org/obo/cl.owl#",
   :rdfa/prefix "cl",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cl.owl"})

(def clao
  {:rdfa/uri "http://purl.obolibrary.org/obo/clao.owl#",
   :rdfa/prefix "clao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/clao.owl"})

(def clo
  {:rdfa/uri "http://purl.obolibrary.org/obo/clo.owl#",
   :rdfa/prefix "clo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/clo.owl"})

(def clyh
  {:rdfa/uri "http://purl.obolibrary.org/obo/clyh.owl#",
   :rdfa/prefix "clyh",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/clyh.owl"})

(def cmo
  {:rdfa/uri "http://purl.obolibrary.org/obo/cmo.owl#",
   :rdfa/prefix "cmo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cmo.owl"})

(def cob
  {:rdfa/uri "http://purl.obolibrary.org/obo/cob.owl#",
   :rdfa/prefix "cob",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cob.owl"})

(def colao
  {:rdfa/uri "http://purl.obolibrary.org/obo/colao.owl#",
   :rdfa/prefix "colao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/colao.owl"})

(def cro
  {:rdfa/uri "http://purl.obolibrary.org/obo/cro.owl#",
   :rdfa/prefix "cro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cro.owl"})

(def cteno
  {:rdfa/uri "http://purl.obolibrary.org/obo/cteno.owl#",
   :rdfa/prefix "cteno",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cteno.owl"})

(def cto
  {:rdfa/uri "http://purl.obolibrary.org/obo/cto.owl#",
   :rdfa/prefix "cto",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cto.owl"})

(def cvdo
  {:rdfa/uri "http://purl.obolibrary.org/obo/cvdo.owl#",
   :rdfa/prefix "cvdo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cvdo.owl"})

(def ddanat
  {:rdfa/uri "http://purl.obolibrary.org/obo/ddanat.owl#",
   :rdfa/prefix "ddanat",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ddanat.owl"})

(def ddpheno
  {:rdfa/uri "http://purl.obolibrary.org/obo/ddpheno.owl#",
   :rdfa/prefix "ddpheno",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ddpheno.owl"})

(def dideo
  {:rdfa/uri "http://purl.obolibrary.org/obo/dideo.owl#",
   :rdfa/prefix "dideo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/dideo.owl"})

(def disdriv
  {:rdfa/uri "http://purl.obolibrary.org/obo/disdriv.owl#",
   :rdfa/prefix "disdriv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/disdriv.owl"})

(def doid
  {:rdfa/uri "http://purl.obolibrary.org/obo/doid.owl#",
   :rdfa/prefix "doid",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/doid.owl"})

(def dron
  {:rdfa/uri "http://purl.obolibrary.org/obo/dron.owl#",
   :rdfa/prefix "dron",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/dron.owl"})

(def duo
  {:rdfa/uri "http://purl.obolibrary.org/obo/duo.owl#",
   :rdfa/prefix "duo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/duo.owl"})

(def ecao
  {:rdfa/uri "http://purl.obolibrary.org/obo/ecao.owl#",
   :rdfa/prefix "ecao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ecao.owl"})

(def eco
  {:rdfa/uri "http://purl.obolibrary.org/obo/eco.owl#",
   :rdfa/prefix "eco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/eco.owl"})

(def ecocore
  {:rdfa/uri "http://purl.obolibrary.org/obo/ecocore.owl#",
   :rdfa/prefix "ecocore",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ecocore.owl"})

(def ecto
  {:rdfa/uri "http://purl.obolibrary.org/obo/ecto.owl#",
   :rdfa/prefix "ecto",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ecto.owl"})

(def emapa
  {:rdfa/uri "http://purl.obolibrary.org/obo/emapa.owl#",
   :rdfa/prefix "emapa",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/emapa.owl"})

(def envo
  {:rdfa/uri "http://purl.obolibrary.org/obo/envo.owl#",
   :rdfa/prefix "envo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/envo.owl"})

(def epio
  {:rdfa/uri "http://purl.obolibrary.org/obo/epio.owl#",
   :rdfa/prefix "epio",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/epio.owl"})

(def eupath
  {:rdfa/uri "http://purl.obolibrary.org/obo/eupath.owl#",
   :rdfa/prefix "eupath",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/eupath.owl"})

(def exo
  {:rdfa/uri "http://purl.obolibrary.org/obo/exo.owl#",
   :rdfa/prefix "exo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/exo.owl"})

(def fao
  {:rdfa/uri "http://purl.obolibrary.org/obo/fao.owl#",
   :rdfa/prefix "fao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fao.owl"})

(def fbbi
  {:rdfa/uri "http://purl.obolibrary.org/obo/fbbi.owl#",
   :rdfa/prefix "fbbi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbbi.owl"})

(def fbbt
  {:rdfa/uri "http://purl.obolibrary.org/obo/fbbt.owl#",
   :rdfa/prefix "fbbt",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbbt.owl"})

(def fbcv
  {:rdfa/uri "http://purl.obolibrary.org/obo/fbcv.owl#",
   :rdfa/prefix "fbcv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbcv.owl"})

(def fbcv
  {:rdfa/uri "http://purl.obolibrary.org/obo/dpo.owl#",
   :rdfa/prefix "fbcv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/dpo.owl"})

(def fbdv
  {:rdfa/uri "http://purl.obolibrary.org/obo/fbdv.owl#",
   :rdfa/prefix "fbdv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbdv.owl"})

(def fideo
  {:rdfa/uri "http://purl.obolibrary.org/obo/fideo/",
   :rdfa/prefix "fideo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fideo.owl"})

(def flopo
  {:rdfa/uri "http://purl.obolibrary.org/obo/flopo.owl#",
   :rdfa/prefix "flopo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/flopo.owl"})

(def fma
  {:rdfa/uri "http://purl.obolibrary.org/obo/fma.owl#",
   :rdfa/prefix "fma",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fma.owl"})

(def fobi
  {:rdfa/uri "http://purl.obolibrary.org/obo/fobi.owl#",
   :rdfa/prefix "fobi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fobi.owl"})

(def foodon
  {:rdfa/uri "http://purl.obolibrary.org/obo/foodon.owl#",
   :rdfa/prefix "foodon",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/foodon.owl"})

(def fovt
  {:rdfa/uri "http://purl.obolibrary.org/obo/fovt.owl#",
   :rdfa/prefix "fovt",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fovt.owl"})

(def fypo
  {:rdfa/uri "http://purl.obolibrary.org/obo/fypo.owl#",
   :rdfa/prefix "fypo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fypo.owl"})

(def gecko
  {:rdfa/uri "http://purl.obolibrary.org/obo/gecko.owl#",
   :rdfa/prefix "gecko",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/gecko.owl"})

(def genepio
  {:rdfa/uri "http://purl.obolibrary.org/obo/genepio.owl#",
   :rdfa/prefix "genepio",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/genepio.owl"})

(def geno
  {:rdfa/uri "http://purl.obolibrary.org/obo/geno.owl#",
   :rdfa/prefix "geno",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/geno.owl"})

(def geo
  {:rdfa/uri "http://purl.obolibrary.org/obo/geo.owl#",
   :rdfa/prefix "geo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/geo.owl"})

(def gno
  {:rdfa/uri "http://purl.obolibrary.org/obo/gno.owl#",
   :rdfa/prefix "gno",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/gno.owl"})

(def go
  {:rdfa/uri "http://purl.obolibrary.org/obo/go.owl#",
   :rdfa/prefix "go",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/go.owl"})

(def gsso
  {:rdfa/uri "http://purl.obolibrary.org/obo/gsso.owl#",
   :rdfa/prefix "gsso",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/gsso.owl"})

(def hancestro
  {:rdfa/uri "http://purl.obolibrary.org/obo/hancestro.owl#",
   :rdfa/prefix "hancestro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hancestro.owl"})

(def hao
  {:rdfa/uri "http://purl.obolibrary.org/obo/hao.owl#",
   :rdfa/prefix "hao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hao.owl"})

(def hom
  {:rdfa/uri "http://purl.obolibrary.org/obo/hom.owl#",
   :rdfa/prefix "hom",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hom.owl"})

(def hp
  {:rdfa/uri "http://purl.obolibrary.org/obo/hp.owl#",
   :rdfa/prefix "hp",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hp.owl"})

(def hso
  {:rdfa/uri "http://purl.obolibrary.org/obo/hso.owl#",
   :rdfa/prefix "hso",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hso.owl"})

(def htn
  {:rdfa/uri "http://purl.obolibrary.org/obo/htn.owl#",
   :rdfa/prefix "htn",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/htn.owl"})

(def hsapdv
  {:rdfa/uri "http://purl.obolibrary.org/obo/hsapdv.owl#",
   :rdfa/prefix "HsapDv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hsapdv.owl"})

(def iao
  {:rdfa/uri "http://purl.obolibrary.org/obo/iao.owl#",
   :rdfa/prefix "iao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/iao.owl"})

(def iceo
  {:rdfa/uri "http://purl.obolibrary.org/obo/iceo.owl#",
   :rdfa/prefix "iceo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/iceo.owl"})

(def ico
  {:rdfa/uri "http://purl.obolibrary.org/obo/ico.owl#",
   :rdfa/prefix "ico",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ico.owl"})

(def ido
  {:rdfa/uri "http://purl.obolibrary.org/obo/ido.owl#",
   :rdfa/prefix "ido",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ido.owl"})

(def ino
  {:rdfa/uri "http://purl.obolibrary.org/obo/ino.owl#",
   :rdfa/prefix "ino",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ino.owl"})

(def kisao
  {:rdfa/uri "http://purl.obolibrary.org/obo/kisao.owl#",
   :rdfa/prefix "kisao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/kisao.owl"})

(def labo
  {:rdfa/uri "http://purl.obolibrary.org/obo/labo.owl#",
   :rdfa/prefix "labo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/labo.owl"})

(def lepao
  {:rdfa/uri "http://purl.obolibrary.org/obo/lepao.owl#",
   :rdfa/prefix "lepao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/lepao.owl"})

(def ma
  {:rdfa/uri "http://purl.obolibrary.org/obo/ma.owl#",
   :rdfa/prefix "ma",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ma.owl"})

(def mamo
  {:rdfa/uri "http://purl.obolibrary.org/obo/mamo.owl#",
   :rdfa/prefix "mamo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mamo.owl"})

(def maxo
  {:rdfa/uri "http://purl.obolibrary.org/obo/maxo.owl#",
   :rdfa/prefix "maxo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/maxo.owl"})

(def mco
  {:rdfa/uri "http://purl.obolibrary.org/obo/mco.owl#",
   :rdfa/prefix "mco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mco.owl"})

(def mf
  {:rdfa/uri "http://purl.obolibrary.org/obo/mf.owl#",
   :rdfa/prefix "mf",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mf.owl"})

(def mfmo
  {:rdfa/uri "http://purl.obolibrary.org/obo/mfmo.owl#",
   :rdfa/prefix "mfmo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mfmo.owl"})

(def mfoem
  {:rdfa/uri "http://purl.obolibrary.org/obo/mfoem.owl#",
   :rdfa/prefix "mfoem",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mfoem.owl"})

(def mfomd
  {:rdfa/uri "http://purl.obolibrary.org/obo/mfomd.owl#",
   :rdfa/prefix "mfomd",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mfomd.owl"})

(def mi
  {:rdfa/uri "http://purl.obolibrary.org/obo/mi.owl#",
   :rdfa/prefix "mi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mi.owl"})

(def miapa
  {:rdfa/uri "http://purl.obolibrary.org/obo/miapa.owl#",
   :rdfa/prefix "miapa",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/miapa.owl"})

(def micro
  {:rdfa/uri "http://purl.obolibrary.org/obo/micro.owl#",
   :rdfa/prefix "micro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/micro.owl"})

(def mmo
  {:rdfa/uri "http://purl.obolibrary.org/obo/mmo.owl#",
   :rdfa/prefix "mmo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mmo.owl"})

(def mod
  {:rdfa/uri "http://purl.obolibrary.org/obo/mod.owl#",
   :rdfa/prefix "mod",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mod.owl"})

(def mondo
  {:rdfa/uri "http://purl.obolibrary.org/obo/mondo.owl#",
   :rdfa/prefix "mondo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mondo.owl"})

(def mop
  {:rdfa/uri "http://purl.obolibrary.org/obo/mop.owl#",
   :rdfa/prefix "mop",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mop.owl"})

(def mp
  {:rdfa/uri "http://purl.obolibrary.org/obo/mp.owl#",
   :rdfa/prefix "mp",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mp.owl"})

(def mpath
  {:rdfa/uri "http://purl.obolibrary.org/obo/mpath.owl#",
   :rdfa/prefix "mpath",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mpath.owl"})

(def mpio
  {:rdfa/uri "http://purl.obolibrary.org/obo/mpio.owl#",
   :rdfa/prefix "mpio",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mpio.owl"})

(def mro
  {:rdfa/uri "http://purl.obolibrary.org/obo/mro.owl#",
   :rdfa/prefix "mro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mro.owl"})

(def ms
  {:rdfa/uri "http://purl.obolibrary.org/obo/ms.owl#",
   :rdfa/prefix "ms",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ms.owl"})

(def mmusdv
  {:rdfa/uri "http://purl.obolibrary.org/obo/mmusdv.owl#",
   :rdfa/prefix "MmusDv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mmusdv.owl"})

(def nbo
  {:rdfa/uri "http://purl.obolibrary.org/obo/nbo.owl#",
   :rdfa/prefix "nbo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/nbo.owl"})

(def ncbitaxon
  {:rdfa/uri "http://purl.obolibrary.org/obo/ncbitaxon.owl#",
   :rdfa/prefix "NCBITaxon",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ncbitaxon.owl"})

(def ncit
  {:rdfa/uri "http://purl.obolibrary.org/obo/ncit.owl#",
   :rdfa/prefix "ncit",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ncit.owl"})

(def ncro
  {:rdfa/uri "http://purl.obolibrary.org/obo/ncro.owl#",
   :rdfa/prefix "ncro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ncro.owl"})

(def nomen
  {:rdfa/uri "http://purl.obolibrary.org/obo/nomen.owl#",
   :rdfa/prefix "nomen",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/nomen.owl"})

(def oae
  {:rdfa/uri "http://purl.obolibrary.org/obo/oae.owl#",
   :rdfa/prefix "oae",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oae.owl"})

(def oarcs
  {:rdfa/uri "http://purl.obolibrary.org/obo/oarcs.owl#",
   :rdfa/prefix "oarcs",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oarcs.owl"})

(def oba
  {:rdfa/uri "http://purl.obolibrary.org/obo/oba.owl#",
   :rdfa/prefix "oba",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oba.owl"})

(def obcs
  {:rdfa/uri "http://purl.obolibrary.org/obo/obcs.owl#",
   :rdfa/prefix "obcs",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/obcs.owl"})

(def obi
  {:rdfa/uri "http://purl.obolibrary.org/obo/obi.owl#",
   :rdfa/prefix "obi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/obi.owl"})

(def obib
  {:rdfa/uri "http://purl.obolibrary.org/obo/obib.owl#",
   :rdfa/prefix "obib",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/obib.owl"})

(def ogg
  {:rdfa/uri "http://purl.obolibrary.org/obo/ogg.owl#",
   :rdfa/prefix "ogg",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ogg.owl"})

(def ogms
  {:rdfa/uri "http://purl.obolibrary.org/obo/ogms.owl#",
   :rdfa/prefix "ogms",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ogms.owl"})

(def ogsf
  {:rdfa/uri "http://purl.obolibrary.org/obo/ogsf.owl#",
   :rdfa/prefix "ogsf",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ogsf.owl"})

(def ohd
  {:rdfa/uri "http://purl.obolibrary.org/obo/ohd.owl#",
   :rdfa/prefix "ohd",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ohd.owl"})

(def ohmi
  {:rdfa/uri "http://purl.obolibrary.org/obo/ohmi.owl#",
   :rdfa/prefix "ohmi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ohmi.owl"})

(def ohpi
  {:rdfa/uri "http://purl.obolibrary.org/obo/ohpi.owl#",
   :rdfa/prefix "ohpi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ohpi.owl"})

(def omit
  {:rdfa/uri "http://purl.obolibrary.org/obo/omit.owl#",
   :rdfa/prefix "omit",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omit.owl"})

(def omo
  {:rdfa/uri "http://purl.obolibrary.org/obo/omo.owl#",
   :rdfa/prefix "omo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omo.owl"})

(def omp
  {:rdfa/uri "http://purl.obolibrary.org/obo/omp.owl#",
   :rdfa/prefix "omp",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omp.owl"})

(def omrse
  {:rdfa/uri "http://purl.obolibrary.org/obo/omrse.owl#",
   :rdfa/prefix "omrse",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omrse.owl"})

(def one
  {:rdfa/uri "http://purl.obolibrary.org/obo/one.owl#",
   :rdfa/prefix "one",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/one.owl"})

(def ons
  {:rdfa/uri "http://purl.obolibrary.org/obo/ons.owl#",
   :rdfa/prefix "ons",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ons.owl"})

(def ontoavida
  {:rdfa/uri "http://purl.obolibrary.org/obo/ontoavida.owl#",
   :rdfa/prefix "ontoavida",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ontoavida.owl"})

(def ontoneo
  {:rdfa/uri "http://purl.obolibrary.org/obo/ontoneo.owl#",
   :rdfa/prefix "ontoneo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ontoneo.owl"})

(def oostt
  {:rdfa/uri "http://purl.obolibrary.org/obo/oostt.owl#",
   :rdfa/prefix "oostt",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oostt.owl"})

(def opl
  {:rdfa/uri "http://purl.obolibrary.org/obo/opl.owl#",
   :rdfa/prefix "opl",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/opl.owl"})

(def opmi
  {:rdfa/uri "http://purl.obolibrary.org/obo/opmi.owl#",
   :rdfa/prefix "opmi",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/opmi.owl"})

(def ornaseq
  {:rdfa/uri "http://purl.obolibrary.org/obo/ornaseq.owl#",
   :rdfa/prefix "ornaseq",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ornaseq.owl"})

(def ovae
  {:rdfa/uri "http://purl.obolibrary.org/obo/ovae.owl#",
   :rdfa/prefix "ovae",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ovae.owl"})

(def olatdv
  {:rdfa/uri "http://purl.obolibrary.org/obo/olatdv.owl#",
   :rdfa/prefix "olatdv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/olatdv.owl"})

(def pato
  {:rdfa/uri "http://purl.obolibrary.org/obo/pato.owl#",
   :rdfa/prefix "pato",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pato.owl"})

(def pcl
  {:rdfa/uri "http://purl.obolibrary.org/obo/pcl.owl#",
   :rdfa/prefix "pcl",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pcl.owl"})

(def pco
  {:rdfa/uri "http://purl.obolibrary.org/obo/pco.owl#",
   :rdfa/prefix "pco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pco.owl"})

(def pdro
  {:rdfa/uri "http://purl.obolibrary.org/obo/pdro.owl#",
   :rdfa/prefix "pdro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pdro.owl"})

(def peco
  {:rdfa/uri "http://purl.obolibrary.org/obo/peco.owl#",
   :rdfa/prefix "peco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/peco.owl"})

(def phipo
  {:rdfa/uri "http://purl.obolibrary.org/obo/phipo.owl#",
   :rdfa/prefix "phipo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/phipo.owl"})

(def plana
  {:rdfa/uri "http://purl.obolibrary.org/obo/plana.owl#",
   :rdfa/prefix "plana",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/plana.owl"})

(def planp
  {:rdfa/uri "http://purl.obolibrary.org/obo/planp.owl#",
   :rdfa/prefix "planp",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/planp.owl"})

(def po
  {:rdfa/uri "http://purl.obolibrary.org/obo/po.owl#",
   :rdfa/prefix "po",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/po.owl"})

(def poro
  {:rdfa/uri "http://purl.obolibrary.org/obo/poro.owl#",
   :rdfa/prefix "poro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/poro.owl"})

(def ppo
  {:rdfa/uri "http://purl.obolibrary.org/obo/ppo.owl#",
   :rdfa/prefix "ppo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ppo.owl"})

(def pr
  {:rdfa/uri "http://purl.obolibrary.org/obo/pr.owl#",
   :rdfa/prefix "pr",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pr.owl"})

(def proco
  {:rdfa/uri "http://purl.obolibrary.org/obo/proco.owl#",
   :rdfa/prefix "proco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/proco.owl"})

(def psdo
  {:rdfa/uri "http://purl.obolibrary.org/obo/psdo.owl#",
   :rdfa/prefix "psdo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/psdo.owl"})

(def pso
  {:rdfa/uri "http://purl.obolibrary.org/obo/pso.owl#",
   :rdfa/prefix "pso",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pso.owl"})

(def pw
  {:rdfa/uri "http://purl.obolibrary.org/obo/pw.owl#",
   :rdfa/prefix "pw",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pw.owl"})

(def pdumdv
  {:rdfa/uri "http://purl.obolibrary.org/obo/pdumdv.owl#",
   :rdfa/prefix "pdumdv",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pdumdv.owl"})

(def rbo
  {:rdfa/uri "http://purl.obolibrary.org/obo/rbo.owl#",
   :rdfa/prefix "rbo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/rbo.owl"})

(def ro
  {:rdfa/uri "http://purl.obolibrary.org/obo/ro.owl#",
   :rdfa/prefix "ro",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ro.owl"})

(def rs
  {:rdfa/uri "http://purl.obolibrary.org/obo/rs.owl#",
   :rdfa/prefix "rs",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/rs.owl"})

(def rxno
  {:rdfa/uri "http://purl.obolibrary.org/obo/rxno.owl#",
   :rdfa/prefix "rxno",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/rxno.owl"})

(def sbo
  {:rdfa/uri "http://purl.obolibrary.org/obo/sbo.owl#",
   :rdfa/prefix "sbo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/sbo.owl"})

(def scdo
  {:rdfa/uri "http://purl.obolibrary.org/obo/scdo.owl#",
   :rdfa/prefix "scdo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/scdo.owl"})

(def sepio
  {:rdfa/uri "http://purl.obolibrary.org/obo/sepio.owl#",
   :rdfa/prefix "sepio",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/sepio.owl"})

(def sibo
  {:rdfa/uri "http://purl.obolibrary.org/obo/sibo.owl#",
   :rdfa/prefix "sibo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/sibo.owl"})

(def so
  {:rdfa/uri "http://purl.obolibrary.org/obo/so.owl#",
   :rdfa/prefix "so",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/so.owl"})

(def spd
  {:rdfa/uri "http://purl.obolibrary.org/obo/spd.owl#",
   :rdfa/prefix "spd",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/spd.owl"})

(def stato
  {:rdfa/uri "http://purl.obolibrary.org/obo/stato.owl#",
   :rdfa/prefix "stato",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/stato.owl"})

(def swo
  {:rdfa/uri "http://purl.obolibrary.org/obo/swo.owl#",
   :rdfa/prefix "swo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/swo.owl"})

(def symp
  {:rdfa/uri "http://purl.obolibrary.org/obo/symp.owl#",
   :rdfa/prefix "symp",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/symp.owl"})

(def t4fs
  {:rdfa/uri "http://purl.obolibrary.org/obo/t4fs.owl#",
   :rdfa/prefix "t4fs",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/t4fs.owl"})

(def taxrank
  {:rdfa/uri "http://purl.obolibrary.org/obo/taxrank.owl#",
   :rdfa/prefix "taxrank",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/taxrank.owl"})

(def to
  {:rdfa/uri "http://purl.obolibrary.org/obo/to.owl#",
   :rdfa/prefix "to",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/to.owl"})

(def trans
  {:rdfa/uri "http://purl.obolibrary.org/obo/trans.owl#",
   :rdfa/prefix "trans",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/trans.owl"})

(def tto
  {:rdfa/uri "http://purl.obolibrary.org/obo/tto.owl#",
   :rdfa/prefix "tto",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/tto.owl"})

(def txpo
  {:rdfa/uri "http://purl.obolibrary.org/obo/txpo.owl#",
   :rdfa/prefix "txpo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/txpo.owl"})

(def uberon
  {:rdfa/uri "http://purl.obolibrary.org/obo/uberon.owl#",
   :rdfa/prefix "uberon",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/uberon.owl"})

(def uo
  {:rdfa/uri "http://purl.obolibrary.org/obo/uo.owl#",
   :rdfa/prefix "uo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/uo.owl"})

(def upheno
  {:rdfa/uri "http://purl.obolibrary.org/obo/upheno.owl#",
   :rdfa/prefix "upheno",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/upheno.owl"})

(def vbo
  {:rdfa/uri "http://purl.obolibrary.org/obo/vbo.owl#",
   :rdfa/prefix "vbo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vbo.owl"})

(def vo
  {:rdfa/uri "http://purl.obolibrary.org/obo/vo.owl#",
   :rdfa/prefix "vo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vo.owl"})

(def vt
  {:rdfa/uri "http://purl.obolibrary.org/obo/vt.owl#",
   :rdfa/prefix "vt",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vt.owl"})

(def vto
  {:rdfa/uri "http://purl.obolibrary.org/obo/vto.owl#",
   :rdfa/prefix "vto",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vto.owl"})

(def vario
  {:rdfa/uri "http://purl.obolibrary.org/obo/vario.owl#",
   :rdfa/prefix "vario",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vario.owl"})

(def wbphenotype
  {:rdfa/uri "http://purl.obolibrary.org/obo/wbphenotype.owl#",
   :rdfa/prefix "wbphenotype",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/wbphenotype.owl"})

(def wbbt
  {:rdfa/uri "http://purl.obolibrary.org/obo/wbbt.owl#",
   :rdfa/prefix "wbbt",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/wbbt.owl"})

(def wbls
  {:rdfa/uri "http://purl.obolibrary.org/obo/wbls.owl#",
   :rdfa/prefix "wbls",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/wbls.owl"})

(def xao
  {:rdfa/uri "http://purl.obolibrary.org/obo/xao.owl#",
   :rdfa/prefix "xao",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xao.owl"})

(def xco
  {:rdfa/uri "http://purl.obolibrary.org/obo/xco.owl#",
   :rdfa/prefix "xco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xco.owl"})

(def xlmod
  {:rdfa/uri "http://purl.obolibrary.org/obo/xlmod.owl#",
   :rdfa/prefix "xlmod",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xlmod.owl"})

(def xpo
  {:rdfa/uri "http://purl.obolibrary.org/obo/xpo.owl#",
   :rdfa/prefix "xpo",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xpo.owl"})

(def zeco
  {:rdfa/uri "http://purl.obolibrary.org/obo/zeco.owl#",
   :rdfa/prefix "zeco",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zeco.owl"})

(def zfa
  {:rdfa/uri "http://purl.obolibrary.org/obo/zfa.owl#",
   :rdfa/prefix "zfa",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zfa.owl"})

(def zfs
  {:rdfa/uri "http://purl.obolibrary.org/obo/zfs.owl#",
   :rdfa/prefix "zfs",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zfs.owl"})

(def zp
  {:rdfa/uri "http://purl.obolibrary.org/obo/zp.owl#",
   :rdfa/prefix "zp",
   :rdf/type :rdfa/PrefixMapping,
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zp.owl"})
