;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilloid REPL
;;;
;;; Small template to write an application based on Gorilla REPL
;;;
;; **

;; @@
(ns {{ns-name}}.term
  (:require
   [clojure.repl :refer :all]
   [clojure.string :as string]
   [clojure.data.json :as json]
   [clojure.contrib.humanize :refer :all]
   [{{ns-name}}.core :refer :all :reload :true])
  (:use [gorilla-repl core table latex html]
        ))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=
