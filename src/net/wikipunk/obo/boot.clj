(ns net.wikipunk.obo.boot
  {:rdf/type :jsonld/Context})

(def obo
  {:rdfa/prefix "obo"
   :rdfa/uri    "http://purl.obolibrary.org/obo/"
   :rdf/type    :rdfa/PrefixMapping})

(def idot
  {:rdfa/uri    "http://identifiers.org/"
   :rdfa/prefix "idot",
   :rdf/type    :rdfa/PrefixMapping})

(def pav
  {:rdfa/uri    "http://purl.org/pav/"
   :rdfa/prefix "pav",
   :rdf/type    :rdfa/PrefixMapping})

(def gold
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/gold/versions/2010-01-01.n3"
   :rdfa/uri         "http://purl.org/linguistics/gold/"
   :rdfa/prefix      "gold"
   :rdf/type         :rdfa/PrefixMapping})

(def oboInOwl
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://www.geneontology.org/formats/oboInOwl#"
   :rdfa/prefix      "oboInOwl"})

(def faldo
  {:rdfa/uri    "http://biohackathon.org/resource/faldo#"
   :rdfa/prefix "faldo",
   :rdf/type    :rdfa/PrefixMapping})

(def obofmd
  {:rdfa/uri    "http://obofoundry.github.io/vocabulary/"
   :rdfa/prefix "obofmd",
   :rdf/type    :rdfa/PrefixMapping})

(def ncbitaxon
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://purl.obolibrary.org/obo/ncbitaxon#"
   :rdfa/prefix      "ncbitaxon"})

(def Property
  {:rdfa/uri "https://www.wikidata.org/wiki/Property:"
   :rdfa/prefix "Property"
   :rdf/type :rdfa/PrefixMapping})

(def wiki
  {:rdfa/uri "https://www.wikidata.org/wiki/"
   :rdfa/prefix "wiki"
   :rdf/type :rdfa/PrefixMapping})

(def cellline
  {:rdfa/uri "http://www.ebi.ac.uk/cellline#"
   :rdfa/prefix "cellline"
   :rdf/type :rdfa/PrefixMapping})

(def GAZ
  {:rdf/type :rdfa/PrefixMapping
   :rdfa/uri "http://purl.obolibrary.org/obo/gaz.owl#"
   :rdfa/prefix "GAZ"})

(def gaz
  {:rdf/type :rdfa/PrefixMapping
   :rdfa/prefix "gaz",
   :rdfa/uri    "http://purl.obolibrary.org/obo/gaz#"})

(def REO
  {:dcat/downloadURL "https://raw.githubusercontent.com/tis-lab/reagent-ontology/master/reo/ontology_files/reo_pre-merged_or_reasoned_files/reo_merged_3-17-15.owl"
   #_"https://github.com/tis-lab/reagent-ontology/raw/master/reo/ontology_files/reo_pre-merged_or_reasoned_files/reo_reasoned_9-6-12.owl"
   :rdf/type :rdfa/PrefixMapping
   :rdfa/prefix "REO",
   :rdfa/uri    "http://purl.obolibrary.org/obo/reo.owl#"})

(def ro
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/prefix "ro",
   :rdfa/uri    "http://www.obofoundry.org/ro/ro.owl#"})

(def ERO
  {:dcat/downloadURL "https://archivo.dbpedia.org/download?o=http%3A//purl.obolibrary.org/obo/ero.owl&f=ttl&v=2021.06.05-084128"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/prefix      "ERO"
   :rdfa/uri         "http://purl.obolibrary.org/obo/ero.owl#"})

(def ADO
  "Alzheimer's Disease Ontology is a knowledge-based ontology that encompasses varieties of concepts related to Alzheimer'S Disease, structured by upper level Basic Formal Ontology(BFO). This Ontology is enriched by the interrelated entities that demonstrate the network of the understanding on Alzheimer's disease and can be readily applied for text mining."
  {:dc11/description
   "Alzheimer's Disease Ontology is a knowledge-based ontology that encompasses varieties of concepts related to Alzheimer'S Disease, structured by upper level Basic Formal Ontology(BFO). This Ontology is enriched by the interrelated entities that demonstrate the network of the understanding on Alzheimer's disease and can be readily applied for text mining.",
   :dc11/title "Alzheimer's Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ado.owl",
   :doap/bug-database
   "https://github.com/Fraunhofer-SCAI-Applied-Semantics/ADO/issues",
   :foaf/homepage "https://github.com/Fraunhofer-SCAI-Applied-Semantics/ADO",
   :idot/preferredPrefix "ADO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/bfo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ADO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ado.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ADO_",
   :sh/prefix "ADO"})

(def AEO
  "AEO is an ontology of anatomical structures that expands CARO, the Common Anatomy Reference Ontology"
  {:dc11/description
   "AEO is an ontology of anatomical structures that expands CARO, the Common Anatomy Reference Ontology",
   :dc11/title "Anatomical Entity Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/aeo.owl",
   :doap/bug-database
   "https://github.com/obophenotype/human-developmental-anatomy-ontology/issues",
   :foaf/homepage
   "https://github.com/obophenotype/human-developmental-anatomy-ontology/",
   :idot/preferredPrefix "AEO",
   :obofmd/activity_status "inactive",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "AEO",
   :rdfa/uri "http://purl.obolibrary.org/obo/aeo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/AEO_",
   :sh/prefix "AEO"})

(def AGRO
  "Ontology of agronomic practices, agronomic techniques, and agronomic variables used in agronomic experiments"
  {:dc11/description
   "Ontology of agronomic practices, agronomic techniques, and agronomic variables used in agronomic experiments",
   :dc11/title "Agronomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/agro.owl",
   :doap/bug-database "https://github.com/AgriculturalSemantics/agro/issues/",
   :foaf/homepage "https://github.com/AgriculturalSemantics/agro",
   :idot/preferredPrefix "AGRO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/foodon"
                       "http://purl.obolibrary.org/obo/po"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/peco"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/xco"
                       "http://purl.obolibrary.org/obo/to"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/uo"
                       "http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/iao"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "AGRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/agro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/AGRO_",
   :sh/prefix "AGRO"
   :rdf/ns-prefix-map {"obo"  "http://purl.obolibrary.org/obo/"
                       "owl"  "http://www.w3.org/2002/07/owl#"
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"
                       "foaf" "http://xmlns.com/foaf/0.1/"}})

(def AISM
  "The AISM contains terms used in insect biodiversity research for describing structures of the exoskeleton and the skeletomuscular system. It aims to serve as the basic backbone of generalized terms to be expanded with order-specific terminology."
  {:dc11/description
   "The AISM contains terms used in insect biodiversity research for describing structures of the exoskeleton and the skeletomuscular system. It aims to serve as the basic backbone of generalized terms to be expanded with order-specific terminology.",
   :dc11/title
   "Ontology for the Anatomy of the Insect SkeletoMuscular system (AISM)",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/aism.owl",
   :doap/bug-database "https://github.com/insect-morphology/aism/issues",
   :foaf/homepage "https://github.com/insect-morphology/aism",
   :idot/preferredPrefix "AISM",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/caro"
                       "http://purl.obolibrary.org/obo/bspo"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/bfo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "AISM",
   :rdfa/uri "http://purl.obolibrary.org/obo/aism.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/AISM_",
   :sh/prefix "AISM"})

(def AMPHX
  "An ontology for the development and anatomy of Amphioxus (Branchiostoma lanceolatum)."
  {:dc11/description
   "An ontology for the development and anatomy of Amphioxus (Branchiostoma lanceolatum).",
   :dc11/title "The Amphioxus Development and Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/amphx.owl",
   :doap/bug-database "https://github.com/EBISPOT/amphx_ontology/issues",
   :foaf/homepage "https://github.com/EBISPOT/amphx_ontology",
   :idot/preferredPrefix "AMPHX",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/uberon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "AMPHX",
   :rdfa/uri "http://purl.obolibrary.org/obo/amphx.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/AMPHX_",
   :sh/prefix "AMPHX"})

(def APO
  "A structured controlled vocabulary for the phenotypes of Ascomycete fungi"
  {:dc11/description
   "A structured controlled vocabulary for the phenotypes of Ascomycete fungi",
   :dc11/title "Ascomycete phenotype ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/apo.owl",
   :doap/bug-database
   "https://github.com/obophenotype/ascomycete-phenotype-ontology/issues",
   :foaf/homepage "http://www.yeastgenome.org/",
   :idot/preferredPrefix "APO",
   :obo/IAO_0000136 :obo/NCBITaxon_4890,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "APO",
   :rdfa/uri "http://purl.obolibrary.org/obo/apo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/APO_",
   :sh/prefix "APO"})

(def APOLLO_SV
  "Defines terms and relations necessary for interoperation between epidemic models and public health application software that interface with these models"
  {:dc11/description
   "Defines terms and relations necessary for interoperation between epidemic models and public health application software that interface with these models",
   :dc11/title "Apollo Structured Vocabulary",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/apollo_sv.owl",
   :doap/bug-database "https://github.com/ApolloDev/apollo-sv/issues",
   :foaf/homepage "https://github.com/ApolloDev/apollo-sv",
   :idot/preferredPrefix "APOLLO_SV",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "APOLLO_SV",
   :rdfa/uri "http://purl.obolibrary.org/obo/apollo_sv.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/APOLLO_SV_",
   :sh/prefix "APOLLO_SV"})

(def ARO
  "Antibiotic resistance genes and mutations"
  {:dc11/description "Antibiotic resistance genes and mutations",
   :dc11/title "Antibiotic Resistance Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/aro.owl",
   :doap/bug-database "https://github.com/arpcard/aro/issues",
   :doap/mailing-list "https://mailman.mcmaster.ca/mailman/listinfo/card-l",
   :foaf/homepage "https://github.com/arpcard/aro",
   :idot/preferredPrefix "ARO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ARO",
   :rdfa/uri "http://purl.obolibrary.org/obo/aro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ARO_",
   :sh/prefix "ARO"})

(def BCO
  "An ontology to support the interoperability of biodiversity data, including data on museum collections, environmental/metagenomic samples, and ecological surveys."
  {:dc11/description
   "An ontology to support the interoperability of biodiversity data, including data on museum collections, environmental/metagenomic samples, and ecological surveys.",
   :dc11/title "Biological Collections Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bco.owl",
   :doap/bug-database "https://github.com/BiodiversityOntologies/bco/issues",
   :foaf/homepage "https://github.com/BiodiversityOntologies/bco",
   :idot/preferredPrefix "BCO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "BCO",
   :rdfa/uri "http://purl.obolibrary.org/obo/bco.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/BCO_",
   :sh/prefix "BCO"})

(def BFO
  "The upper level ontology upon which OBO Foundry ontologies are built."
  {:dc11/description
   "The upper level ontology upon which OBO Foundry ontologies are built.",
   :dc11/title "Basic Formal Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bfo.owl",
   :doap/bug-database "https://github.com/BFO-ontology/BFO/issues",
   :doap/mailing-list "https://groups.google.com/forum/#!forum/bfo-discuss",
   :foaf/homepage "http://ifomis.org/bfo/",
   :idot/preferredPrefix "BFO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "BFO",
   :rdfa/uri "http://purl.obolibrary.org/obo/bfo.owl#",
   :rdfs/seeAlso "http://bioportal.bioontology.org/ontologies/BFO?p=classes",
   :sh/namespace "http://purl.obolibrary.org/obo/BFO_",
   :sh/prefix "BFO"})

(def BSPO
  "An ontology for representing spatial concepts, anatomical axes, gradients, regions, planes, sides, and surfaces"
  {:dc11/description
   "An ontology for representing spatial concepts, anatomical axes, gradients, regions, planes, sides, and surfaces",
   :dc11/title "Biological Spatial Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bspo.owl",
   :doap/bug-database
   "https://github.com/obophenotype/biological-spatial-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/biological-spatial-ontology",
   :idot/preferredPrefix "BSPO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "BSPO",
   :rdfa/uri "http://purl.obolibrary.org/obo/bspo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/BSPO_",
   :sh/prefix "BSPO"})

(def BTO
  "A structured controlled vocabulary for the source of an enzyme comprising tissues, cell lines, cell types and cell cultures."
  {:dc11/description
   "A structured controlled vocabulary for the source of an enzyme comprising tissues, cell lines, cell types and cell cultures.",
   :dc11/title "BRENDA tissue / enzyme source",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/bto.owl",
   :doap/bug-database "https://github.com/BRENDA-Enzymes/BTO/issues",
   :foaf/homepage "http://www.brenda-enzymes.org",
   :foaf/page "https://en.wikipedia.org/wiki/BRENDA_tissue_ontology",
   :idot/preferredPrefix "BTO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "BTO",
   :rdfa/uri "http://purl.obolibrary.org/obo/bto.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/BTO_",
   :sh/prefix "BTO"})

(def CARO
  "An upper level ontology to facilitate interoperability between existing anatomy ontologies for different species"
  {:dc11/description
   "An upper level ontology to facilitate interoperability between existing anatomy ontologies for different species",
   :dc11/title "Common Anatomy Reference Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/caro.owl",
   :doap/bug-database "https://github.com/obophenotype/caro/issues",
   :foaf/homepage "https://github.com/obophenotype/caro/",
   :idot/preferredPrefix "CARO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CARO",
   :rdfa/uri "http://purl.obolibrary.org/obo/caro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CARO_",
   :sh/prefix "CARO"})

(def CDAO
  "a formalization of concepts and relations relevant to evolutionary comparative analysis"
  {:dc11/description
   "a formalization of concepts and relations relevant to evolutionary comparative analysis",
   :dc11/title "Comparative Data Analysis Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cdao.owl",
   :doap/bug-database "https://github.com/evoinfo/cdao/issues",
   :foaf/homepage "https://github.com/evoinfo/cdao",
   :idot/preferredPrefix "CDAO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CDAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cdao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CDAO_",
   :sh/prefix "CDAO"})

(def CDNO
  "CDNO provides structured terminologies to describe nutritional attributes of material entities that contribute to human diet."
  {:dc11/description
   "CDNO provides structured terminologies to describe nutritional attributes of material entities that contribute to human diet.",
   :dc11/title "Compositional Dietary Nutrition Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cdno.owl",
   :doap/bug-database
   "https://github.com/Southern-Cross-Plant-Science/cdno/issues",
   :foaf/homepage "https://cdno.info/",
   :idot/preferredPrefix "CDNO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/chebi"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CDNO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cdno.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CDNO_",
   :sh/prefix "CDNO"})

(def CHEBI
  "A structured classification of molecular entities of biological interest focusing on 'small' chemical compounds."
  {:dc11/description
   "A structured classification of molecular entities of biological interest focusing on 'small' chemical compounds.",
   :dc11/title "Chemical Entities of Biological Interest",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/chebi.owl",
   :doap/bug-database "https://github.com/ebi-chebi/ChEBI/issues",
   :foaf/account :obo/chebit,
   :foaf/homepage "http://www.ebi.ac.uk/chebi",
   :foaf/page "http://www.ebi.ac.uk/chebi/init.do?toolBarForward=userManual",
   :idot/preferredPrefix "CHEBI",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CHEBI",
   :rdfa/uri "http://purl.obolibrary.org/obo/chebi.owl#",
   :rdfs/seeAlso
   "http://www.ebi.ac.uk/chebi/chebiOntology.do?treeView=true&chebiId=CHEBI:24431#graphView",
   :sh/namespace "http://purl.obolibrary.org/obo/CHEBI_",
   :sh/prefix "CHEBI"})

(def chebi
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "chebi",
   :rdfa/uri "http://purl.obolibrary.org/obo/chebi/"})

(def chebi1
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "chebi1",
   :rdfa/uri "http://purl.obolibrary.org/obo/chebi#2"})

(def chebi2
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "chebi2",
   :rdfa/uri "http://purl.obolibrary.org/obo/chebi#"})

(def chebi3
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "chebi3",
   :rdfa/uri "http://purl.obolibrary.org/obo/chebi#3"})

(def chebi4
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "chebi4",
   :rdfa/uri "http://purl.obolibrary.org/obo/chebi#1"})

(def CHEMINF
  "Includes terms for the descriptors commonly used in cheminformatics software applications and the algorithms which generate them."
  {:dc11/description
   "Includes terms for the descriptors commonly used in cheminformatics software applications and the algorithms which generate them.",
   :dc11/title "Chemical Information Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cheminf.owl",
   :doap/bug-database
   "https://github.com/semanticchemistry/semanticchemistry/issues",
   :doap/mailing-list
   "https://groups.google.com/forum/#!forum/cheminf-ontology",
   :foaf/homepage "https://github.com/semanticchemistry/semanticchemistry",
   :idot/preferredPrefix "CHEMINF",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CHEMINF",
   :rdfa/uri "http://purl.obolibrary.org/obo/cheminf.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CHEMINF_",
   :sh/prefix "CHEMINF"})

(def CHIRO
  "CHEBI provides a distinct role hierarchy. Chemicals in the structural hierarchy are connected via a 'has role' relation. CHIRO provides links from these roles to useful other classes in other ontologies. This will allow direct connection between chemical structures (small molecules, drugs) and what they do. This could be formalized using 'capable of', in the same way Uberon and the Cell Ontology link structures to processes."
  {:dc11/description
   "CHEBI provides a distinct role hierarchy. Chemicals in the structural hierarchy are connected via a 'has role' relation. CHIRO provides links from these roles to useful other classes in other ontologies. This will allow direct connection between chemical structures (small molecules, drugs) and what they do. This could be formalized using 'capable of', in the same way Uberon and the Cell Ontology link structures to processes.",
   :dc11/title "CHEBI Integrated Role Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/chiro.owl",
   :doap/bug-database "https://github.com/obophenotype/chiro/issues",
   :foaf/homepage "https://github.com/obophenotype/chiro",
   :idot/preferredPrefix "CHIRO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/mp"
                       "http://purl.obolibrary.org/obo/pr"
                       "http://purl.obolibrary.org/obo/hp"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/uberon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CHIRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/chiro#",
   :sh/namespace "http://purl.obolibrary.org/obo/CHIRO_",
   :sh/prefix "CHIRO"
   :rdf/ns-prefix-map {"CHIRO" "http://purl.obolibrary.org/obo/chiro.owl#",
                       "obo"   "http://purl.obolibrary.org/obo/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"}})

(def CHMO
  "CHMO, the chemical methods ontology, describes methods used to"
  {:dc11/description
   "CHMO, the chemical methods ontology, describes methods used to",
   :dc11/title "Chemical Methods Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/chmo.owl",
   :doap/bug-database "https://github.com/rsc-ontologies/rsc-cmo/issues",
   :doap/mailing-list "chemistry-ontologies@googlegroups.com",
   :foaf/homepage "https://github.com/rsc-ontologies/rsc-cmo",
   :idot/preferredPrefix "CHMO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CHMO",
   :rdfa/uri "http://purl.obolibrary.org/obo/chmo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CHMO_",
   :sh/prefix "CHMO"})

