;;
;; Program: project.clj file to support the execution of
;;          factorial.clj 
;;
;; Programmer:  Carlos.Molina@cl.cam.ac.uk
;; Date         8 May 2026
;;              Department of Computer Science and Technology,
;;              University of Cambridge.
;; Source:      A History of Clojure, RICH HICKEY, 
;;              A history of Clojure, Rich Hickey, 
;;              Proc. of the ACM on Programming Languages, 
;;              N.71, V.4 2020
;;              https://doi.org/10.1145/3386321 
;;
;; 

(defproject factorial "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.2"]]
  :repl-options {:init-ns factorial.core}
  :main factorial.core)
