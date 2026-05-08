;; Program: project.clj file to support the execution of
;;          clojure-helloworld.clj 
;;
;; Programmer:  Carlos.Molina@cl.cam.ac.uk
;; Date         8 May 2026
;;              Department of Computer Science and Technology,
;;              University of Cambridge.
;; Source: I took inspiration from
;;   https://clojurebridgelondon.github.io/community-docs/docs/getting-started/helloworld/
;;

(defproject clojure-helloworld "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.2"]]
  :repl-options {:init-ns clojure-helloworld.core}
  :main clojure-helloworld.core)