(def CIDO
  "The Coronavirus Infectious Disease Ontology (CIDO) aims to ontologically represent and standardize various aspects of coronavirus infectious diseases, including their etiology, transmission, epidemiology, pathogenesis, diagnosis, prevention, and treatment."
  {:dc11/description
   "The Coronavirus Infectious Disease Ontology (CIDO) aims to ontologically represent and standardize various aspects of coronavirus infectious diseases, including their etiology, transmission, epidemiology, pathogenesis, diagnosis, prevention, and treatment.",
   :dc11/title "Coronavirus Infectious Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cido.owl",
   :doap/bug-database "https://github.com/cido-ontology/cido/issues",
   :doap/mailing-list "cido-discuss@googlegroups.com",
   :foaf/homepage "https://github.com/cido-ontology/cido",
   :idot/preferredPrefix "CIDO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CIDO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cido.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CIDO_",
   :sh/prefix "CIDO"})

(def CIO
  "An ontology to capture confidence information about annotations."
  {:dc11/description
   "An ontology to capture confidence information about annotations.",
   :dc11/title "Confidence Information Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cio.owl",
   :doap/bug-database
   "https://github.com/BgeeDB/confidence-information-ontology",
   :foaf/homepage "https://github.com/BgeeDB/confidence-information-ontology",
   :idot/preferredPrefix "CIO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CIO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cio.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CIO_",
   :sh/prefix "CIO"})

(def CL
  "The Cell Ontology is a structured controlled vocabulary for cell types in animals."
  {:dc11/description
   "The Cell Ontology is a structured controlled vocabulary for cell types in animals.",
   :dc11/title "Cell Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cl.owl",
   :doap/bug-database "https://github.com/obophenotype/cell-ontology/issues",
   :doap/mailing-list "https://groups.google.com/g/cl_edit",
   :foaf/homepage "https://obophenotype.github.io/cell-ontology/",
   :idot/preferredPrefix "CL",
   :obo/IAO_0000136 :obo/NCBITaxon_33208,
   :obofmd/activity_status "active",
   :obofmd/continuous_integration_server
   "http://build.berkeleybop.org/job/build-cl/",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/pr"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CL",
   :rdfa/uri "http://purl.obolibrary.org/obo/cl.owl#",
   :rdfs/label "Cell Ontology",
   :sh/namespace "http://purl.obolibrary.org/obo/CL_",
   :sh/prefix "CL"})

(def CLAO
  "CLAO is an ontology of anatomical terms employed in morphological descriptions for the Class Collembola (Arthropoda: Hexapoda)."
  {:dc11/description
   "CLAO is an ontology of anatomical terms employed in morphological descriptions for the Class Collembola (Arthropoda: Hexapoda).",
   :dc11/title "Collembola Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/clao.owl",
   :doap/bug-database "https://github.com/luis-gonzalez-m/Collembola/issues",
   :foaf/homepage "https://github.com/luis-gonzalez-m/Collembola",
   :idot/preferredPrefix "CLAO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ro"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CLAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/clao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CLAO_",
   :sh/prefix "CLAO"})

(def CLO
  "An ontology to standardize and integrate cell line information and to support computer-assisted reasoning."
  {:dc11/description
   "An ontology to standardize and integrate cell line information and to support computer-assisted reasoning.",
   :dc11/title "Cell Line Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/clo.owl",
   :doap/bug-database "https://github.com/CLO-Ontology/CLO/issues",
   :foaf/homepage "http://www.clo-ontology.org",
   :idot/preferredPrefix "CLO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/doid"
                       "http://purl.obolibrary.org/obo/cl"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CLO",
   :rdfa/uri "http://purl.obolibrary.org/obo/clo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CLO_",
   :sh/prefix "CLO"})

(def CLYH
  "The Clytia hemisphaerica Development and Anatomy Ontology (CLYH) describes the anatomical and developmental features of the Clytia hemisphaerica life cycle."
  {:dc11/description
   "The Clytia hemisphaerica Development and Anatomy Ontology (CLYH) describes the anatomical and developmental features of the Clytia hemisphaerica life cycle.",
   :dc11/title "Clytia hemisphaerica Development and Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/clyh.owl",
   :doap/bug-database "https://github.com/EBISPOT/clyh_ontology/issues",
   :foaf/homepage "https://github.com/EBISPOT/clyh_ontology",
   :idot/preferredPrefix "CLYH",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/iao"
                       "http://purl.obolibrary.org/obo/ro"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CLYH",
   :rdfa/uri "http://purl.obolibrary.org/obo/clyh.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CLYH_",
   :sh/prefix "CLYH"})

(def CMO
  "Morphological and physiological measurement records generated from clinical and model organism research and health programs."
  {:dc11/description
   "Morphological and physiological measurement records generated from clinical and model organism research and health programs.",
   :dc11/title "Clinical measurement ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cmo.owl",
   :doap/bug-database
   "https://github.com/rat-genome-database/CMO-Clinical-Measurement-Ontology/issues",
   :foaf/homepage "http://rgd.mcw.edu/rgdweb/ontology/search.html",
   :foaf/page "https://download.rgd.mcw.edu/ontology/clinical_measurement/",
   :idot/preferredPrefix "CMO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CMO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cmo.owl#",
   :rdfs/seeAlso
   "http://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=CMO:0000000",
   :sh/namespace "http://purl.obolibrary.org/obo/CMO_",
   :sh/prefix "CMO"})

(def COB
  "COB brings together key terms from a wide range of OBO projects to improve interoperability."
  {:dc11/description
   "COB brings together key terms from a wide range of OBO projects to improve interoperability.",
   :dc11/title "Core Ontology for Biology and Biomedicine",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cob.owl",
   :doap/bug-database "https://github.com/OBOFoundry/COB/issues",
   :foaf/homepage "https://obofoundry.org/COB/",
   :idot/preferredPrefix "COB",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "COB",
   :rdfa/uri "http://purl.obolibrary.org/obo/cob.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/COB_",
   :sh/prefix "COB"})

(def COLAO
  "The Coleoptera Anatomy Ontology contains terms used for describing the anatomy and phenotype of beetles in biodiversity research. It has been built using the Ontology Develoment Kit, with the Ontology for the Anatomy of the Insect Skeleto-Muscular system (AISM) as a backbone."
  {:dc11/description
   "The Coleoptera Anatomy Ontology contains terms used for describing the anatomy and phenotype of beetles in biodiversity research. It has been built using the Ontology Develoment Kit, with the Ontology for the Anatomy of the Insect Skeleto-Muscular system (AISM) as a backbone.",
   :dc11/title "Coleoptera Anatomy Ontology (COLAO)",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/colao.owl",
   :doap/bug-database "https://github.com/insect-morphology/colao/issues",
   :foaf/homepage "https://github.com/insect-morphology/colao",
   :idot/preferredPrefix "COLAO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/caro"
                       "http://purl.obolibrary.org/obo/aism"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/bspo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "COLAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/colao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/COLAO_",
   :sh/prefix "COLAO"})

(def CRO
  "A classification of the diverse roles performed in the work leading to a published research output in the sciences. Its purpose to provide transparency in contributions to scholarly published work, to enable improved systems of attribution, credit, and accountability."
  {:dc11/description
   "A classification of the diverse roles performed in the work leading to a published research output in the sciences. Its purpose to provide transparency in contributions to scholarly published work, to enable improved systems of attribution, credit, and accountability.",
   :dc11/title "Contributor Role Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cro.owl",
   :doap/bug-database
   "https://github.com/data2health/contributor-role-ontology/issues",
   :foaf/homepage "https://github.com/data2health/contributor-role-ontology",
   :idot/preferredPrefix "CRO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CRO_",
   :sh/prefix "CRO"})

(def CTENO
  "An anatomical and developmental ontology for ctenophores (Comb Jellies)"
  {:dc11/description
   "An anatomical and developmental ontology for ctenophores (Comb Jellies)",
   :dc11/title "Ctenophore Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cteno.owl",
   :doap/bug-database
   "https://github.com/obophenotype/ctenophore-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/ctenophore-ontology",
   :idot/preferredPrefix "CTENO",
   :obo/IAO_0000136 :obo/NCBITaxon_10197,
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/ro"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CTENO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cteno.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CTENO_",
   :sh/prefix "CTENO"})

(def CTO
  "The core Ontology of Clinical Trials (CTO) will serve as a structured resource integrating basic terms and concepts in the context of clinical trials. Thereby covering clinicaltrails.gov. CoreCTO will serve as a basic ontology to generate extended versions for specific applications such as annotation of variables in study documents from clinical trials."
  {:dc11/description
   "The core Ontology of Clinical Trials (CTO) will serve as a structured resource integrating basic terms and concepts in the context of clinical trials. Thereby covering clinicaltrails.gov. CoreCTO will serve as a basic ontology to generate extended versions for specific applications such as annotation of variables in study documents from clinical trials.",
   :dc11/title "CTO: Core Ontology of Clinical Trials",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cto.owl",
   :doap/bug-database "https://github.com/ClinicalTrialOntology/CTO/issues",
   :foaf/homepage "https://github.com/ClinicalTrialOntology/CTO/",
   :idot/preferredPrefix "CTO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CTO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cto.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CTO_",
   :sh/prefix "CTO"})

(def CVDO
  "An ontology to describe entities related to cardiovascular diseases"
  {:dc11/description
   "An ontology to describe entities related to cardiovascular diseases",
   :dc11/title "Cardiovascular Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/cvdo.owl",
   :doap/bug-database "https://github.com/OpenLHS/CVDO/issues",
   :foaf/homepage "https://github.com/OpenLHS/CVDO",
   :idot/preferredPrefix "CVDO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "CVDO",
   :rdfa/uri "http://purl.obolibrary.org/obo/cvdo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/CVDO_",
   :sh/prefix "CVDO"})

(def DDANAT
  "A structured controlled vocabulary of the anatomy of the slime-mold Dictyostelium discoideum"
  {:dc11/description
   "A structured controlled vocabulary of the anatomy of the slime-mold Dictyostelium discoideum",
   :dc11/title "Dictyostelium discoideum anatomy",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ddanat.owl",
   :doap/bug-database "https://github.com/dictyBase/migration-data/issues",
   :foaf/account :obo/dictybase,
   :foaf/homepage "http://dictybase.org/",
   :idot/preferredPrefix "DDANAT",
   :obo/IAO_0000136 :obo/NCBITaxon_44689,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "DDANAT",
   :rdfa/uri "http://purl.obolibrary.org/obo/ddanat.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/DDANAT_",
   :sh/prefix "DDANAT"})

(def DDPHENO
  "A structured controlled vocabulary of phenotypes of the slime-mould <i>Dictyostelium discoideum</i>."
  {:dc11/description
   "A structured controlled vocabulary of phenotypes of the slime-mould <i>Dictyostelium discoideum</i>.",
   :dc11/title "Dictyostelium discoideum phenotype ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ddpheno.owl",
   :doap/bug-database
   "https://github.com/obophenotype/dicty-phenotype-ontology/issues",
   :foaf/account :obo/dictybase,
   :foaf/homepage "http://dictybase.org/",
   :idot/preferredPrefix "DDPHENO",
   :obo/IAO_0000136 :obo/NCBITaxon_44689,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "DDPHENO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ddpheno.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/DDPHENO_",
   :sh/prefix "DDPHENO"})

(def DIDEO
  "The Potential Drug-drug Interaction and Potential Drug-drug Interaction Evidence Ontology"
  {:dc11/description
   "The Potential Drug-drug Interaction and Potential Drug-drug Interaction Evidence Ontology",
   :dc11/title
   "Drug-drug Interaction and Drug-drug Interaction Evidence Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/dideo.owl",
   :doap/bug-database "https://github.com/DIDEO/DIDEO/issues",
   :foaf/homepage "https://github.com/DIDEO/DIDEO",
   :idot/preferredPrefix "DIDEO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "DIDEO",
   :rdfa/uri "http://purl.obolibrary.org/obo/dideo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/DIDEO_",
   :sh/prefix "DIDEO"})

(def DISDRIV
  "Ontology for drivers and triggers of human diseases, built to classify ExO ontology exposure stressors. An application ontology. Built in collaboration with EnvO, ExO, ECTO and ChEBI."
  {:dc11/description
   "Ontology for drivers and triggers of human diseases, built to classify ExO ontology exposure stressors. An application ontology. Built in collaboration with EnvO, ExO, ECTO and ChEBI.",
   :dc11/title "Disease Drivers Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/disdriv.owl",
   :doap/bug-database
   "https://github.com/DiseaseOntology/DiseaseDriversOntology/issues",
   :foaf/account :obo/diseaseontology,
   :foaf/homepage "http://www.disease-ontology.org",
   :idot/preferredPrefix "DISDRIV",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "DISDRIV",
   :rdfa/uri "http://purl.obolibrary.org/obo/disdriv.owl#",
   :rdfs/seeAlso "http://www.disease-ontology.org/",
   :sh/namespace "http://purl.obolibrary.org/obo/DISDRIV_",
   :sh/prefix "DISDRIV"})

(def DOID
  "An ontology for describing the classification of human diseases organized by etiology."
  {:dc11/description
   "An ontology for describing the classification of human diseases organized by etiology.",
   :dc11/title "Human Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/doid.owl",
   :doap/bug-database
   "https://github.com/DiseaseOntology/HumanDiseaseOntology/issues",
   :foaf/account :obo/diseaseontology,
   :foaf/homepage "http://www.disease-ontology.org",
   :idot/preferredPrefix "DOID",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "DOID",
   :rdfa/uri "http://purl.obolibrary.org/obo/doid.owl#",
   :rdfs/seeAlso "http://www.disease-ontology.org/",
   :sh/namespace "http://purl.obolibrary.org/obo/DOID_",
   :sh/prefix "DOID"})

(def DRON
  "An ontology to support comparative effectiveness researchers studying claims data."
  {:dc11/description
   "An ontology to support comparative effectiveness researchers studying claims data.",
   :dc11/title "The Drug Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/dron.owl",
   :doap/bug-database "https://github.com/ufbmi/dron/issues",
   :foaf/homepage "https://github.com/ufbmi/dron",
   :idot/preferredPrefix "DRON",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "DRON",
   :rdfa/uri "http://purl.obolibrary.org/obo/dron.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/DRON_",
   :sh/prefix "DRON"})

(def DUO
  "DUO is an ontology which represent data use conditions."
  {:dc11/description "DUO is an ontology which represent data use conditions.",
   :dc11/title "Data Use Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/duo.owl",
   :doap/bug-database "https://github.com/EBISPOT/DUO/issues",
   :foaf/homepage "https://github.com/EBISPOT/DUO",
   :idot/preferredPrefix "DUO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/iao"
                       "http://purl.obolibrary.org/obo/bfo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "DUO",
   :rdfa/uri "http://purl.obolibrary.org/obo/duo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/DUO_",
   :sh/prefix "DUO"})

(def ECAO
  "An ontology for the development and anatomy of the different species of the phylum Echinodermata (NCBITaxon:7586)."
  {:dc11/description
   "An ontology for the development and anatomy of the different species of the phylum Echinodermata (NCBITaxon:7586).",
   :dc11/title "The Echinoderm Anatomy and Development Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ecao.owl",
   :doap/bug-database
   "https://github.com/echinoderm-ontology/ecao_ontology/issues",
   :foaf/homepage "https://github.com/echinoderm-ontology/ecao_ontology",
   :idot/preferredPrefix "ECAO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/cl"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/uberon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ECAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ecao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ECAO_",
   :sh/prefix "ECAO"})

(def ECO
  "An ontology for experimental and other evidence statements."
  {:dc11/description
   "An ontology for experimental and other evidence statements.",
   :dc11/title "Evidence ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/eco.owl",
   :disco/fundedBy "https://www.nsf.gov/awardsearch/showAward?AWD_ID=1458400",
   :doap/bug-database
   "https://github.com/evidenceontology/evidenceontology/issues",
   :foaf/homepage "https://www.evidenceontology.org",
   :idot/preferredPrefix "ECO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ECO",
   :rdfa/uri "http://purl.obolibrary.org/obo/eco.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ECO_",
   :sh/prefix "ECO"})

(def ECOCORE
  "Ecocore is a community ontology for the concise and controlled description of ecological traits of organisms."
  {:dc11/description
   "Ecocore is a community ontology for the concise and controlled description of ecological traits of organisms.",
   :dc11/title "An ontology of core ecological entities",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ecocore.owl",
   :doap/bug-database "https://github.com/EcologicalSemantics/ecocore/issues",
   :foaf/homepage "https://github.com/EcologicalSemantics/ecocore",
   :idot/preferredPrefix "ECOCORE",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/pco"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/iao"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/po"
                       "http://purl.obolibrary.org/obo/uberon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ECOCORE",
   :rdfa/uri "http://purl.obolibrary.org/obo/ecocore.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ECOCORE_",
   :sh/prefix "ECOCORE"})

(def ECTO
  "ECTO describes exposures to experimental treatments of plants and model organisms (e.g. exposures to modification of diet, lighting levels, temperature); exposures of humans or any other organisms to stressors through a variety of routes, for purposes of public health, environmental monitoring etc, stimuli, natural and experimental, any kind of environmental condition or change in condition that can be experienced by an organism or population of organisms on earth. The scope is very general and can include for example plant treatment regimens, as well as human clinical exposures (although these may better be handled by a more specialized ontology)."
  {:dc11/description
   "ECTO describes exposures to experimental treatments of plants and model organisms (e.g. exposures to modification of diet, lighting levels, temperature); exposures of humans or any other organisms to stressors through a variety of routes, for purposes of public health, environmental monitoring etc, stimuli, natural and experimental, any kind of environmental condition or change in condition that can be experienced by an organism or population of organisms on earth. The scope is very general and can include for example plant treatment regimens, as well as human clinical exposures (although these may better be handled by a more specialized ontology).",
   :dc11/title "Environmental conditions, treatments and exposures ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ecto.owl",
   :doap/bug-database
   "https://github.com/EnvironmentOntology/environmental-exposure-ontology/issues",
   :foaf/homepage
   "https://github.com/EnvironmentOntology/environmental-exposure-ontology",
   :idot/preferredPrefix "ECTO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/nbo"
                       "http://purl.obolibrary.org/obo/xco"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/ncit"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/exo"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/maxo"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/iao"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ECTO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ecto.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ECTO_",
   :sh/prefix "ECTO"})

(def EMAPA
  "An ontology for mouse anatomy covering embryonic development and postnatal stages."
  {:dc11/description
   "An ontology for mouse anatomy covering embryonic development and postnatal stages.",
   :dc11/title "Mouse Developmental Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/emapa.owl",
   :doap/bug-database
   "https://github.com/obophenotype/mouse-anatomy-ontology/issues",
   :foaf/homepage "http://www.informatics.jax.org/expression.shtml",
   :idot/preferredPrefix "EMAPA",
   :obo/IAO_0000136 :obo/NCBITaxon_10088,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "EMAPA",
   :rdfa/uri "http://purl.obolibrary.org/obo/emapa.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/EMAPA_",
   :sh/prefix "EMAPA"})

(def ENVO
  "An ontology of environmental systems, components, and processes."
  {:dc11/description
   "An ontology of environmental systems, components, and processes.",
   :dc11/title "Environment Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/envo.owl",
   :doap/bug-database "https://github.com/EnvironmentOntology/envo/issues/",
   :foaf/homepage "http://environmentontology.org/",
   :foaf/page "https://github.com/EnvironmentOntology/envo",
   :idot/preferredPrefix "ENVO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/po"
                       "http://purl.obolibrary.org/obo/pco"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/foodon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ENVO",
   :rdfa/uri "http://purl.obolibrary.org/obo/envo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ENVO_",
   :sh/prefix "ENVO"})

