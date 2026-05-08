;;
;; Program: clojure-helloworld.clj
;;          prints "hello world". Useful as a first test to the
;;          installation of clojure and supportive tools.
;; Programmer:  Carlos.Molina@cl.cam.ac.uk
;; Date         8 May 2026
;;              Department of Computer Science and Technology,
;;              University of Cambridge. 
;; Source: I took inspiration from 
;;   https://clojurebridgelondon.github.io/community-docs/docs/getting-started/helloworld/
;;
;; Platform: I have tested it under
;; - a MacBook Pro with Sequoia 15.7.3
;; - Clojure CLI version 1.12.4.1618
;;   Installed with: brew install clojure/tools/clojure
;; - Leiningen 2.12.0 on Java 25.0.2 OpenJDK 64-Bit Server VM
;;   Installed with: brew install leiningen
;;
;; Run:
;; 1) Create a project:
;;    carlos@clojure% lein new clojure-helloworld
;; 2) Edit the project.clj file (that lein created by default) and 
;;    add   :main clojure-helloworld.core) at the end
;;    vi project.clj
;; 3) Edit the core.clj skeleton file (that lein created by default) to 
;;    produce this core.clj
;;    carlos@clojure_helloworld% pwd
;;    /Users/carlosmolina/code/clojure/clojure-helloworld/src/clojure_helloworld
;;    vi core.clj
;;
;; carlos@clojure_helloworld% lein run   
;; Hello world!
;;

(ns clojure-helloworld.core)

(defn -main 
  "This is the function to print: Hello world!, in clojure language"
  []
  (println "Hello world!"))

