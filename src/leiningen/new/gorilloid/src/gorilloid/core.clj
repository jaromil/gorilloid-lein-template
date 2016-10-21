(ns {{ns-name}}.core
  (:require [clj-http.client :as client]
            [clj-http.cookies :as cookies]
            [clojure.string :as string]
            [clojure.walk :refer :all]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [gorilla-repl.table :refer :all]
            [clojure.contrib.humanize :refer :all]
            )
  (:gen-class)
  )

(defn hello-world []
  (println "Hello World."))