(def EPIO
  "A application driven Epilepsy Ontology with official terms from the ILAE."
  {:dc11/description
   "A application driven Epilepsy Ontology with official terms from the ILAE.",
   :dc11/title "Epilepsy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/epio.owl",
   :doap/bug-database "https://github.com/SCAI-BIO/EpilepsyOntology/issues",
   :foaf/homepage "https://github.com/SCAI-BIO/EpilepsyOntology",
   :idot/preferredPrefix "EPIO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/bfo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "EPIO",
   :rdfa/uri "http://purl.obolibrary.org/obo/epio.owl#",
   :rdfs/label "Epilepsy Ontology",
   :sh/namespace "http://purl.obolibrary.org/obo/EPIO_",
   :sh/prefix "EPIO"})

(def EUPATH
  "An ontology is developed to support Eukaryotic Pathogen, Host & Vector Genomics Resource (VEuPathDB; https://veupathdb.org)."
  {:dc11/description
   "An ontology is developed to support Eukaryotic Pathogen, Host & Vector Genomics Resource (VEuPathDB; https://veupathdb.org).",
   :dc11/title "VEuPathDB ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/eupath.owl",
   :doap/bug-database
   "https://github.com/VEuPathDB-ontology/VEuPathDB-ontology/issues",
   :foaf/homepage "https://github.com/VEuPathDB-ontology/VEuPathDB-ontology",
   :idot/preferredPrefix "EUPATH",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "EUPATH",
   :rdfa/uri "http://purl.obolibrary.org/obo/eupath.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/EUPATH_",
   :sh/prefix "EUPATH"})

(def ExO
  "Vocabularies for describing exposure data to inform understanding of environmental health."
  {:dc11/description
   "Vocabularies for describing exposure data to inform understanding of environmental health.",
   :dc11/title "Exposure ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/exo.owl",
   :doap/bug-database "https://github.com/CTDbase/exposure-ontology/issues",
   :foaf/homepage "https://github.com/CTDbase/exposure-ontology",
   :idot/preferredPrefix "ExO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ExO",
   :rdfa/uri "http://purl.obolibrary.org/obo/exo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ExO_",
   :sh/prefix "ExO"})

(def FAO
  "A structured controlled vocabulary for the anatomy of fungi."
  {:dc11/description
   "A structured controlled vocabulary for the anatomy of fungi.",
   :dc11/title "Fungal gross anatomy",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fao.owl",
   :doap/bug-database
   "https://github.com/obophenotype/fungal-anatomy-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/fungal-anatomy-ontology/",
   :idot/preferredPrefix "FAO",
   :obo/IAO_0000136 :obo/NCBITaxon_4751,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/fao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FAO_",
   :sh/prefix "FAO"})

(def FBbi
  "A structured controlled vocabulary of sample preparation, visualization and imaging methods used in biomedical research."
  {:dc11/description
   "A structured controlled vocabulary of sample preparation, visualization and imaging methods used in biomedical research.",
   :dc11/title "Biological Imaging Methods Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbbi.owl",
   :doap/bug-database
   "https://github.com/CRBS/Biological_Imaging_Methods_Ontology/issues",
   :foaf/homepage "http://cellimagelibrary.org/",
   :idot/preferredPrefix "FBbi",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FBbi",
   :rdfa/uri "http://purl.obolibrary.org/obo/fbbi.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FBbi_",
   :sh/prefix "FBbi"})

(def FBbt
  "An ontology representing the gross anatomy of Drosophila melanogaster."
  {:dc11/description
   "An ontology representing the gross anatomy of Drosophila melanogaster.",
   :dc11/title "Drosophila gross anatomy",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbbt.owl",
   :doap/bug-database "http://purl.obolibrary.org/obo/fbbt/tracker",
   :foaf/homepage :obo/fbbt,
   :idot/preferredPrefix "FBbt",
   :obo/IAO_0000136 :obo/NCBITaxon_7227,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FBbt",
   :rdfa/uri "http://purl.obolibrary.org/obo/fbbt.owl#",
   :rdfs/seeAlso
   ["http://flybase.org/.bin/cvreport.html?cvterm=FBbt:10000000"
    "http://www.virtualflybrain.org/site/stacks/index.htm?add=FBbt:00007401"
    "http://bioportal.bioontology.org/ontologies/FB-BT?p=classes"],
   :sh/namespace "http://purl.obolibrary.org/obo/FBbt_",
   :sh/prefix "FBbt"})

(def FBcv
  "A structured controlled vocabulary used for various aspects of annotation by FlyBase."
  {:dc11/description
   "A structured controlled vocabulary used for various aspects of annotation by FlyBase.",
   :dc11/title "FlyBase Controlled Vocabulary",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbcv.owl",
   :doap/bug-database
   "https://github.com/FlyBase/flybase-controlled-vocabulary/issues",
   :foaf/homepage :obo/fbcv,
   :idot/preferredPrefix "FBcv",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FBcv",
   :rdfa/uri "http://purl.obolibrary.org/obo/fbcv.owl#",
   :rdfs/seeAlso "http://flybase.org/.bin/cvreport.html?cvterm=FBcv:0000013",
   :sh/namespace "http://purl.obolibrary.org/obo/FBcv_",
   :sh/prefix "FBcv"})

(def FBcv
  "A structured controlled vocabulary used for various aspects of annotation by FlyBase."
  {:dc11/description
   "A structured controlled vocabulary used for various aspects of annotation by FlyBase.",
   :dc11/title "FlyBase Controlled Vocabulary",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbcv.owl",
   :doap/bug-database
   "https://github.com/FlyBase/flybase-controlled-vocabulary/issues",
   :foaf/homepage :obo/fbcv,
   :idot/preferredPrefix "FBcv",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FBcv",
   :rdfa/uri "http://purl.obolibrary.org/obo/fbcv.owl#",
   :rdfs/seeAlso "http://flybase.org/.bin/cvreport.html?cvterm=FBcv:0000013",
   :sh/namespace "http://purl.obolibrary.org/obo/FBcv_",
   :sh/prefix "FBcv"})

(def FBdv
  "A structured controlled vocabulary of the development of Drosophila melanogaster."
  {:dc11/description
   "A structured controlled vocabulary of the development of Drosophila melanogaster.",
   :dc11/title "Drosophila development",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fbdv.owl",
   :doap/bug-database "http://purl.obolibrary.org/obo/fbdv/tracker",
   :foaf/homepage :obo/fbdv,
   :idot/preferredPrefix "FBdv",
   :obo/IAO_0000136 :obo/NCBITaxon_7227,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FBdv",
   :rdfa/uri "http://purl.obolibrary.org/obo/fbdv.owl#",
   :rdfs/seeAlso "http://flybase.org/.bin/cvreport.html?cvterm=FBdv:00007008",
   :sh/namespace "http://purl.obolibrary.org/obo/FBdv_",
   :sh/prefix "FBdv"})

(def FIDEO
  "Food-Drug interactions automatically extracted from scientific literature"
  {:dc11/description
   "Food-Drug interactions automatically extracted from scientific literature",
   :dc11/title "Food Interactions with Drugs Evidence Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fideo.owl",
   :doap/bug-database "https://gitub.u-bordeaux.fr/erias/fideo/issues",
   :foaf/homepage "https://gitub.u-bordeaux.fr/erias/fideo",
   :idot/preferredPrefix "FIDEO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FIDEO",
   :rdfa/uri "http://purl.obolibrary.org/obo/fideo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FIDEO_",
   :sh/prefix "FIDEO"})

(def FLOPO
  "Traits and phenotypes of flowering plants occurring in digitized Floras"
  {:dc11/description
   "Traits and phenotypes of flowering plants occurring in digitized Floras",
   :dc11/title "Flora Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/flopo.owl",
   :doap/bug-database
   "https://github.com/flora-phenotype-ontology/flopoontology/issues",
   :foaf/homepage "https://github.com/flora-phenotype-ontology/flopoontology",
   :idot/preferredPrefix "FLOPO",
   :obo/IAO_0000136 :obo/NCBITaxon_33090,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FLOPO",
   :rdfa/uri "http://purl.obolibrary.org/obo/flopo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FLOPO_",
   :sh/prefix "FLOPO"})

(def FMA
  "This is currently a slimmed down version of FMA"
  {:dc11/description "This is currently a slimmed down version of FMA",
   :dc11/title "Foundational Model of Anatomy Ontology (subset)",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fma.owl",
   :doap/bug-database "https://bitbucket.org/uwsig/fma/issues",
   :foaf/homepage "http://si.washington.edu/projects/fma",
   :foaf/page "http://en.wikipedia.org/wiki/Foundational_Model_of_Anatomy",
   :idot/preferredPrefix "FMA",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "inactive",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FMA",
   :rdfa/uri "http://purl.obolibrary.org/obo/fma.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FMA_",
   :sh/prefix "FMA"})

(def FOBI
  "FOBI (Food-Biomarker Ontology) is an ontology to represent food intake data and associate it with metabolomic data"
  {:dc11/description
   "FOBI (Food-Biomarker Ontology) is an ontology to represent food intake data and associate it with metabolomic data",
   :dc11/title "Food-Biomarker Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fobi.owl",
   :doap/bug-database
   "https://github.com/pcastellanoescuder/FoodBiomarkerOntology/issues",
   :foaf/homepage "https://github.com/pcastellanoescuder/FoodBiomarkerOntology",
   :idot/preferredPrefix "FOBI",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/foodon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FOBI",
   :rdfa/uri "http://purl.obolibrary.org/obo/fobi.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FOBI_",
   :sh/prefix "FOBI"})

(def FOODON
  "A broadly scoped ontology representing entities which bear a “food role”. It encompasses materials in natural ecosystems and agriculture that are consumed by humans and domesticated animals. This includes any generic (unbranded) raw or processed food material found in processing plants, markets, stores or food distribution points. FoodOn also imports nutritional component and dietary pattern terms from other OBO Foundry ontologies to support interoperability in diet and nutrition research"
  {:dc11/description
   "A broadly scoped ontology representing entities which bear a “food role”. It encompasses materials in natural ecosystems and agriculture that are consumed by humans and domesticated animals. This includes any generic (unbranded) raw or processed food material found in processing plants, markets, stores or food distribution points. FoodOn also imports nutritional component and dietary pattern terms from other OBO Foundry ontologies to support interoperability in diet and nutrition research",
   :dc11/title "Food Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/foodon.owl",
   :doap/bug-database "https://github.com/FoodOntology/foodon/issues/",
   :foaf/homepage "https://foodon.org/",
   :idot/preferredPrefix "FOODON",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/eo"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/ncbitaxon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FOODON",
   :rdfa/uri "http://purl.obolibrary.org/obo/foodon.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FOODON_",
   :sh/prefix "FOODON"})

(def FOVT
  "FuTRES Ontology of Vertebrate Traits is an application ontology used to convert vertebrate trait data in spreadsheet to triples. FOVT leverages the BioCollections Ontology (BCO) to link observations of individual specimens to their trait values. Traits are defined in the Ontology of Biological Attributes (OBA)."
  {:dc11/description
   "FuTRES Ontology of Vertebrate Traits is an application ontology used to convert vertebrate trait data in spreadsheet to triples. FOVT leverages the BioCollections Ontology (BCO) to link observations of individual specimens to their trait values. Traits are defined in the Ontology of Biological Attributes (OBA).",
   :dc11/title "FuTRES Ontology of Vertebrate Traits",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fovt.owl",
   :doap/bug-database "https://github.com/futres/fovt/issues",
   :foaf/homepage "https://github.com/futres/fovt",
   :idot/preferredPrefix "FOVT",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/iao"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/oba"
                       "http://purl.obolibrary.org/obo/bco"
                       "http://purl.obolibrary.org/obo/bspo"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/bfo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FOVT",
   :rdfa/uri "http://purl.obolibrary.org/obo/fovt.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FOVT_",
   :sh/prefix "FOVT"})

(def FYPO
  "FYPO is a formal ontology of phenotypes observed in fission yeast."
  {:dc11/description
   "FYPO is a formal ontology of phenotypes observed in fission yeast.",
   :dc11/title "Fission Yeast Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/fypo.owl",
   :doap/bug-database "https://github.com/pombase/fypo/issues",
   :foaf/homepage "https://github.com/pombase/fypo",
   :idot/preferredPrefix "FYPO",
   :obo/IAO_0000136 :obo/NCBITaxon_4896,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "FYPO",
   :rdfa/uri "http://purl.obolibrary.org/obo/fypo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/FYPO_",
   :sh/prefix "FYPO"})

(def GECKO
  "An ontology to represent genomics cohort attributes"
  {:dc11/description     "An ontology to represent genomics cohort attributes",
   :dc11/title           "Genomics Cohorts Knowledge Ontology",
   :dcat/downloadURL     "http://purl.obolibrary.org/obo/gecko.owl",
   :doap/bug-database    "https://github.com/IHCC-cohorts/GECKO/issues",
   :foaf/homepage        "https://github.com/IHCC-cohorts/GECKO",
   :idot/preferredPrefix "GECKO",
   :obofmd/activity_status "active",
   :rdf/type             :rdfa/PrefixMapping,
   :rdfa/prefix          "GECKO",
   :rdfa/uri             "http://purl.obolibrary.org/obo/gecko.owl#",
   :sh/namespace         "http://purl.obolibrary.org/obo/GECKO_",
   :sh/prefix            "GECKO"})

(def GENEPIO
  "The Genomic Epidemiology Ontology (GenEpiO) covers vocabulary necessary to identify, document and research foodborne pathogens and associated outbreaks."
  {:dc11/description
   "The Genomic Epidemiology Ontology (GenEpiO) covers vocabulary necessary to identify, document and research foodborne pathogens and associated outbreaks.",
   :dc11/title "Genomic Epidemiology Ontology",
   :dcat/downloadURL "https://raw.githubusercontent.com/GenEpiO/genepio/master/src/ontology/genepio-merged.owl",
   :doap/bug-database "https://github.com/GenEpiO/genepio/issues/",
   :foaf/homepage "http://genepio.org/",
   :foaf/page "https://github.com/GenEpiO/genepio",
   :idot/preferredPrefix "GENEPIO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/po"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/ro"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "GENEPIO",
   :rdfa/uri "http://purl.obolibrary.org/obo/genepio.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/GENEPIO_",
   :sh/prefix "GENEPIO"})

(def GENO
  "An integrated ontology for representing the genetic variations described in genotypes, and their causal relationships to phenotype and diseases."
  {:dc11/description
   "An integrated ontology for representing the genetic variations described in genotypes, and their causal relationships to phenotype and diseases.",
   :dc11/title "Genotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/geno.owl",
   :doap/bug-database
   "https://github.com/monarch-initiative/GENO-ontology/issues",
   :foaf/homepage "https://github.com/monarch-initiative/GENO-ontology/",
   :idot/preferredPrefix "GENO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "GENO",
   :rdfa/uri "http://purl.obolibrary.org/obo/geno.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/GENO_",
   :sh/prefix "GENO"})

(def GEO
  "An ontology of geographical entities"
  {:dc11/description "An ontology of geographical entities",
   :dc11/title "Geographical Entity Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/geo.owl",
   :doap/bug-database
   "https://github.com/ufbmi/geographical-entity-ontology/issues",
   :foaf/homepage "https://github.com/ufbmi/geographical-entity-ontology/wiki",
   :idot/preferredPrefix "GEO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "GEO",
   :rdfa/uri "http://purl.obolibrary.org/obo/geo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/GEO_",
   :sh/prefix "GEO"})

(def GNO
  "GlyTouCan provides stable accessions for glycans described at varyious degrees of characterization, including compositions (no linkage) and topologies (no carbon bond positions or anomeric configurations). GNOme organizes these stable accessions for interative browsing, for text-based searching, and for automated reasoning with well-defined characterization levels."
  {:dc11/description
   "GlyTouCan provides stable accessions for glycans described at varyious degrees of characterization, including compositions (no linkage) and topologies (no carbon bond positions or anomeric configurations). GNOme organizes these stable accessions for interative browsing, for text-based searching, and for automated reasoning with well-defined characterization levels.",
   :dc11/title "Glycan Naming and Subsumption Ontology (GNOme)",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/gno.owl",
   :doap/bug-database "https://github.com/glygen-glycan-data/GNOme/issues",
   :foaf/homepage "https://gnome.glyomics.org/",
   :idot/preferredPrefix "GNO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "GNO",
   :rdfa/uri "http://purl.obolibrary.org/obo/gno.owl#",
   :rdfs/seeAlso
   ["https://gnome.glyomics.org/CompositionBrowser.html?HexNAc=4&Hex=5&dHex=1&NeuAc=2"
    "https://gnome.glyomics.org/StructureBrowser.html?HexNAc=4&Hex=5&dHex=1&NeuAc=2"],
   :sh/namespace "http://purl.obolibrary.org/obo/GNO_",
   :sh/prefix "GNO"})

(def GO
  "An ontology for describing the function of genes and gene products"
  {:dc11/description
   "An ontology for describing the function of genes and gene products",
   :dc11/title "Gene Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/go.owl",
   :doap/bug-database "https://github.com/geneontology/go-ontology/issues/",
   :foaf/account :obo/news4go,
   :foaf/homepage "http://geneontology.org/",
   :idot/preferredPrefix "GO",
   :obo/IAO_0000136 :obo/NCBITaxon_1,
   :obofmd/activity_status "active",
   :obofmd/continuous_integration_server "http://build.berkeleybop.org/view/GO",
   :obofmd/depends_on
   ["http://purl.obolibrary.org/obo/cl"
    "http://purl.obolibrary.org/obo/ro"
    "http://purl.obolibrary.org/obo/go/extensions/go-bridge-to-nifstd.owl"
    "http://purl.obolibrary.org/obo/uberon"
    "http://purl.obolibrary.org/obo/ncbitaxon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "GO",
   :rdfa/uri "http://purl.obolibrary.org/obo/go.owl#",
   :rdfs/label "GO",
   :rdfs/seeAlso
   "http://amigo.geneontology.org/amigo/term/GO:0008150#display-lineage-tab",
   :sh/namespace "http://purl.obolibrary.org/obo/GO_",
   :sh/prefix "GO"})

(def GSSO
  "The Gender, Sex, and Sexual Orientation (GSSO) ontology has terms for annotating interdisciplinary information concerning gender, sex, and sexual orientation for primary usage in the biomedical and adjacent sciences."
  {:dc11/description
   "The Gender, Sex, and Sexual Orientation (GSSO) ontology has terms for annotating interdisciplinary information concerning gender, sex, and sexual orientation for primary usage in the biomedical and adjacent sciences.",
   :dc11/title "Gender, Sex, and Sexual Orientation (GSSO) ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/gsso.owl"
   :doap/bug-database "https://github.com/Superraptor/GSSO/issues",
   :foaf/homepage "https://gsso.research.cchmc.org/",
   :idot/preferredPrefix "GSSO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "GSSO",
   :rdfa/uri "http://purl.obolibrary.org/obo/gsso.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/GSSO_",
   :sh/prefix "GSSO"})

(def HANCESTRO
  "The Human Ancestry Ontology (HANCESTRO) provides a systematic description of the ancestry concepts used in the NHGRI-EBI Catalog of published genome-wide association studies."
  {:dc11/description
   "The Human Ancestry Ontology (HANCESTRO) provides a systematic description of the ancestry concepts used in the NHGRI-EBI Catalog of published genome-wide association studies.",
   :dc11/title "Human Ancestry Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hancestro.owl",
   :doap/bug-database "https://github.com/EBISPOT/ancestro/issues",
   :foaf/homepage "https://github.com/EBISPOT/ancestro",
   :idot/preferredPrefix "HANCESTRO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "HANCESTRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/hancestro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/HANCESTRO_",
   :sh/prefix "HANCESTRO"})

(def HAO
  "A structured controlled vocabulary of the anatomy of the Hymenoptera (bees, wasps, and ants)"
  {:dc11/description
   "A structured controlled vocabulary of the anatomy of the Hymenoptera (bees, wasps, and ants)",
   :dc11/title "Hymenoptera Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hao.owl",
   :doap/bug-database "https://github.com/hymao/hao/issues",
   :foaf/homepage "http://hymao.org",
   :idot/preferredPrefix "HAO",
   :obo/IAO_0000136 :obo/NCBITaxon_7399,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "HAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/hao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/HAO_",
   :sh/prefix "HAO"})

(def HOM
  "This ontology represents concepts related to homology, as well as other concepts used to describe similarity and non-homology."
  {:dc11/description
   "This ontology represents concepts related to homology, as well as other concepts used to describe similarity and non-homology.",
   :dc11/title "Homology Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hom.owl",
   :doap/bug-database "https://github.com/BgeeDB/homology-ontology/issues",
   :foaf/homepage "https://github.com/BgeeDB/homology-ontology",
   :idot/preferredPrefix "HOM",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "HOM",
   :rdfa/uri "http://purl.obolibrary.org/obo/hom.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/HOM_",
   :sh/prefix "HOM"})

(def HP
  "A structured and controlled vocabulary for the phenotypic features encountered in human hereditary and other disease."
  {:dc11/description
   "A structured and controlled vocabulary for the phenotypic features encountered in human hereditary and other disease.",
   :dc11/title "Human Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hp.owl",
   :doap/bug-database
   "https://github.com/obophenotype/human-phenotype-ontology/issues/",
   :doap/mailing-list "https://groups.io/g/human-phenotype-ontology",
   :foaf/account :obo/hp_ontology,
   :foaf/homepage "http://www.human-phenotype-ontology.org/",
   :idot/preferredPrefix "HP",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "HP",
   :rdfa/uri "http://purl.obolibrary.org/obo/hp.owl#",
   :rdfs/seeAlso ["https://hpo.jax.org/app/"
                  "http://monarchinitiative.org/phenotype/HP:0000118"],
   :sh/namespace "http://purl.obolibrary.org/obo/HP_",
   :sh/prefix "HP"})

(def HSO
  "The health Surveillance Ontology (HSO) focuses on \"surveillance system level data\", that is, data outputs from surveillance activities, such as number of samples collected, cases observed, etc. It aims to support One-Health surveillance, covering animal health, public health and food safety surveillance."
  {:dc11/description
   "The health Surveillance Ontology (HSO) focuses on \"surveillance system level data\", that is, data outputs from surveillance activities, such as number of samples collected, cases observed, etc. It aims to support One-Health surveillance, covering animal health, public health and food safety surveillance.",
   :dc11/title "Health Surveillance Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hso.owl",
   :doap/bug-database "https://github.com/SVA-SE/HSO/issues/",
   :foaf/homepage "https://w3id.org/hso",
   :foaf/page "https://github.com/SVA-SE/HSO",
   :idot/preferredPrefix "HSO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/ncbitaxon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "HSO",
   :rdfa/uri "http://purl.obolibrary.org/obo/hso.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/HSO_",
   :sh/prefix "HSO"})

(def HTN
  "An ontology for representing clinical data about hypertension, intended to support classification of patients according to various diagnostic guidelines"
  {:dc11/description
   "An ontology for representing clinical data about hypertension, intended to support classification of patients according to various diagnostic guidelines",
   :dc11/title "Hypertension Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/htn.owl",
   :doap/bug-database "https://github.com/aellenhicks/htn_owl/issues",
   :foaf/homepage "https://github.com/aellenhicks/htn_owl",
   :idot/preferredPrefix "HTN",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "HTN",
   :rdfa/uri "http://purl.obolibrary.org/obo/htn.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/HTN_",
   :sh/prefix "HTN"})

(def HsapDv
  "Life cycle stages for Human"
  {:dc11/description "Life cycle stages for Human",
   :dc11/title "Human Developmental Stages",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/hsapdv.owl",
   :doap/bug-database
   "https://github.com/obophenotype/developmental-stage-ontologies/issues",
   :foaf/homepage
   "https://github.com/obophenotype/developmental-stage-ontologies/wiki/HsapDv",
   :foaf/page "https://github.com/obophenotype/developmental-stage-ontologies",
   :idot/preferredPrefix "HsapDv",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "HsapDv",
   :rdfa/uri "http://purl.obolibrary.org/obo/hsapdv.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/HsapDv_",
   :sh/prefix "HsapDv"})

(def IAO
  "An ontology of information entities."
  {:dc11/description "An ontology of information entities.",
   :dc11/title "Information Artifact Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/iao.owl",
   :doap/bug-database
   "https://github.com/information-artifact-ontology/IAO/issues",
   :foaf/homepage "https://github.com/information-artifact-ontology/IAO/",
   :idot/preferredPrefix "IAO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "IAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/iao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/IAO_",
   :sh/prefix "IAO"})

(def ICEO
  "ICEO is an integrated biological ontology for the description of bacterial integrative and conjugative elements (ICEs)."
  {:dc11/description
   "ICEO is an integrated biological ontology for the description of bacterial integrative and conjugative elements (ICEs).",
   :dc11/title "Integrative and Conjugative Element Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/iceo.owl",
   :doap/bug-database "https://github.com/ontoice/ICEO/issues",
   :foaf/homepage "https://github.com/ontoice/ICEO",
   :idot/preferredPrefix "ICEO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ICEO",
   :rdfa/uri "http://purl.obolibrary.org/obo/iceo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ICEO_",
   :sh/prefix "ICEO"})

(def ICO
  "An ontology of clinical informed consents"
  {:dc11/description     "An ontology of clinical informed consents",
   :dc11/title           "Informed Consent Ontology",
   :dcat/downloadURL     "http://purl.obolibrary.org/obo/ico.owl",
   :doap/bug-database    "https://github.com/ICO-ontology/ICO/issues",
   :foaf/homepage        "https://github.com/ICO-ontology/ICO",
   :idot/preferredPrefix "ICO",
   :obofmd/activity_status "active",
   :rdf/type             :rdfa/PrefixMapping,
   :rdfa/prefix          "ICO",
   :rdfa/uri             "http://purl.obolibrary.org/obo/ico.owl#",
   :sh/namespace         "http://purl.obolibrary.org/obo/ICO_",
   :sh/prefix            "ICO"})

(def IDO
  "A set of interoperable ontologies that will together provide coverage of the infectious disease domain. IDO core is the upper-level ontology that hosts terms of general relevance across the domain, while extension ontologies host terms to specific to a particular part of the domain."
  {:dc11/description
   "A set of interoperable ontologies that will together provide coverage of the infectious disease domain. IDO core is the upper-level ontology that hosts terms of general relevance across the domain, while extension ontologies host terms to specific to a particular part of the domain.",
   :dc11/title "Infectious Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ido.owl",
   :doap/bug-database
   "https://github.com/infectious-disease-ontology/infectious-disease-ontology/issues",
   :foaf/homepage
   "http://www.bioontology.org/wiki/index.php/Infectious_Disease_Ontology",
   :idot/preferredPrefix "IDO",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "IDO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ido.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/IDO_",
   :sh/prefix "IDO"})

(def INO
  "An ontology of interactions and interaction networks"
  {:dc11/description     "An ontology of interactions and interaction networks",
   :dc11/title           "Interaction Network Ontology",
   :dcat/downloadURL     "http://purl.obolibrary.org/obo/ino.owl",
   :doap/bug-database    "https://github.com/INO-ontology/ino/issues",
   :foaf/homepage        "https://github.com/INO-ontology/ino",
   :idot/preferredPrefix "INO",
   :obofmd/activity_status "active",
   :rdf/type             :rdfa/PrefixMapping,
   :rdfa/prefix          "INO",
   :rdfa/uri             "http://purl.obolibrary.org/obo/ino.owl#",
   :sh/namespace         "http://purl.obolibrary.org/obo/INO_",
   :sh/prefix            "INO"})

(def KISAO
  "A classification of algorithms for simulating biology, their parameters, and their outputs"
  {:dc11/description
   "A classification of algorithms for simulating biology, their parameters, and their outputs",
   :dc11/title "Kinetic Simulation Algorithm Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/kisao.owl"
   :disco/fundedBy ["https://grantome.com/search?q=R35GM119771"
                    "https://grantome.com/search?q=P41EB023912"],
   :doap/bug-database "https://github.com/SED-ML/KiSAO/issues",
   :foaf/homepage "https://github.com/SED-ML/KiSAO",
   :idot/preferredPrefix "KISAO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "KISAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/kisao.owl#",
   :rdfs/seeAlso ["https://bioportal.bioontology.org/ontologies/KISAO"
                  "https://www.ebi.ac.uk/ols/ontologies/kisao"
                  "https://www.ontobee.org/ontology/KISAO"],
   :sh/namespace "http://purl.obolibrary.org/obo/KISAO_",
   :sh/prefix "KISAO"})

(def LABO
  "LABO is an ontology of informational entities formalizing clinical laboratory tests prescriptions and reporting documents."
  {:dc11/description
   "LABO is an ontology of informational entities formalizing clinical laboratory tests prescriptions and reporting documents.",
   :dc11/title "clinical LABoratory Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/labo.owl",
   :doap/bug-database "https://github.com/OpenLHS/LABO/issues",
   :foaf/homepage "https://github.com/OpenLHS/LABO",
   :idot/preferredPrefix "LABO",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/omiabis"
                       "http://purl.obolibrary.org/obo/opmi"
                       "http://purl.obolibrary.org/obo/ogms"
                       "http://purl.obolibrary.org/obo/iao"
                       "http://purl.obolibrary.org/obo/omrse"
                       "http://purl.obolibrary.org/obo/obi"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "LABO",
   :rdfa/uri "http://purl.obolibrary.org/obo/labo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/LABO_",
   :sh/prefix "LABO"})

(def LEPAO
  "The Lepidoptera Anatomy Ontology contains terms used for describing the anatomy and phenotype of moths and butterflies in biodiversity research. LEPAO is developed in part by BIOfid (The Specialised Information Service Biodiversity Research)."
  {:dc11/description
   "The Lepidoptera Anatomy Ontology contains terms used for describing the anatomy and phenotype of moths and butterflies in biodiversity research. LEPAO is developed in part by BIOfid (The Specialised Information Service Biodiversity Research).",
   :dc11/title "Lepidoptera Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/lepao.owl",
   :doap/bug-database "https://github.com/insect-morphology/lepao/issues",
   :foaf/homepage "https://github.com/insect-morphology/lepao",
   :idot/preferredPrefix "LEPAO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/aism"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/caro"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/bspo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "LEPAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/lepao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/LEPAO_",
   :sh/prefix "LEPAO"})

(def MA
  "A structured controlled vocabulary of the adult anatomy of the mouse (Mus)."
  {:dc11/description
   "A structured controlled vocabulary of the adult anatomy of the mouse (Mus).",
   :dc11/title "Mouse adult gross anatomy",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ma.owl",
   :doap/bug-database
   "https://github.com/obophenotype/mouse-anatomy-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/mouse-anatomy-ontology",
   :foaf/page "http://www.informatics.jax.org/searches/AMA_form.shtml",
   :idot/preferredPrefix "MA",
   :obo/IAO_0000136 :obo/NCBITaxon_10088,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MA",
   :rdfa/uri "http://purl.obolibrary.org/obo/ma.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MA_",
   :sh/prefix "MA"})

(def MAMO
  "The Mathematical Modelling Ontology (MAMO) is a classification of the types of mathematical models used mostly in the life sciences, their variables, relationships and other relevant features."
  {:dc11/description
   "The Mathematical Modelling Ontology (MAMO) is a classification of the types of mathematical models used mostly in the life sciences, their variables, relationships and other relevant features.",
   :dc11/title "Mathematical modeling ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mamo.owl",
   :doap/bug-database "http://sourceforge.net/p/mamo-ontology/tickets/",
   :foaf/homepage "http://sourceforge.net/p/mamo-ontology/wiki/Home/",
   :idot/preferredPrefix "MAMO",
   :obofmd/activity_status "orphaned",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MAMO",
   :rdfa/uri "http://purl.obolibrary.org/obo/mamo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MAMO_",
   :sh/prefix "MAMO"})

(def MAXO
  "The Medical Action Ontology (MAxO) provides a broad view of medical actions and includes terms for medical procedures, interventions, therapies, treatments, and recommendations."
  {:dc11/description
   "The Medical Action Ontology (MAxO) provides a broad view of medical actions and includes terms for medical procedures, interventions, therapies, treatments, and recommendations.",
   :dc11/title "Medical Action Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/maxo.owl",
   :doap/bug-database "https://github.com/monarch-initiative/MAxO/issues",
   :foaf/homepage "https://github.com/monarch-initiative/MAxO",
   :idot/preferredPrefix "MAXO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/hp"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/iao"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/foodon"
                       "http://purl.obolibrary.org/obo/nbo"
                       "http://purl.obolibrary.org/obo/ro"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MAXO",
   :rdfa/uri "http://purl.obolibrary.org/obo/maxo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MAXO_",
   :sh/prefix "MAXO"})

(def MCO
  "Microbial Conditions Ontology is an ontology..."
  {:dc11/description "Microbial Conditions Ontology is an ontology...",
   :dc11/title "Microbial Conditions Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mco.owl",
   :doap/bug-database
   "https://github.com/microbial-conditions-ontology/microbial-conditions-ontology/issues",
   :foaf/homepage
   "https://github.com/microbial-conditions-ontology/microbial-conditions-ontology",
   :idot/preferredPrefix "MCO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/omp"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/micro"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/peco"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/ncit"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/cl"
                       "http://purl.obolibrary.org/obo/omit"
                       "http://purl.obolibrary.org/obo/zeco"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/clo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MCO",
   :rdfa/uri "http://purl.obolibrary.org/obo/mco.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MCO_",
   :sh/prefix "MCO"})

(def MF
  "The Mental Functioning Ontology is an overarching ontology for all aspects of mental functioning."
  {:dc11/description
   "The Mental Functioning Ontology is an overarching ontology for all aspects of mental functioning.",
   :dc11/title "Mental Functioning Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mf.owl",
   :doap/bug-database
   "https://github.com/jannahastings/mental-functioning-ontology/issues",
   :foaf/homepage
   "https://github.com/jannahastings/mental-functioning-ontology",
   :idot/preferredPrefix "MF",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MF",
   :rdfa/uri "http://purl.obolibrary.org/obo/mf.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MF_",
   :sh/prefix "MF"})

(def MFMO
  "The Mammalian Feeding Muscle Ontology is an antomy ontology for the muscles of the head and neck that participate in feeding, swallowing, and other oral-pharyngeal behaviors."
  {:dc11/description
   "The Mammalian Feeding Muscle Ontology is an antomy ontology for the muscles of the head and neck that participate in feeding, swallowing, and other oral-pharyngeal behaviors.",
   :dc11/title "Mammalian Feeding Muscle Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mfmo.owl",
   :doap/bug-database "https://github.com/RDruzinsky/feedontology/issues",
   :foaf/homepage "https://github.com/rdruzinsky/feedontology",
   :idot/preferredPrefix "MFMO",
   :obo/IAO_0000136 :obo/NCBITaxon_40674,
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/uberon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MFMO",
   :rdfa/uri "http://purl.obolibrary.org/obo/mfmo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MFMO_",
   :sh/prefix "MFMO"})

(def MFOEM
  "An ontology of affective phenomena such as emotions, moods, appraisals and subjective feelings."
  {:dc11/description
   "An ontology of affective phenomena such as emotions, moods, appraisals and subjective feelings.",
   :dc11/title "Emotion Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mfoem.owl",
   :doap/bug-database
   "https://github.com/jannahastings/emotion-ontology/issues",
   :foaf/homepage "https://github.com/jannahastings/emotion-ontology",
   :idot/preferredPrefix "MFOEM",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MFOEM",
   :rdfa/uri "http://purl.obolibrary.org/obo/mfoem.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MFOEM_",
   :sh/prefix "MFOEM"})

(def MFOMD
  "An ontology to describe and classify mental diseases such as schizophrenia, annotated with DSM-IV and ICD codes where applicable"
  {:dc11/description
   "An ontology to describe and classify mental diseases such as schizophrenia, annotated with DSM-IV and ICD codes where applicable",
   :dc11/title "Mental Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mfomd.owl",
   :doap/bug-database
   "https://github.com/jannahastings/mental-functioning-ontology/issues",
   :foaf/homepage
   "https://github.com/jannahastings/mental-functioning-ontology",
   :idot/preferredPrefix "MFOMD",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MFOMD",
   :rdfa/uri "http://purl.obolibrary.org/obo/mfomd.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MFOMD_",
   :sh/prefix "MFOMD"})

(def MI
  "A structured controlled vocabulary for the annotation of experiments concerned with protein-protein interactions."
  {:dc11/description
   "A structured controlled vocabulary for the annotation of experiments concerned with protein-protein interactions.",
   :dc11/title "Molecular Interactions Controlled Vocabulary",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mi.owl",
   :doap/bug-database "https://github.com/HUPO-PSI/psi-mi-CV/issues",
   :foaf/homepage "https://github.com/HUPO-PSI/psi-mi-CV",
   :foaf/page "https://github.com/HUPO-PSI/psi-mi-CV",
   :idot/preferredPrefix "MI",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MI",
   :rdfa/uri "http://purl.obolibrary.org/obo/mi.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MI_",
   :sh/prefix "MI"})

(def MIAPA
  "An application ontology to formalize annotation of phylogenetic data."
  {:dc11/description
   "An application ontology to formalize annotation of phylogenetic data.",
   :dc11/title "MIAPA Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/miapa.owl",
   :doap/bug-database "https://github.com/evoinfo/miapa/issues",
   :doap/mailing-list "http://groups.google.com/group/miapa-discuss",
   :foaf/homepage "http://www.evoio.org/wiki/MIAPA",
   :idot/preferredPrefix "MIAPA",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MIAPA",
   :rdfa/uri "http://purl.obolibrary.org/obo/miapa.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MIAPA_",
   :sh/prefix "MIAPA"})

(def MICRO
  "An ontology of prokaryotic phenotypic and metabolic characters"
  {:dc11/description
   "An ontology of prokaryotic phenotypic and metabolic characters",
   :dc11/title "Ontology of Prokaryotic Phenotypic and Metabolic Characters",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/micro.owl"
   :doap/bug-database "https://github.com/carrineblank/MicrO/issues",
   :foaf/homepage "https://github.com/carrineblank/MicrO",
   :idot/preferredPrefix "MICRO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MICRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/micro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MICRO_",
   :sh/prefix "MICRO"})

(def MMO
  "A representation of the variety of methods used to make clinical and phenotype measurements. "
  {:dc11/description
   "A representation of the variety of methods used to make clinical and phenotype measurements. ",
   :dc11/title "Measurement method ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mmo.owl",
   :doap/bug-database
   "https://github.com/rat-genome-database/MMO-Measurement-Method-Ontology/issues",
   :foaf/homepage
   "https://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=MMO:0000000",
   :foaf/page "https://download.rgd.mcw.edu/ontology/measurement_method/",
   :idot/preferredPrefix "MMO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MMO",
   :rdfa/uri "http://purl.obolibrary.org/obo/mmo.owl#",
   :rdfs/seeAlso
   "http://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=MMO:0000000",
   :sh/namespace "http://purl.obolibrary.org/obo/MMO_",
   :sh/prefix "MMO"})

(def MOD
  "PSI-MOD is an ontology consisting of terms that describe protein chemical modifications"
  {:dc11/description
   "PSI-MOD is an ontology consisting of terms that describe protein chemical modifications",
   :dc11/title "Protein modification",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mod.owl",
   :doap/bug-database "https://github.com/HUPO-PSI/psi-mod-CV/issues",
   :foaf/homepage "http://www.psidev.info/MOD",
   :idot/preferredPrefix "MOD",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MOD",
   :rdfa/uri "http://purl.obolibrary.org/obo/mod.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MOD_",
   :sh/prefix "MOD"})

(def MONDO
  "A global community effort to harmonize multiple disease resources to yield a coherent merged ontology."
  {:dc11/description
   "A global community effort to harmonize multiple disease resources to yield a coherent merged ontology.",
   :dc11/title "Mondo Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mondo.owl",
   :doap/bug-database "https://github.com/monarch-initiative/mondo/issues",
   :doap/mailing-list "https://groups.google.com/group/mondo-users",
   :foaf/account :obo/MonarchInit,
   :foaf/homepage "https://monarch-initiative.github.io/mondo",
   :idot/preferredPrefix "MONDO",
   :obo/IAO_0000136 :obo/NCBITaxon_33208,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MONDO",
   :rdfa/uri "http://purl.obolibrary.org/obo/mondo.owl#",
   :rdfs/label "Mondo",
   :rdfs/seeAlso "https://monarchinitiative.org/disease/MONDO:0019609",
   :sh/namespace "http://purl.obolibrary.org/obo/MONDO_",
   :sh/prefix "MONDO"})

(def MOP
  "Processes at the molecular level"
  {:dc11/description       "Processes at the molecular level",
   :dc11/title             "Molecular Process Ontology",
   :dcat/downloadURL       "http://purl.obolibrary.org/obo/mop.owl",
   :doap/bug-database      "https://github.com/rsc-ontologies/rxno/issues",
   :doap/mailing-list      "chemistry-ontologies@googlegroups.com",
   :foaf/homepage          "https://github.com/rsc-ontologies/rxno",
   :idot/preferredPrefix   "MOP",
   :obofmd/activity_status "active",
   :rdf/type               :rdfa/PrefixMapping,
   :rdfa/prefix            "MOP",
   :rdfa/uri               "http://purl.obolibrary.org/obo/mop.owl#",
   :sh/namespace           "http://purl.obolibrary.org/obo/MOP_",
   :sh/prefix              "MOP"})

(def MP
  "Standard terms for annotating mammalian phenotypic data."
  {:dc11/description "Standard terms for annotating mammalian phenotypic data.",
   :dc11/title "Mammalian Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mp.owl",
   :doap/bug-database
   "https://github.com/mgijax/mammalian-phenotype-ontology/issues",
   :doap/mailing-list
   "https://groups.google.com/forum/#!forum/phenotype-ontologies-editors",
   :foaf/homepage "http://www.informatics.jax.org/searches/MP_form.shtml",
   :foaf/page "https://github.com/mgijax/mammalian-phenotype-ontology",
   :idot/preferredPrefix "MP",
   :obo/IAO_0000136 :obo/NCBITaxon_40674,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MP",
   :rdfa/uri "http://purl.obolibrary.org/obo/mp.owl#",
   :rdfs/seeAlso
   ["http://www.informatics.jax.org/searches/MP_form.shtml"
    "https://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=MP:0000001"
    "http://monarchinitiative.org/phenotype/MP:0000001"],
   :sh/namespace "http://purl.obolibrary.org/obo/MP_",
   :sh/prefix "MP"})

(def MPATH
  "A structured controlled vocabulary of mutant and transgenic mouse pathology phenotypes"
  {:dc11/description
   "A structured controlled vocabulary of mutant and transgenic mouse pathology phenotypes",
   :dc11/title "Mouse pathology ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mpath.owl",
   :doap/bug-database "https://github.com/PaulNSchofield/mpath/issues",
   :foaf/homepage "http://www.pathbase.net",
   :idot/preferredPrefix "MPATH",
   :obo/IAO_0000136 :obo/NCBITaxon_10088,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MPATH",
   :rdfa/uri "http://purl.obolibrary.org/obo/mpath.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MPATH_",
   :sh/prefix "MPATH"})

(def MPIO
  "An ontology of minimum information regarding potential drug-drug interaction information."
  {:dc11/description
   "An ontology of minimum information regarding potential drug-drug interaction information.",
   :dc11/title "Minimum PDDI Information Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mpio.owl",
   :doap/bug-database "https://github.com/MPIO-Developers/MPIO/issues",
   :foaf/homepage "https://github.com/MPIO-Developers/MPIO",
   :idot/preferredPrefix "MPIO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MPIO",
   :rdfa/uri "http://purl.obolibrary.org/obo/mpio.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MPIO_",
   :sh/prefix "MPIO"})

(def MRO
  "An ontology for Major Histocompatibility Complex (MHC) restriction in experiments"
  {:dc11/description
   "An ontology for Major Histocompatibility Complex (MHC) restriction in experiments",
   :dc11/title "MHC Restriction Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mro.owl",
   :doap/bug-database "https://github.com/IEDB/MRO/issues",
   :foaf/homepage "https://github.com/IEDB/MRO",
   :idot/preferredPrefix "MRO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/mro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MRO_",
   :sh/prefix "MRO"})

(def MS
  "A structured controlled vocabulary for the annotation of experiments concerned with proteomics mass spectrometry."
  {:dc11/description
   "A structured controlled vocabulary for the annotation of experiments concerned with proteomics mass spectrometry.",
   :dc11/title "Mass spectrometry ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ms.owl",
   :doap/bug-database "https://github.com/HUPO-PSI/psi-ms-CV/issues",
   :doap/mailing-list "psidev-ms-vocab@lists.sourceforge.net",
   :foaf/homepage "http://www.psidev.info/groups/controlled-vocabularies",
   :foaf/page "http://www.psidev.info/groups/controlled-vocabularies",
   :idot/preferredPrefix "MS",
   :obofmd/activity_status "active",
   :obofmd/continuous_integration_server
   "https://raw.githubusercontent.com/HUPO-PSI/psi-ms-CV/master",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/uo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MS",
   :rdfa/uri "http://purl.obolibrary.org/obo/ms.owl#",
   :rdfs/label "MS",
   :sh/namespace "http://purl.obolibrary.org/obo/MS_",
   :sh/prefix "MS"})

(def MmusDv
  "Life cycle stages for Mus Musculus"
  {:dc11/description "Life cycle stages for Mus Musculus",
   :dc11/title "Mouse Developmental Stages",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/mmusdv.owl",
   :doap/bug-database
   "https://github.com/obophenotype/developmental-stage-ontologies/issues",
   :foaf/homepage
   "https://github.com/obophenotype/developmental-stage-ontologies/wiki/MmusDv",
   :foaf/page "https://github.com/obophenotype/developmental-stage-ontologies",
   :idot/preferredPrefix "MmusDv",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "MmusDv",
   :rdfa/uri "http://purl.obolibrary.org/obo/mmusdv.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/MmusDv_",
   :sh/prefix "MmusDv"})

(def NBO
  "An ontology of human and animal behaviours and behavioural phenotypes"
  {:dc11/description
   "An ontology of human and animal behaviours and behavioural phenotypes",
   :dc11/title "Neuro Behavior Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/nbo.owl",
   :doap/bug-database
   "https://github.com/obo-behavior/behavior-ontology/issues",
   :foaf/homepage "https://github.com/obo-behavior/behavior-ontology/",
   :idot/preferredPrefix "NBO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "NBO",
   :rdfa/uri "http://purl.obolibrary.org/obo/nbo.owl#",
   :rdfs/seeAlso "https://bioportal.bioontology.org/ontologies/NBO",
   :sh/namespace "http://purl.obolibrary.org/obo/NBO_",
   :sh/prefix "NBO"})

(def NCBITaxon
  "An ontology representation of the NCBI organismal taxonomy"
  {:dc11/description
   "An ontology representation of the NCBI organismal taxonomy",
   :dc11/title "NCBI organismal classification",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ncbitaxon.owl",
   :doap/bug-database "https://github.com/obophenotype/ncbitaxon/issues",
   :foaf/homepage "https://github.com/obophenotype/ncbitaxon",
   :foaf/page "http://www.ncbi.nlm.nih.gov/taxonomy",
   :idot/preferredPrefix "NCBITaxon",
   :obofmd/activity_status "active",
   :pav/wasDerivedFrom
   "ftp://ftp.ebi.ac.uk/pub/databases/taxonomy/taxonomy.dat",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "NCBITaxon",
   :rdfa/uri "http://purl.obolibrary.org/obo/ncbitaxon.owl#",
   :rdfs/seeAlso "http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi",
   :sh/namespace "http://purl.obolibrary.org/obo/NCBITaxon_",
   :sh/prefix "NCBITaxon"})

(def NCIT
  "NCI Thesaurus (NCIt)is a reference terminology that includes broad coverage of the cancer domain, including cancer related diseases, findings and abnormalities. The NCIt OBO Edition aims to increase integration of the NCIt with OBO Library ontologies. NCIt OBO Edition releases should be considered experimental."
  {:dc11/description
   "NCI Thesaurus (NCIt)is a reference terminology that includes broad coverage of the cancer domain, including cancer related diseases, findings and abnormalities. The NCIt OBO Edition aims to increase integration of the NCIt with OBO Library ontologies. NCIt OBO Edition releases should be considered experimental.",
   :dc11/title "NCI Thesaurus OBO Edition",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ncit.owl",
   :doap/bug-database
   "https://github.com/NCI-Thesaurus/thesaurus-obo-edition/issues",
   :foaf/homepage "https://github.com/NCI-Thesaurus/thesaurus-obo-edition",
   :idot/preferredPrefix "NCIT",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "NCIT",
   :rdfa/uri "http://purl.obolibrary.org/obo/ncit.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/NCIT_",
   :sh/prefix "NCIT"})

(def NCRO
  "An ontology for non-coding RNA, both of biological origin, and engineered."
  {:dc11/description
   "An ontology for non-coding RNA, both of biological origin, and engineered.",
   :dc11/title "Non-Coding RNA Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ncro.owl",
   :doap/bug-database "https://github.com/OmniSearch/ncro/issues",
   :doap/mailing-list
   "ncro-devel@googlegroups.com, ncro-discuss@googlegroups.com",
   :foaf/homepage "http://omnisearch.soc.southalabama.edu/w/index.php/Ontology",
   :idot/preferredPrefix "NCRO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "NCRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ncro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/NCRO_",
   :sh/prefix "NCRO"})

(def NGBO
  "The Next Generation Biobanking Ontology (NGBO) is an open application ontology representing contextual data about omics digital assets in biobank. The ontology focuses on capturing the information about three main activities: wet bench analysis used to generate omics data, bioinformatics analysis used to analyze and interpret data, and data management."
  {:dc11/description
   "The Next Generation Biobanking Ontology (NGBO) is an open application ontology representing contextual data about omics digital assets in biobank. The ontology focuses on capturing the information about three main activities: wet bench analysis used to generate omics data, bioinformatics analysis used to analyze and interpret data, and data management.",
   :dc11/title "Next Generation Biobanking Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ngbo.owl",
   :doap/bug-database "https://github.com/Dalalghamdi/NGBO/issues",
   :foaf/homepage "https://github.com/Dalalghamdi/NGBO",
   :idot/preferredPrefix "NGBO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "NGBO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ngbo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/NGBO_",
   :sh/prefix "NGBO"})

(def NOMEN
  "NOMEN is a nomenclatural ontology for biological names (not concepts).  It encodes the goverened rules of nomenclature."
  {:dc11/description
   "NOMEN is a nomenclatural ontology for biological names (not concepts).  It encodes the goverened rules of nomenclature.",
   :dc11/title "NOMEN - A nomenclatural ontology for biological names",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/nomen.owl"
   :disco/fundedBy "https://www.nsf.gov/awardsearch/showAward?AWD_ID=1356381",
   :doap/bug-database "https://github.com/SpeciesFileGroup/nomen/issues",
   :doap/mailing-list "https://groups.google.com/forum/#!forum/nomen-discuss",
   :foaf/homepage "https://github.com/SpeciesFileGroup/nomen",
   :idot/preferredPrefix "NOMEN",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "NOMEN",
   :rdfa/uri "http://purl.obolibrary.org/obo/nomen.owl#",
   :rdfs/label "NOMEN",
   :sh/namespace "http://purl.obolibrary.org/obo/NOMEN_",
   :sh/prefix "NOMEN"})

(def OAE
  "A biomedical ontology in the domain of adverse events"
  {:dc11/description "A biomedical ontology in the domain of adverse events",
   :dc11/title "Ontology of Adverse Events",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oae.owl",
   :doap/bug-database "https://github.com/OAE-ontology/OAE/issues",
   :foaf/homepage "https://github.com/OAE-ontology/OAE/",
   :idot/preferredPrefix "OAE",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OAE",
   :rdfa/uri "http://purl.obolibrary.org/obo/oae.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OAE_",
   :sh/prefix "OAE"})

(def OARCS
  "OArCS is an ontology describing the Arthropod ciruclatory system."
  {:dc11/description
   "OArCS is an ontology describing the Arthropod ciruclatory system.",
   :dc11/title "Ontology of Arthropod Circulatory Systems",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oarcs.owl",
   :doap/bug-database "https://github.com/aszool/oarcs/issues",
   :foaf/homepage "https://github.com/aszool/oarcs",
   :idot/preferredPrefix "OARCS",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OARCS",
   :rdfa/uri "http://purl.obolibrary.org/obo/oarcs.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OARCS_",
   :sh/prefix "OARCS"})

(def OBA
  "A collection of biological attributes (traits) covering all kingdoms of life."
  {:dc11/description
   "A collection of biological attributes (traits) covering all kingdoms of life.",
   :dc11/title "Ontology of Biological Attributes",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oba.owl",
   :doap/bug-database
   "https://github.com/obophenotype/bio-attribute-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/bio-attribute-ontology",
   :foaf/page "http://wiki.geneontology.org/index.php/Extensions/x-attribute",
   :idot/preferredPrefix "OBA",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OBA",
   :rdfa/uri "http://purl.obolibrary.org/obo/oba.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OBA_",
   :sh/prefix "OBA"})

(def OBCS
  "A biomedical ontology in the domain of biological and clinical statistics."
  {:dc11/description
   "A biomedical ontology in the domain of biological and clinical statistics.",
   :dc11/title "Ontology of Biological and Clinical Statistics",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/obcs.owl",
   :doap/bug-database "https://github.com/obcs/obcs/issues",
   :foaf/homepage "https://github.com/obcs/obcs",
   :idot/preferredPrefix "OBCS",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OBCS",
   :rdfa/uri "http://purl.obolibrary.org/obo/obcs.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OBCS_",
   :sh/prefix "OBCS"})

(def OBI
  "An integrated ontology for the description of life-science and clinical investigations"
  {:dc11/description
   "An integrated ontology for the description of life-science and clinical investigations",
   :dc11/title "Ontology for Biomedical Investigations",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/obi.owl",
   :doap/bug-database "http://purl.obolibrary.org/obo/obi/tracker",
   :doap/mailing-list "http://groups.google.com/group/obi-users",
   :foaf/homepage "http://obi-ontology.org",
   :idot/preferredPrefix "OBI",
   :obofmd/activity_status "active",
   :obofmd/continuous_integration_server
   "http://build.berkeleybop.org/job/build-obi/",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OBI",
   :rdfa/uri "http://purl.obolibrary.org/obo/obi.owl#",
   :rdfs/seeAlso "http://bioportal.bioontology.org/ontologies/OBI?p=classes",
   :sh/namespace "http://purl.obolibrary.org/obo/OBI_",
   :sh/prefix "OBI"})

(def OBIB
  "An ontology built for annotation and modeling of biobank repository and biobanking administration"
  {:dc11/description
   "An ontology built for annotation and modeling of biobank repository and biobanking administration",
   :dc11/title "Ontology for Biobanking",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/obib.owl",
   :doap/bug-database "https://github.com/biobanking/biobanking/issues",
   :foaf/homepage "https://github.com/biobanking/biobanking",
   :idot/preferredPrefix "OBIB",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OBIB",
   :rdfa/uri "http://purl.obolibrary.org/obo/obib.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OBIB_",
   :sh/prefix "OBIB"})

(def OGG
  "A formal ontology of genes and genomes of biological organisms."
  {:dc11/description
   "A formal ontology of genes and genomes of biological organisms.",
   :dc11/title "The Ontology of Genes and Genomes",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ogg.owl",
   :doap/bug-database "https://bitbucket.org/hegroup/ogg/issues/",
   :foaf/homepage "https://bitbucket.org/hegroup/ogg",
   :idot/preferredPrefix "OGG",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OGG",
   :rdfa/uri "http://purl.obolibrary.org/obo/ogg.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OGG_",
   :sh/prefix "OGG"})

(def OGMS
  "An ontology for representing treatment of disease and diagnosis and on carcinomas and other pathological entities"
  {:dc11/description
   "An ontology for representing treatment of disease and diagnosis and on carcinomas and other pathological entities",
   :dc11/title "Ontology for General Medical Science",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ogms.owl",
   :doap/bug-database "https://github.com/OGMS/ogms/issues",
   :foaf/homepage "https://github.com/OGMS/ogms",
   :idot/preferredPrefix "OGMS",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OGMS",
   :rdfa/uri "http://purl.obolibrary.org/obo/ogms.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OGMS_",
   :sh/prefix "OGMS"})

(def OGSF
  "An application ontology to represent genetic susceptibility to a specific disease, adverse event, or a pathological process."
  {:dc11/description
   "An application ontology to represent genetic susceptibility to a specific disease, adverse event, or a pathological process.",
   :dc11/title "Ontology of Genetic Susceptibility Factor",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ogsf.owl",
   :doap/bug-database "https://github.com/linikujp/OGSF/issues",
   :foaf/homepage "https://github.com/linikujp/OGSF",
   :idot/preferredPrefix "OGSF",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OGSF",
   :rdfa/uri "http://purl.obolibrary.org/obo/ogsf.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OGSF_",
   :sh/prefix "OGSF"})

(def OHD
  "The Oral Health and Disease Ontology is used for representing the diagnosis and treatment of dental maladies."
  {:dc11/description
   "The Oral Health and Disease Ontology is used for representing the diagnosis and treatment of dental maladies.",
   :dc11/title "Oral Health and Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ohd.owl",
   :doap/bug-database
   "https://github.com/oral-health-and-disease-ontologies/ohd-ontology/issues",
   :foaf/homepage "https://purl.obolibrary.org/obo/ohd/home",
   :idot/preferredPrefix "OHD",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OHD",
   :rdfa/uri "http://purl.obolibrary.org/obo/ohd.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OHD_",
   :sh/prefix "OHD"})

(def OHMI
  "The Ontology of Host-Microbiome Interactions aims to ontologically represent and standardize various entities and relations related to microbiomes, microbiome host organisms (e.g., human and mouse), and the interactions between the hosts and microbiomes at different conditions."
  {:dc11/description
   "The Ontology of Host-Microbiome Interactions aims to ontologically represent and standardize various entities and relations related to microbiomes, microbiome host organisms (e.g., human and mouse), and the interactions between the hosts and microbiomes at different conditions.",
   :dc11/title "Ontology of Host-Microbiome Interactions",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ohmi.owl",
   :doap/bug-database "https://github.com/ohmi-ontology/ohmi/issues",
   :doap/mailing-list "http://groups.google.com/group/ohmi-discuss",
   :foaf/homepage "https://github.com/ohmi-ontology/ohmi",
   :idot/preferredPrefix "OHMI",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OHMI",
   :rdfa/uri "http://purl.obolibrary.org/obo/ohmi.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OHMI_",
   :sh/prefix "OHMI"})

(def OHPI
  "OHPI is a community-driven ontology of host-pathogen interactions (OHPI) and represents the virulence factors (VFs) and how the mutants of VFs in the Victors database become less virulence inside a host organism or host cells. It is developed to represent manually curated HPI knowledge available in the PHIDIAS resource."
  {:dc11/description
   "OHPI is a community-driven ontology of host-pathogen interactions (OHPI) and represents the virulence factors (VFs) and how the mutants of VFs in the Victors database become less virulence inside a host organism or host cells. It is developed to represent manually curated HPI knowledge available in the PHIDIAS resource.",
   :dc11/title "Ontology of Host Pathogen Interactions",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ohpi.owl",
   :doap/bug-database "https://github.com/OHPI/ohpi/issues",
   :doap/mailing-list "http://groups.google.com/group/ohpi-discuss",
   :foaf/homepage "https://github.com/OHPI/ohpi",
   :idot/preferredPrefix "OHPI",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OHPI",
   :rdfa/uri "http://purl.obolibrary.org/obo/ohpi.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OHPI_",
   :sh/prefix "OHPI"})

(def OMIABIS
  {:rdf/type :rdfa/PrefixMapping
   :rdfa/uri "http://purl.obolibrary.org/obo/omiabis.owl#"
   :rdfa/prefix "OMIABIS"})

(def OMIT
  "Ontology to establish data exchange standards and common data elements in the microRNA (miR) domain"
  {:dc11/description
   "Ontology to establish data exchange standards and common data elements in the microRNA (miR) domain",
   :dc11/title "Ontology for MIRNA Target",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omit.owl",
   :doap/bug-database "https://github.com/OmniSearch/omit/issues",
   :foaf/homepage "http://omit.cis.usouthal.edu/",
   :foaf/page "http://omit.cis.usouthal.edu/",
   :idot/preferredPrefix "OMIT",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OMIT",
   :rdfa/uri "http://purl.obolibrary.org/obo/omit.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OMIT_",
   :sh/prefix "OMIT"})

(def OMO
  "An ontology specifies terms that are used to annotate ontology terms for all OBO ontologies. The ontology was developed as part of Information Artifact Ontology (IAO)."
  {:dc11/description
   "An ontology specifies terms that are used to annotate ontology terms for all OBO ontologies. The ontology was developed as part of Information Artifact Ontology (IAO).",
   :dc11/title "OBO Metadata Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omo.owl",
   :doap/bug-database
   "https://github.com/information-artifact-ontology/ontology-metadata/issues",
   :foaf/homepage
   "https://github.com/information-artifact-ontology/ontology-metadata",
   :idot/preferredPrefix "OMO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OMO",
   :rdfa/uri "http://purl.obolibrary.org/obo/omo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OMO_",
   :sh/prefix "OMO"})

(def OMP
  "An ontology of phenotypes covering microbes"
  {:dc11/description "An ontology of phenotypes covering microbes",
   :dc11/title "Ontology of Microbial Phenotypes",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omp.owl",
   :doap/bug-database
   "https://github.com/microbialphenotypes/OMP-ontology/issues",
   :foaf/homepage "http://microbialphenotypes.org",
   :idot/preferredPrefix "OMP",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OMP",
   :rdfa/uri "http://purl.obolibrary.org/obo/omp.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OMP_",
   :sh/prefix "OMP"})

(def OMRSE
  "This ontology covers the domain of social entities that are related to health care, such as demographic information and the roles of various individuals and organizations."
  {:dc11/description
   "This ontology covers the domain of social entities that are related to health care, such as demographic information and the roles of various individuals and organizations.",
   :dc11/title "Ontology of Medically Related Social Entities",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/omrse.owl",
   :doap/bug-database "https://github.com/ufbmi/OMRSE/issues",
   :foaf/homepage "https://github.com/ufbmi/OMRSE/wiki/OMRSE-Overview",
   :idot/preferredPrefix "OMRSE",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OMRSE",
   :rdfa/uri "http://purl.obolibrary.org/obo/omrse.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OMRSE_",
   :sh/prefix "OMRSE"})

(def ONE
  "An ontology to standardize research output of nutritional epidemiologic studies."
  {:dc11/description
   "An ontology to standardize research output of nutritional epidemiologic studies.",
   :dc11/title "Ontology for Nutritional Epidemiology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/one.owl",
   :doap/bug-database
   "https://github.com/cyang0128/Nutritional-epidemiologic-ontologies/issues",
   :foaf/homepage
   "https://github.com/cyang0128/Nutritional-epidemiologic-ontologies",
   :foaf/page
   "https://github.com/cyang0128/Nutritional-epidemiologic-ontologies",
   :idot/preferredPrefix "ONE",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/foodon"
                       "http://purl.obolibrary.org/obo/ons"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ONE",
   :rdfa/uri "http://purl.obolibrary.org/obo/one.owl#",
   :rdfs/label "Ontology for Nutritional Epidemiology",
   :sh/namespace "http://purl.obolibrary.org/obo/ONE_",
   :sh/prefix "ONE"})

(def ONS
  "An ontology for description of concepts in the nutritional studies domain."
  {:dc11/description
   "An ontology for description of concepts in the nutritional studies domain.",
   :dc11/title "Ontology for Nutritional Studies",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ons.owl",
   :doap/bug-database
   "https://github.com/enpadasi/Ontology-for-Nutritional-Studies/issues",
   :foaf/homepage
   "https://github.com/enpadasi/Ontology-for-Nutritional-Studies",
   :foaf/page "https://github.com/enpadasi/Ontology-for-Nutritional-Studies",
   :idot/preferredPrefix "ONS",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/foodon"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/chebi"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ONS",
   :rdfa/uri "http://purl.obolibrary.org/obo/ons.owl#",
   :rdfs/label "Ontology for Nutritional Studies",
   :sh/namespace "http://purl.obolibrary.org/obo/ONS_",
   :sh/prefix "ONS"})

(def ONTOAVIDA
  "OntoAvida develops an integrated vocabulary for the description of the most widely-used computational approach for studying evolution using digital organisms (i.e., self-replicating computer programs that evolve within a user-defined computational environment)."
  {:dc11/description
   "OntoAvida develops an integrated vocabulary for the description of the most widely-used computational approach for studying evolution using digital organisms (i.e., self-replicating computer programs that evolve within a user-defined computational environment).",
   :dc11/title "OntoAvida: ontology for Avida digital evolution platform",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ontoavida.owl",
   :doap/bug-database "https://gitlab.com/fortunalab/ontoavida/-/issues",
   :foaf/homepage "https://gitlab.com/fortunalab/ontoavida",
   :idot/preferredPrefix "ONTOAVIDA",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/gsso"
                       "http://purl.obolibrary.org/obo/fbcv"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/stato"
                       "http://purl.obolibrary.org/obo/ncit"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ONTOAVIDA",
   :rdfa/uri "http://purl.obolibrary.org/obo/ontoavida.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ONTOAVIDA_",
   :sh/prefix "ONTOAVIDA"})

(def ONTONEO
  "The Obstetric and Neonatal Ontology is a structured controlled vocabulary to provide a representation of the data from electronic health records (EHRs) involved in the care of the pregnant woman, and of her baby."
  {:dc11/description
   "The Obstetric and Neonatal Ontology is a structured controlled vocabulary to provide a representation of the data from electronic health records (EHRs) involved in the care of the pregnant woman, and of her baby.",
   :dc11/title "Obstetric and Neonatal Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ontoneo.owl",
   :doap/bug-database "https://github.com/ontoneo-project/Ontoneo/issues",
   :doap/mailing-list "http://groups.google.com/group/ontoneo-discuss",
   :foaf/homepage :obo/ontoneo.com,
   :idot/preferredPrefix "ONTONEO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ONTONEO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ontoneo.owl#",
   :rdfs/seeAlso "https://bioportal.bioontology.org/ontologies/ONTONEO",
   :sh/namespace "http://purl.obolibrary.org/obo/ONTONEO_",
   :sh/prefix "ONTONEO"})

(def OOSTT
  "An ontology built for representating the organizational components of trauma centers and trauma systems."
  {:dc11/description
   "An ontology built for representating the organizational components of trauma centers and trauma systems.",
   :dc11/title
   "Ontology of Organizational Structures of Trauma centers and Trauma systems",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/oostt.owl",
   :doap/bug-database "https://github.com/OOSTT/OOSTT/issues",
   :foaf/homepage "https://github.com/OOSTT/OOSTT",
   :idot/preferredPrefix "OOSTT",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OOSTT",
   :rdfa/uri "http://purl.obolibrary.org/obo/oostt.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OOSTT_",
   :sh/prefix "OOSTT"})

(def OPL
  "A reference ontology for parasite life cycle stages."
  {:dc11/description     "A reference ontology for parasite life cycle stages.",
   :dc11/title           "Ontology for Parasite LifeCycle",
   :dcat/downloadURL     "http://purl.obolibrary.org/obo/opl.owl",
   :doap/bug-database    "https://github.com/OPL-ontology/OPL/issues",
   :foaf/homepage        "https://github.com/OPL-ontology/OPL",
   :idot/preferredPrefix "OPL",
   :obofmd/activity_status "active",
   :rdf/type             :rdfa/PrefixMapping,
   :rdfa/prefix          "OPL",
   :rdfa/uri             "http://purl.obolibrary.org/obo/opl.owl#",
   :sh/namespace         "http://purl.obolibrary.org/obo/OPL_",
   :sh/prefix            "OPL"})

(def OPMI
  "The Ontology of Precision Medicine and Investigation (OPMI) aims to ontologically represent and standardize various entities and relations associated with precision medicine and related investigations at different conditions."
  {:dc11/description
   "The Ontology of Precision Medicine and Investigation (OPMI) aims to ontologically represent and standardize various entities and relations associated with precision medicine and related investigations at different conditions.",
   :dc11/title "Ontology of Precision Medicine and Investigation",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/opmi.owl",
   :doap/bug-database "https://github.com/OPMI/opmi/issues",
   :doap/mailing-list "http://groups.google.com/group/opmi-discuss",
   :foaf/homepage "https://github.com/OPMI/opmi",
   :idot/preferredPrefix "OPMI",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OPMI",
   :rdfa/uri "http://purl.obolibrary.org/obo/opmi.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OPMI_",
   :sh/prefix "OPMI"})

(def ORNASEQ
  "An application ontology designed to annotate next-generation sequencing experiments performed on RNA."
  {:dc11/description
   "An application ontology designed to annotate next-generation sequencing experiments performed on RNA.",
   :dc11/title "Ontology of RNA Sequencing",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ornaseq.owl",
   :doap/bug-database "https://github.com/safisher/ornaseq/issues",
   :foaf/homepage "http://kim.bio.upenn.edu/software/ornaseq.shtml",
   :idot/preferredPrefix "ORNASEQ",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ORNASEQ",
   :rdfa/uri "http://purl.obolibrary.org/obo/ornaseq.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ORNASEQ_",
   :sh/prefix "ORNASEQ"})

(def OVAE
  "A biomedical ontology in the domain of vaccine adverse events."
  {:dc11/description
   "A biomedical ontology in the domain of vaccine adverse events.",
   :dc11/title "Ontology of Vaccine Adverse Events",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ovae.owl",
   :doap/bug-database "https://github.com/OVAE-Ontology/ovae/issues",
   :foaf/homepage "http://www.violinet.org/ovae/",
   :idot/preferredPrefix "OVAE",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OVAE",
   :rdfa/uri "http://purl.obolibrary.org/obo/ovae.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OVAE_",
   :sh/prefix "OVAE"})

(def OlatDv
  "Life cycle stages for Medaka"
  {:dc11/description "Life cycle stages for Medaka",
   :dc11/title "Medaka Developmental Stages",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/olatdv.owl",
   :doap/bug-database
   "https://github.com/obophenotype/developmental-stage-ontologies/issues",
   :foaf/homepage
   "https://github.com/obophenotype/developmental-stage-ontologies/wiki/OlatDv",
   :foaf/page "https://github.com/obophenotype/developmental-stage-ontologies",
   :idot/preferredPrefix "OlatDv",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "OlatDv",
   :rdfa/uri "http://purl.obolibrary.org/obo/olatdv.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/OlatDv_",
   :sh/prefix "OlatDv"})

(def PATO
  "An ontology of phenotypic qualities (properties, attributes or characteristics)"
  {:dc11/description
   "An ontology of phenotypic qualities (properties, attributes or characteristics)",
   :dc11/title "Phenotype And Trait Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pato.owl",
   :doap/bug-database "https://github.com/pato-ontology/pato/issues",
   :foaf/homepage "https://github.com/pato-ontology/pato/",
   :idot/preferredPrefix "PATO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PATO",
   :rdfa/uri "http://purl.obolibrary.org/obo/pato.owl#",
   :rdfs/seeAlso "https://bioportal.bioontology.org/ontologies/PATO",
   :sh/namespace "http://purl.obolibrary.org/obo/PATO_",
   :sh/prefix "PATO"})

(def PCL
  "Cell types that are provisionally defined by experimental techniques such as single cell or single nucleus transcriptomics rather than a straightforward & coherent set of properties."
  {:dc11/description
   "Cell types that are provisionally defined by experimental techniques such as single cell or single nucleus transcriptomics rather than a straightforward & coherent set of properties.",
   :dc11/title "Provisional Cell Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pcl.owl",
   :doap/bug-database
   "https://github.com/obophenotype/provisional_cell_ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/provisional_cell_ontology",
   :idot/preferredPrefix "PCL",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/cl"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/so"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/omo"
                       "http://purl.obolibrary.org/obo/pr"
                       "http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/nbo"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PCL",
   :rdfa/uri "http://purl.obolibrary.org/obo/pcl.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PCL_",
   :sh/prefix "PCL"})

(def PCO
  "An ontology about groups of interacting organisms such as populations and communities"
  {:dc11/description
   "An ontology about groups of interacting organisms such as populations and communities",
   :dc11/title "Population and Community Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pco.owl",
   :doap/bug-database
   "https://github.com/PopulationAndCommunityOntology/pco/issues",
   :foaf/homepage "https://github.com/PopulationAndCommunityOntology/pco",
   :idot/preferredPrefix "PCO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/caro"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/ncbitaxon"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/iao"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PCO",
   :rdfa/uri "http://purl.obolibrary.org/obo/pco.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PCO_",
   :sh/prefix "PCO"})

(def PDRO
  "An ontology to describe entities related to prescription of drugs"
  {:dc11/description
   "An ontology to describe entities related to prescription of drugs",
   :dc11/title "The Prescription of Drugs Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pdro.owl",
   :doap/bug-database "https://github.com/OpenLHS/PDRO/issues",
   :foaf/homepage "https://github.com/OpenLHS/PDRO",
   :idot/preferredPrefix "PDRO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PDRO",
   :rdfa/uri "http://purl.obolibrary.org/obo/pdro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PDRO_",
   :sh/prefix "PDRO"})

(def PECO
  "A structured, controlled vocabulary which describes the treatments, growing conditions, and/or study types used in plant biology experiments."
  {:dc11/description
   "A structured, controlled vocabulary which describes the treatments, growing conditions, and/or study types used in plant biology experiments.",
   :dc11/title "Plant Experimental Conditions Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/peco.owl",
   :doap/bug-database
   "https://github.com/Planteome/plant-experimental-conditions-ontology/issues",
   :foaf/homepage "http://planteome.org/",
   :foaf/page "http://browser.planteome.org/amigo/term/PECO:0007359",
   :idot/preferredPrefix "PECO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PECO",
   :rdfa/uri "http://purl.obolibrary.org/obo/peco.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PECO_",
   :sh/prefix "PECO"})

(def PHIPO
  "PHIPO is a formal ontology of species-neutral phenotypes observed in pathogen-host interactions."
  {:dc11/description
   "PHIPO is a formal ontology of species-neutral phenotypes observed in pathogen-host interactions.",
   :dc11/title "Pathogen Host Interaction Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/phipo.owl",
   :doap/bug-database "https://github.com/PHI-base/phipo/issues",
   :foaf/homepage "https://github.com/PHI-base/phipo",
   :idot/preferredPrefix "PHIPO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/pato"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PHIPO",
   :rdfa/uri "http://purl.obolibrary.org/obo/phipo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PHIPO_",
   :sh/prefix "PHIPO"})

(def PLANA
  "PLANA, the planarian anatomy ontology, encompasses the anatomy and life cycle stages for both __Schmidtea mediterranea__ biotypes."
  {:dc11/description
   "PLANA, the planarian anatomy ontology, encompasses the anatomy and life cycle stages for both __Schmidtea mediterranea__ biotypes.",
   :dc11/title "planaria-ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/plana.owl",
   :doap/bug-database
   "https://github.com/obophenotype/planaria-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/planaria-ontology",
   :idot/preferredPrefix "PLANA",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/uberon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PLANA",
   :rdfa/uri "http://purl.obolibrary.org/obo/plana.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PLANA_",
   :sh/prefix "PLANA"})

(def PLANP
  "Planarian Phenotype Ontology is an ontology of phenotypes observed in the planarian Schmidtea mediterranea."
  {:dc11/description
   "Planarian Phenotype Ontology is an ontology of phenotypes observed in the planarian Schmidtea mediterranea.",
   :dc11/title "Planarian Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/planp.owl",
   :doap/bug-database
   "https://github.com/obophenotype/planarian-phenotype-ontology/issues",
   :foaf/homepage
   "https://github.com/obophenotype/planarian-phenotype-ontology",
   :idot/preferredPrefix "PLANP",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/plana"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/pato"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PLANP",
   :rdfa/uri "http://purl.obolibrary.org/obo/planp.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PLANP_",
   :sh/prefix "PLANP"})

(def PO
  "The Plant Ontology is a structured vocabulary and database resource that links plant anatomy, morphology and growth and development to plant genomics data."
  {:dc11/description
   "The Plant Ontology is a structured vocabulary and database resource that links plant anatomy, morphology and growth and development to plant genomics data.",
   :dc11/title "Plant Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/po.owl",
   :doap/bug-database "https://github.com/Planteome/plant-ontology/issues",
   :foaf/account :obo/planteome,
   :foaf/homepage "http://browser.planteome.org/amigo",
   :foaf/page "https://github.com/Planteome/plant-ontology",
   :idot/preferredPrefix "PO",
   :obo/IAO_0000136 :obo/NCBITaxon_33090,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PO",
   :rdfa/uri "http://purl.obolibrary.org/obo/po.owl#",
   :rdfs/seeAlso "http://browser.planteome.org/amigo",
   :sh/namespace "http://purl.obolibrary.org/obo/PO_",
   :sh/prefix "PO"})

(def PORO
  "An ontology covering the anatomy of the taxon Porifera (sponges)"
  {:dc11/description
   "An ontology covering the anatomy of the taxon Porifera (sponges)",
   :dc11/title "Porifera Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/poro.owl",
   :doap/bug-database
   "https://github.com/obophenotype/porifera-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/porifera-ontology",
   :idot/preferredPrefix "PORO",
   :obo/IAO_0000136 :obo/NCBITaxon_6040,
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/uberon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PORO",
   :rdfa/uri "http://purl.obolibrary.org/obo/poro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PORO_",
   :sh/prefix "PORO"})

(def PPO
  "An ontology for describing the phenology of individual plants and populations of plants, and for integrating plant phenological data across sources and scales."
  {:dc11/description
   "An ontology for describing the phenology of individual plants and populations of plants, and for integrating plant phenological data across sources and scales.",
   :dc11/title "Plant Phenology Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ppo.owl",
   :doap/bug-database "https://github.com/PlantPhenoOntology/PPO/issues",
   :doap/mailing-list "ppo-discuss@googlegroups.com",
   :foaf/homepage "https://github.com/PlantPhenoOntology/PPO",
   :idot/preferredPrefix "PPO",
   :obo/IAO_0000136 :obo/NCBITaxon_33090,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PPO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ppo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PPO_",
   :sh/prefix "PPO"})

(def PR
  "An ontological representation of protein-related entities"
  {:dc11/description
   "An ontological representation of protein-related entities",
   :dc11/title "PRotein Ontology (PRO)",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pr.owl",
   :doap/bug-database "https://github.com/PROconsortium/PRoteinOntology/issues",
   :foaf/homepage "http://proconsortium.org",
   :idot/preferredPrefix "PR",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PR",
   :rdfa/uri "http://purl.obolibrary.org/obo/pr.owl#",
   :rdfs/seeAlso
   ["http://proconsortium.org"
    "http://bioportal.bioontology.org/ontologies/PR?p=classes&conceptid=http://purl.obolibrary.org/obo/PR_000000001"],
   :sh/namespace "http://purl.obolibrary.org/obo/PR_",
   :sh/prefix "PR"})

(def PROCO
  "PROCO covers process chemistry, the chemical field concerned with scaling up laboratory syntheses to commercially viable processes."
  {:dc11/description
   "PROCO covers process chemistry, the chemical field concerned with scaling up laboratory syntheses to commercially viable processes.",
   :dc11/title "Process Chemistry Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/proco.owl",
   :doap/bug-database "https://github.com/proco-ontology/PROCO/issues",
   :foaf/homepage "https://github.com/proco-ontology/PROCO",
   :idot/preferredPrefix "PROCO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/sbo"
                       "http://purl.obolibrary.org/obo/cheminf"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/obi"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PROCO",
   :rdfa/uri "http://purl.obolibrary.org/obo/proco.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PROCO_",
   :sh/prefix "PROCO"})

(def PSDO
  "Ontology to reproducibly study visualizations of clinical performance"
  {:dc11/description
   "Ontology to reproducibly study visualizations of clinical performance",
   :dc11/title "Performance Summary Display Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/psdo.owl",
   :doap/bug-database "https://github.com/Display-Lab/psdo/issues",
   :foaf/homepage "https://github.com/Display-Lab/psdo",
   :idot/preferredPrefix "PSDO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/stato"
                       "http://purl.obolibrary.org/obo/iao"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PSDO",
   :rdfa/uri "http://purl.obolibrary.org/obo/psdo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PSDO_",
   :sh/prefix "PSDO"})

(def PSO
  "The Plant Stress Ontology describes biotic and abiotic stresses that a plant may encounter."
  {:dc11/description
   "The Plant Stress Ontology describes biotic and abiotic stresses that a plant may encounter.",
   :dc11/title "Plant Stress Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pso.owl",
   :doap/bug-database
   "https://github.com/Planteome/plant-stress-ontology/issues",
   :foaf/homepage "https://github.com/Planteome/plant-stress-ontology",
   :idot/preferredPrefix "PSO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ro"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PSO",
   :rdfa/uri "http://purl.obolibrary.org/obo/pso.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PSO_",
   :sh/prefix "PSO"})

(def PW
  "A controlled vocabulary for annotating gene products to pathways."
  {:dc11/description
   "A controlled vocabulary for annotating gene products to pathways.",
   :dc11/title "Pathway ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pw.owl",
   :doap/bug-database
   "https://github.com/rat-genome-database/PW-Pathway-Ontology/issues",
   :foaf/homepage "http://rgd.mcw.edu/rgdweb/ontology/search.html",
   :foaf/page "https://download.rgd.mcw.edu/ontology/pathway/",
   :idot/preferredPrefix "PW",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PW",
   :rdfa/uri "http://purl.obolibrary.org/obo/pw.owl#",
   :rdfs/seeAlso
   "http://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=PW:0000001",
   :sh/namespace "http://purl.obolibrary.org/obo/PW_",
   :sh/prefix "PW"})

(def PdumDv
  "Life cycle stages for Platynereis dumerilii"
  {:dc11/description "Life cycle stages for Platynereis dumerilii",
   :dc11/title "Platynereis Developmental Stages",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/pdumdv.owl",
   :doap/bug-database
   "https://github.com/obophenotype/developmental-stage-ontologies/issues",
   :foaf/homepage
   "https://github.com/obophenotype/developmental-stage-ontologies/wiki/PdumDv",
   :foaf/page "https://github.com/obophenotype/developmental-stage-ontologies",
   :idot/preferredPrefix "PdumDv",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "PdumDv",
   :rdfa/uri "http://purl.obolibrary.org/obo/pdumdv.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/PdumDv_",
   :sh/prefix "PdumDv"})

(def RBO
  "RBO is an ontology for the effects of radiation on biota in terrestrial and space environments."
  {:dc11/description
   "RBO is an ontology for the effects of radiation on biota in terrestrial and space environments.",
   :dc11/title "Radiation Biology Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/rbo.owl",
   :doap/bug-database
   "https://github.com/Radiobiology-Informatics-Consortium/RBO/issues",
   :foaf/homepage "https://github.com/Radiobiology-Informatics-Consortium/RBO",
   :idot/preferredPrefix "RBO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/chmo"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/uo"
                       "http://purl.obolibrary.org/obo/obi"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "RBO",
   :rdfa/uri "http://purl.obolibrary.org/obo/rbo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/RBO_",
   :sh/prefix "RBO"})

(def RO
  "Relationship types shared across multiple ontologies"
  {:dc11/description "Relationship types shared across multiple ontologies",
   :dc11/title "Relation Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/ro.owl",
   :doap/bug-database "https://github.com/oborel/obo-relations/issues",
   :doap/mailing-list "https://groups.google.com/forum/#!forum/obo-relations",
   :foaf/homepage "https://oborel.github.io/",
   :idot/preferredPrefix "RO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "RO",
   :rdfa/uri "http://purl.obolibrary.org/obo/ro.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/RO_",
   :sh/prefix "RO"})

(def RS
  "Ontology of rat strains"
  {:dc11/description "Ontology of rat strains",
   :dc11/title "Rat Strain Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/rs.owl",
   :doap/bug-database
   "https://github.com/rat-genome-database/RS-Rat-Strain-Ontology/issues",
   :foaf/homepage "http://rgd.mcw.edu/rgdweb/search/strains.html",
   :foaf/page "https://download.rgd.mcw.edu/ontology/rat_strain/",
   :idot/preferredPrefix "RS",
   :obo/IAO_0000136 :obo/NCBITaxon_10114,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "RS",
   :rdfa/uri "http://purl.obolibrary.org/obo/rs.owl#",
   :rdfs/seeAlso
   "http://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=RS:0000457",
   :sh/namespace "http://purl.obolibrary.org/obo/RS_",
   :sh/prefix "RS"})

(def RXNO
  "Connects organic name reactions to their roles in an organic synthesis and to processes in MOP"
  {:dc11/description
   "Connects organic name reactions to their roles in an organic synthesis and to processes in MOP",
   :dc11/title "Name Reaction Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/rxno.owl",
   :doap/bug-database "https://github.com/rsc-ontologies/rxno/issues",
   :doap/mailing-list "chemistry-ontologies@googlegroups.com",
   :foaf/homepage "https://github.com/rsc-ontologies/rxno",
   :idot/preferredPrefix "RXNO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "RXNO",
   :rdfa/uri "http://purl.obolibrary.org/obo/rxno.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/RXNO_",
   :sh/prefix "RXNO"})

(def SBO
  "Terms commonly used in Systems Biology, and in particular in computational modeling."
  {:dc11/description
   "Terms commonly used in Systems Biology, and in particular in computational modeling.",
   :dc11/title "Systems Biology Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/sbo.owl",
   :doap/bug-database "https://github.com/EBI-BioModels/SBO/issues",
   :foaf/homepage "http://www.ebi.ac.uk/sbo/",
   :idot/preferredPrefix "SBO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "SBO",
   :rdfa/uri "http://purl.obolibrary.org/obo/sbo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/SBO_",
   :sh/prefix "SBO"})

(def SCDO
  "An ontology for the standardization of terminology and integration of knowledge about Sickle Cell Disease."
  {:dc11/description
   "An ontology for the standardization of terminology and integration of knowledge about Sickle Cell Disease.",
   :dc11/title "Sickle Cell Disease Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/scdo.owl",
   :doap/bug-database "https://github.com/scdodev/scdo-ontology/issues",
   :foaf/homepage "https://scdontology.h3abionet.org/",
   :idot/preferredPrefix "SCDO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/duo"
                       "http://purl.obolibrary.org/obo/gsso"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/ido"
                       "http://purl.obolibrary.org/obo/pr"
                       "http://purl.obolibrary.org/obo/vo"
                       "http://purl.obolibrary.org/obo/doid"
                       "http://purl.obolibrary.org/obo/eupath"
                       "http://purl.obolibrary.org/obo/stato"
                       "http://purl.obolibrary.org/obo/nbo"
                       "http://purl.obolibrary.org/obo/apollo_sv"
                       "http://purl.obolibrary.org/obo/idomal"
                       "http://purl.obolibrary.org/obo/mp"
                       "http://purl.obolibrary.org/obo/exo"
                       "http://purl.obolibrary.org/obo/gaz"
                       "http://purl.obolibrary.org/obo/obi"
                       "http://purl.obolibrary.org/obo/uo"
                       "http://purl.obolibrary.org/obo/sbo"
                       "http://purl.obolibrary.org/obo/dron"
                       "http://purl.obolibrary.org/obo/aro"
                       "http://purl.obolibrary.org/obo/hp"
                       "http://purl.obolibrary.org/obo/ogms"
                       "http://purl.obolibrary.org/obo/opmi"
                       "http://purl.obolibrary.org/obo/chmo"
                       "http://purl.obolibrary.org/obo/ncit"
                       "http://purl.obolibrary.org/obo/symp"
                       "http://purl.obolibrary.org/obo/ico"
                       "http://purl.obolibrary.org/obo/vt"
                       "http://purl.obolibrary.org/obo/cmo"
                       "http://purl.obolibrary.org/obo/envo"
                       "http://purl.obolibrary.org/obo/hsapdv"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "SCDO",
   :rdfa/uri "http://purl.obolibrary.org/obo/scdo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/SCDO_",
   :sh/prefix "SCDO"})

(def SEPIO
  "An ontology for representing the provenance of scientific claims and the evidence that supports them."
  {:dc11/description
   "An ontology for representing the provenance of scientific claims and the evidence that supports them.",
   :dc11/title "Scientific Evidence and Provenance Information Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/sepio.owl",
   :doap/bug-database
   "https://github.com/monarch-initiative/SEPIO-ontology/issues",
   :foaf/homepage "https://github.com/monarch-initiative/SEPIO-ontology",
   :idot/preferredPrefix "SEPIO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "SEPIO",
   :rdfa/uri "http://purl.obolibrary.org/obo/sepio.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/SEPIO_",
   :sh/prefix "SEPIO"})

(def SIBO
  "Social Behavior in insects"
  {:dc11/description     "Social Behavior in insects",
   :dc11/title           "Social Insect Behavior Ontology",
   :dcat/downloadURL     "http://purl.obolibrary.org/obo/sibo.owl",
   :doap/bug-database    "https://github.com/obophenotype/sibo/issues",
   :foaf/homepage        "https://github.com/obophenotype/sibo",
   :idot/preferredPrefix "SIBO",
   :obofmd/activity_status "orphaned",
   :rdf/type             :rdfa/PrefixMapping,
   :rdfa/prefix          "SIBO",
   :rdfa/uri             "http://purl.obolibrary.org/obo/sibo.owl#",
   :sh/namespace         "http://purl.obolibrary.org/obo/SIBO_",
   :sh/prefix            "SIBO"})

(def SO
  "A structured controlled vocabulary for sequence annotation, for the exchange of annotation data and for the description of sequence objects in databases."
  {:dc11/description
   "A structured controlled vocabulary for sequence annotation, for the exchange of annotation data and for the description of sequence objects in databases.",
   :dc11/title "Sequence types and features ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/so.owl",
   :doap/bug-database
   "https://github.com/The-Sequence-Ontology/SO-Ontologies/issues",
   :doap/mailing-list "https://sourceforge.net/p/song/mailman/song-devel/",
   :foaf/homepage "http://www.sequenceontology.org/",
   :foaf/page "https://en.wikipedia.org/wiki/Sequence_Ontology",
   :idot/preferredPrefix "SO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "SO",
   :rdfa/uri "http://purl.obolibrary.org/obo/so.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/SO_",
   :sh/prefix "SO"})

(def SPD
  "An ontology for spider comparative biology including anatomical parts (e.g. leg, claw), behavior (e.g. courtship, combing) and products (i.g. silk, web, borrow)."
  {:dc11/description
   "An ontology for spider comparative biology including anatomical parts (e.g. leg, claw), behavior (e.g. courtship, combing) and products (i.g. silk, web, borrow).",
   :dc11/title "Spider Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/spd.owl",
   :doap/bug-database "https://github.com/obophenotype/spider-ontology/issues",
   :foaf/homepage "http://research.amnh.org/atol/files/",
   :idot/preferredPrefix "SPD",
   :obo/IAO_0000136 :obo/NCBITaxon_6893,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "SPD",
   :rdfa/uri "http://purl.obolibrary.org/obo/spd.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/SPD_",
   :sh/prefix "SPD"})

(def STATO
  "STATO is a general-purpose STATistics Ontology. Its aim is to provide coverage for processes such as statistical tests, their conditions of application, and information needed or resulting from statistical methods, such as probability distributions, variables, spread and variation metrics. STATO also covers aspects of experimental design and description of plots and graphical representations commonly used to provide visual cues of data distribution or layout and to assist review of the results."
  {:dc11/description
   "STATO is a general-purpose STATistics Ontology. Its aim is to provide coverage for processes such as statistical tests, their conditions of application, and information needed or resulting from statistical methods, such as probability distributions, variables, spread and variation metrics. STATO also covers aspects of experimental design and description of plots and graphical representations commonly used to provide visual cues of data distribution or layout and to assist review of the results.",
   :dc11/title "The Statistical Methods Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/stato.owl",
   :doap/bug-database "https://github.com/ISA-tools/stato/issues",
   :foaf/homepage "http://stato-ontology.org/",
   :idot/preferredPrefix "STATO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "STATO",
   :rdfa/uri "http://purl.obolibrary.org/obo/stato.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/STATO_",
   :sh/prefix "STATO"})

(def SWO
  "The Software Ontology (SWO) is a resource for describing software tools, their types, tasks, versions, provenance and associated data. It contains detailed information on licensing and formats as well as software applications themselves, mainly (but not limited) to the bioinformatics community."
  {:dc11/description
   "The Software Ontology (SWO) is a resource for describing software tools, their types, tasks, versions, provenance and associated data. It contains detailed information on licensing and formats as well as software applications themselves, mainly (but not limited) to the bioinformatics community.",
   :dc11/title "Software ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/swo.owl",
   :doap/bug-database "https://github.com/allysonlister/swo/issues",
   :foaf/homepage "https://github.com/allysonlister/swo",
   :idot/preferredPrefix "SWO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "SWO",
   :rdfa/uri "http://purl.obolibrary.org/obo/swo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/SWO_",
   :sh/prefix "SWO"})

(def SYMP
  "An ontology of disease symptoms, with symptoms encompasing perceived changes in function, sensations or appearance reported by a patient indicative of a disease."
  {:dc11/description
   "An ontology of disease symptoms, with symptoms encompasing perceived changes in function, sensations or appearance reported by a patient indicative of a disease.",
   :dc11/title "Symptom Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/symp.owl",
   :doap/bug-database
   "https://github.com/DiseaseOntology/SymptomOntology/issues",
   :foaf/homepage
   "http://symptomontologywiki.igs.umaryland.edu/mediawiki/index.php/Main_Page",
   :idot/preferredPrefix "SYMP",
   :obo/IAO_0000136 :obo/NCBITaxon_9606,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "SYMP",
   :rdfa/uri "http://purl.obolibrary.org/obo/symp.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/SYMP_",
   :sh/prefix "SYMP"})

(def T4FS
  "A terminology for the skills necessary to make data FAIR and to keep it FAIR."
  {:dc11/description
   "A terminology for the skills necessary to make data FAIR and to keep it FAIR.",
   :dc11/title "terms4FAIRskills",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/t4fs.owl",
   :doap/bug-database
   "https://github.com/terms4fairskills/FAIRterminology/issues",
   :foaf/homepage "https://github.com/terms4fairskills/FAIRterminology",
   :idot/preferredPrefix "T4FS",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "T4FS",
   :rdfa/uri "http://purl.obolibrary.org/obo/t4fs.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/T4FS_",
   :sh/prefix "T4FS"})

(def TAXRANK
  "A vocabulary of taxonomic ranks (species, family, phylum, etc)"
  {:dc11/description
   "A vocabulary of taxonomic ranks (species, family, phylum, etc)",
   :dc11/title "Taxonomic rank vocabulary",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/taxrank.owl",
   :doap/bug-database "https://github.com/phenoscape/taxrank/issues",
   :foaf/homepage "https://github.com/phenoscape/taxrank",
   :idot/preferredPrefix "TAXRANK",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "TAXRANK",
   :rdfa/uri "http://purl.obolibrary.org/obo/taxrank.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/TAXRANK_",
   :sh/prefix "TAXRANK"})

(def TO
  "A controlled vocabulary to describe phenotypic traits in plants."
  {:dc11/description
   "A controlled vocabulary to describe phenotypic traits in plants.",
   :dc11/title "Plant Trait Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/to.owl",
   :doap/bug-database
   "https://github.com/Planteome/plant-trait-ontology/issues",
   :foaf/homepage "http://browser.planteome.org/amigo",
   :foaf/page
   "http://browser.planteome.org/amigo/term/TO:0000387#display-lineage-tab",
   :idot/preferredPrefix "TO",
   :obo/IAO_0000136 :obo/NCBITaxon_33090,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "TO",
   :rdfa/uri "http://purl.obolibrary.org/obo/to.owl#",
   :rdfs/seeAlso
   "http://browser.planteome.org/amigo/term/TO:0000387#display-lineage-tab",
   :sh/namespace "http://purl.obolibrary.org/obo/TO_",
   :sh/prefix "TO"})

(def TRANS
  "An ontology representing the disease transmission process during which the pathogen is transmitted directly or indirectly from its natural reservoir, a susceptible host or source to a new host."
  {:dc11/description
   "An ontology representing the disease transmission process during which the pathogen is transmitted directly or indirectly from its natural reservoir, a susceptible host or source to a new host.",
   :dc11/title "Pathogen Transmission Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/trans.owl",
   :doap/bug-database
   "https://github.com/DiseaseOntology/PathogenTransmissionOntology/issues",
   :foaf/homepage
   "https://github.com/DiseaseOntology/PathogenTransmissionOntology",
   :idot/preferredPrefix "TRANS",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "TRANS",
   :rdfa/uri "http://purl.obolibrary.org/obo/trans.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/TRANS_",
   :sh/prefix "TRANS"})

(def TTO
  "An ontology covering the taxonomy of teleosts (bony fish)"
  {:dc11/description
   "An ontology covering the taxonomy of teleosts (bony fish)",
   :dc11/title "Teleost taxonomy ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/tto.owl",
   :doap/bug-database
   "https://github.com/phenoscape/teleost-taxonomy-ontology/issues",
   :foaf/homepage "https://github.com/phenoscape/teleost-taxonomy-ontology",
   :idot/preferredPrefix "TTO",
   :obo/IAO_0000136 :obo/NCBITaxon_32443,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "TTO",
   :rdfa/uri "http://purl.obolibrary.org/obo/tto.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/TTO_",
   :sh/prefix "TTO"})

(def TXPO
  "TOXic Process Ontology (TXPO) systematizes a wide variety of terms involving toxicity courses and processes. The first version of TXPO focuses on liver toxicity."
  {:dc11/description
   "TOXic Process Ontology (TXPO) systematizes a wide variety of terms involving toxicity courses and processes. The first version of TXPO focuses on liver toxicity.",
   :dc11/title "Toxic Process Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/txpo.owl",
   :doap/bug-database "https://github.com/txpo-ontology/TXPO/issues",
   :foaf/homepage "https://toxpilot.nibiohn.go.jp/",
   :idot/preferredPrefix "TXPO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "TXPO",
   :rdfa/uri "http://purl.obolibrary.org/obo/txpo.owl#",
   :rdfs/seeAlso ["http://bioportal.bioontology.org/ontologies/TXPO?p=classes"
                  "https://toxpilot.nibiohn.go.jp/"],
   :sh/namespace "http://purl.obolibrary.org/obo/TXPO_",
   :sh/prefix "TXPO"})

(def UBREL
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "file:/Users/michaelashburner/Desktop/gaz/gaz.obo"
   :rdfa/prefix "UBREL"})

(def UBERON
  "An integrated cross-species anatomy ontology covering animals and bridging multiple species-specific ontologies"
  {:dc11/description
   "An integrated cross-species anatomy ontology covering animals and bridging multiple species-specific ontologies",
   :dc11/title "Uberon multi-species anatomy ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/uberon.owl",
   :disco/fundedBy
   ["https://taggs.hhs.gov/Detail/AwardDetail?arg_AwardNum=R24OD011883&arg_ProgOfficeCode=205"
    "https://grantome.com/grant/NIH/R01-HG004838"
    "https://www.nsf.gov/awardsearch/showAward?AWD_ID=0956049"
    "https://taggs.hhs.gov/Detail/AwardDetail?arg_AwardNum=P41HG002273&arg_ProgOfficeCode=55"],
   :doap/bug-database "https://github.com/obophenotype/uberon/issues",
   :doap/mailing-list
   "https://lists.sourceforge.net/lists/listinfo/obo-anatomy",
   :foaf/account :obo/uberanat,
   :foaf/homepage "http://uberon.org",
   :foaf/page "http://en.wikipedia.org/wiki/Uberon",
   :idot/preferredPrefix "UBERON",
   :obo/IAO_0000136 :obo/NCBITaxon_33208,
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/cl"
                       "http://purl.obolibrary.org/obo/pr"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "UBERON",
   :rdfa/uri "http://purl.obolibrary.org/obo/uberon.owl#",
   :rdfs/label "Uberon",
   :rdfs/seeAlso
   ["https://knowledge-space.org/index.php/pages/view/UBERON:0000061"
    "http://amigo.geneontology.org/amigo/term/UBERON:0001062#display-lineage-tab"
    "http://bgee.org/?page=gene"
    "http://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=UBERON:0001062"
    "http://fantom.gsc.riken.jp/5/sstar/UBERON:0001890"],
   :sh/namespace "http://purl.obolibrary.org/obo/UBERON_",
   :sh/prefix "UBERON"})

(def UO
  "Metrical units for use in conjunction with PATO"
  {:dc11/description "Metrical units for use in conjunction with PATO",
   :dc11/title "Units of measurement ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/uo.owl",
   :doap/bug-database
   "https://github.com/bio-ontology-research-group/unit-ontology/issues",
   :foaf/homepage
   "https://github.com/bio-ontology-research-group/unit-ontology",
   :idot/preferredPrefix "UO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "UO",
   :rdfa/uri "http://purl.obolibrary.org/obo/uo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/UO_",
   :sh/prefix "UO"})

(def UPHENO
  "The uPheno ontology integrates multiple phenotype ontologies into a unified cross-species phenotype ontology."
  {:dc11/description
   "The uPheno ontology integrates multiple phenotype ontologies into a unified cross-species phenotype ontology.",
   :dc11/title "Unified phenotype ontology (uPheno)",
   :dcat/downloadURL "https://raw.githubusercontent.com/obophenotype/upheno/7f56b3b4d2adc2b266eeb6694205c42db967bcc2/imports/extra.owl",
   :doap/bug-database "https://github.com/obophenotype/upheno/issues",
   :doap/mailing-list
   "https://groups.google.com/forum/#!forum/phenotype-ontologies-editors",
   :foaf/homepage "https://github.com/obophenotype/upheno",
   :idot/preferredPrefix "UPHENO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "UPHENO",
   :rdfa/uri "http://purl.obolibrary.org/obo/upheno.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/UPHENO_",
   :sh/prefix "UPHENO"})

(def VBO
  "Vertebrate Breed Ontology is an ontology created to serve as a single computable resource for vertebrate breed names."
  {:dc11/description
   "Vertebrate Breed Ontology is an ontology created to serve as a single computable resource for vertebrate breed names.",
   :dc11/title "Vertebrate Breed Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vbo.owl",
   :doap/bug-database
   "https://github.com/monarch-initiative/vertebrate-breed-ontology/issues",
   :foaf/homepage
   "https://github.com/monarch-initiative/vertebrate-breed-ontology",
   :idot/preferredPrefix "VBO",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/ncbitaxon"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "VBO",
   :rdfa/uri "http://purl.obolibrary.org/obo/vbo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/VBO_",
   :sh/prefix "VBO"})

(def VO
  "VO is a biomedical ontology in the domain of vaccine and vaccination."
  {:dc11/description
   "VO is a biomedical ontology in the domain of vaccine and vaccination.",
   :dc11/title "Vaccine Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vo.owl"
   :doap/bug-database "https://github.com/vaccineontology/VO/issues",
   :foaf/homepage "http://www.violinet.org/vaccineontology",
   :idot/preferredPrefix "VO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "VO",
   :rdfa/uri "http://purl.obolibrary.org/obo/vo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/VO_",
   :sh/prefix "VO"})

(def VT
  "An ontology of traits covering vertebrates"
  {:dc11/description "An ontology of traits covering vertebrates",
   :dc11/title "Vertebrate trait ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vt.owl",
   :doap/bug-database
   "https://github.com/AnimalGenome/vertebrate-trait-ontology/issues",
   :foaf/homepage "https://github.com/AnimalGenome/vertebrate-trait-ontology",
   :idot/preferredPrefix "VT",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "VT",
   :rdfa/uri "http://purl.obolibrary.org/obo/vt.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/VT_",
   :sh/prefix "VT"})

(def VTO
  "Comprehensive hierarchy of extinct and extant vertebrate taxa."
  {:dc11/description
   "Comprehensive hierarchy of extinct and extant vertebrate taxa.",
   :dc11/title "Vertebrate Taxonomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vto.owl",
   :doap/bug-database
   "https://github.com/phenoscape/vertebrate-taxonomy-ontology/issues",
   :foaf/homepage "https://github.com/phenoscape/vertebrate-taxonomy-ontology",
   :idot/preferredPrefix "VTO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "VTO",
   :rdfa/uri "http://purl.obolibrary.org/obo/vto.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/VTO_",
   :sh/prefix "VTO"})

(def VariO
  "Variation Ontology, VariO, is an ontology for standardized, systematic description of effects, consequences and mechanisms of variations."
  {:dc11/description
   "Variation Ontology, VariO, is an ontology for standardized, systematic description of effects, consequences and mechanisms of variations.",
   :dc11/title "Variation Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/vario.owl",
   :foaf/homepage "http://variationontology.org",
   :idot/preferredPrefix "VariO",
   :obofmd/activity_status "orphaned",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "VariO",
   :rdfa/uri "http://purl.obolibrary.org/obo/vario.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/VariO_",
   :sh/prefix "VariO"})

(def WBPhenotype
  "A structured controlled vocabulary of <i>Caenorhabditis elegans</i> phenotypes"
  {:dc11/description
   "A structured controlled vocabulary of <i>Caenorhabditis elegans</i> phenotypes",
   :dc11/title "C. elegans phenotype",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/wbphenotype.owl",
   :doap/bug-database
   "https://github.com/obophenotype/c-elegans-phenotype-ontology/issues",
   :foaf/homepage
   "https://github.com/obophenotype/c-elegans-phenotype-ontology",
   :idot/preferredPrefix "WBPhenotype",
   :obo/IAO_0000136 :obo/NCBITaxon_6237,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "WBPhenotype",
   :rdfa/uri "http://purl.obolibrary.org/obo/wbphenotype.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/WBPhenotype_",
   :sh/prefix "WBPhenotype"})

(def WBbt
  "A structured controlled vocabulary of the anatomy of <i>Caenorhabditis elegans</i>."
  {:dc11/description
   "A structured controlled vocabulary of the anatomy of <i>Caenorhabditis elegans</i>.",
   :dc11/title "C. elegans Gross Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/wbbt.owl",
   :doap/bug-database
   "https://github.com/obophenotype/c-elegans-gross-anatomy-ontology/issues",
   :foaf/homepage
   "https://github.com/obophenotype/c-elegans-gross-anatomy-ontology",
   :idot/preferredPrefix "WBbt",
   :obo/IAO_0000136 :obo/NCBITaxon_6237,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "WBbt",
   :rdfa/uri "http://purl.obolibrary.org/obo/wbbt.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/WBbt_",
   :sh/prefix "WBbt"})

(def WBls
  "A structured controlled vocabulary of the development of <i>Caenorhabditis elegans</i>."
  {:dc11/description
   "A structured controlled vocabulary of the development of <i>Caenorhabditis elegans</i>.",
   :dc11/title "C. elegans development ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/wbls.owl",
   :doap/bug-database
   "https://github.com/obophenotype/c-elegans-development-ontology/issues",
   :foaf/homepage
   "https://github.com/obophenotype/c-elegans-development-ontology",
   :idot/preferredPrefix "WBls",
   :obo/IAO_0000136 :obo/NCBITaxon_6237,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "WBls",
   :rdfa/uri "http://purl.obolibrary.org/obo/wbls.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/WBls_",
   :sh/prefix "WBls"})

(def XAO
  "XAO represents the anatomy and development of the African frogs Xenopus laevis and tropicalis."
  {:dc11/description
   "XAO represents the anatomy and development of the African frogs Xenopus laevis and tropicalis.",
   :dc11/title "Xenopus Anatomy Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xao.owl",
   :doap/bug-database "https://github.com/xenopus-anatomy/xao/issues",
   :foaf/homepage "http://www.xenbase.org/anatomy/xao.do?method=display",
   :idot/preferredPrefix "XAO",
   :obo/IAO_0000136 :obo/NCBITaxon_8353,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "XAO",
   :rdfa/uri "http://purl.obolibrary.org/obo/xao.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/XAO_",
   :sh/prefix "XAO"})

(def XCO
  "Conditions under which physiological and morphological measurements are made both in the clinic and in studies involving humans or model organisms."
  {:dc11/description
   "Conditions under which physiological and morphological measurements are made both in the clinic and in studies involving humans or model organisms.",
   :dc11/title "Experimental condition ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xco.owl",
   :doap/bug-database
   "https://github.com/rat-genome-database/XCO-experimental-condition-ontology/issues",
   :foaf/homepage
   "https://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=XCO:0000000",
   :foaf/page "https://download.rgd.mcw.edu/ontology/experimental_condition/",
   :idot/preferredPrefix "XCO",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "XCO",
   :rdfa/uri "http://purl.obolibrary.org/obo/xco.owl#",
   :rdfs/seeAlso
   "http://rgd.mcw.edu/rgdweb/ontology/view.html?acc_id=XCO:0000000",
   :sh/namespace "http://purl.obolibrary.org/obo/XCO_",
   :sh/prefix "XCO"})

(def XLMOD
  "A structured controlled vocabulary for cross-linking reagents used with proteomics mass spectrometry."
  {:dc11/description
   "A structured controlled vocabulary for cross-linking reagents used with proteomics mass spectrometry.",
   :dc11/title
   "HUPO-PSI cross-linking and derivatization reagents controlled vocabulary",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xlmod.owl",
   :doap/bug-database "https://github.com/HUPO-PSI/xlmod-CV/issues",
   :doap/mailing-list "psidev-ms-vocab@lists.sourceforge.net",
   :foaf/homepage "http://www.psidev.info/groups/controlled-vocabularies",
   :foaf/page "http://www.psidev.info/groups/controlled-vocabularies",
   :idot/preferredPrefix "XLMOD",
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "XLMOD",
   :rdfa/uri "http://purl.obolibrary.org/obo/xlmod.owl#",
   :rdfs/label "xlmod",
   :sh/namespace "http://purl.obolibrary.org/obo/XLMOD_",
   :sh/prefix "XLMOD"})

(def XPO
  "XPO represents anatomical, cellular, and gene function phenotypes occurring throughout the development of the African frogs Xenopus laevis and tropicalis."
  {:dc11/description
   "XPO represents anatomical, cellular, and gene function phenotypes occurring throughout the development of the African frogs Xenopus laevis and tropicalis.",
   :dc11/title "Xenopus Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/xpo.owl",
   :doap/bug-database
   "https://github.com/obophenotype/xenopus-phenotype-ontology/issues",
   :foaf/homepage "https://github.com/obophenotype/xenopus-phenotype-ontology",
   :idot/preferredPrefix "XPO",
   :obo/IAO_0000136 :obo/NCBITaxon_8353,
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/go"
                       "http://purl.obolibrary.org/obo/xao"
                       "http://purl.obolibrary.org/obo/chebi"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/cl"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/iao"
                       "http://purl.obolibrary.org/obo/ro"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "XPO",
   :rdfa/uri "http://purl.obolibrary.org/obo/xpo.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/XPO_",
   :sh/prefix "XPO"})

(def ZECO
  "Experimental conditions applied to zebrafish, developed to facilitate experiment condition annotation at ZFIN"
  {:dc11/description
   "Experimental conditions applied to zebrafish, developed to facilitate experiment condition annotation at ZFIN",
   :dc11/title "Zebrafish Experimental Conditions Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zeco.owl",
   :doap/bug-database
   "https://github.com/ybradford/zebrafish-experimental-conditions-ontology/issues",
   :foaf/homepage
   "https://github.com/ybradford/zebrafish-experimental-conditions-ontology",
   :idot/preferredPrefix "ZECO",
   :obo/IAO_0000136 :obo/NCBITaxon_7954,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ZECO",
   :rdfa/uri "http://purl.obolibrary.org/obo/zeco.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ZECO_",
   :sh/prefix "ZECO"})

(def ZFA
  "A structured controlled vocabulary of the anatomy and development of the Zebrafish"
  {:dc11/description
   "A structured controlled vocabulary of the anatomy and development of the Zebrafish",
   :dc11/title "Zebrafish anatomy and development ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zfa.owl",
   :doap/bug-database
   "https://github.com/cerivs/zebrafish-anatomical-ontology/issues",
   :foaf/homepage
   "https://wiki.zfin.org/display/general/Anatomy+Atlases+and+Resources",
   :idot/preferredPrefix "ZFA",
   :obo/IAO_0000136 :obo/NCBITaxon_7954,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ZFA",
   :rdfa/uri "http://purl.obolibrary.org/obo/zfa.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ZFA_",
   :sh/prefix "ZFA"})

(def ZFS
  "Developmental stages of the Zebrafish"
  {:dc11/description "Developmental stages of the Zebrafish",
   :dc11/title "Zebrafish developmental stages ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zfs.owl",
   :doap/bug-database
   "https://github.com/cerivs/zebrafish-anatomical-ontology/issues",
   :foaf/homepage
   "https://wiki.zfin.org/display/general/Anatomy+Atlases+and+Resources",
   :foaf/page
   "https://github.com/obophenotype/developmental-stage-ontologies/wiki/ZFS",
   :idot/preferredPrefix "ZFS",
   :obo/IAO_0000136 :obo/NCBITaxon_7954,
   :obofmd/activity_status "active",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ZFS",
   :rdfa/uri "http://purl.obolibrary.org/obo/zfs.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ZFS_",
   :sh/prefix "ZFS"})

(def ZP
  "The Zebrafish Phenotype Ontology formally defines all phenotypes of the Zebrafish model organism."
  {:dc11/description
   "The Zebrafish Phenotype Ontology formally defines all phenotypes of the Zebrafish model organism.",
   :dc11/title "Zebrafish Phenotype Ontology",
   :dcat/downloadURL "http://purl.obolibrary.org/obo/zp.owl",
   :doap/bug-database
   "https://github.com/obophenotype/zebrafish-phenotype-ontology/issues",
   :foaf/homepage
   "https://github.com/obophenotype/zebrafish-phenotype-ontology",
   :idot/preferredPrefix "ZP",
   :obofmd/activity_status "active",
   :obofmd/depends_on ["http://purl.obolibrary.org/obo/uberon"
                       "http://purl.obolibrary.org/obo/ro"
                       "http://purl.obolibrary.org/obo/zfa"
                       "http://purl.obolibrary.org/obo/bspo"
                       "http://purl.obolibrary.org/obo/pato"
                       "http://purl.obolibrary.org/obo/bfo"
                       "http://purl.obolibrary.org/obo/go"],
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ZP",
   :rdfa/uri "http://purl.obolibrary.org/obo/zp.owl#",
   :sh/namespace "http://purl.obolibrary.org/obo/ZP_",
   :sh/prefix "ZP"})
