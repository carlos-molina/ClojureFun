;; Program: factorial.clj
;;          Shows how clojure uses a loop and recursion to
;;          to implement the factorial function.
;;
;; Programmer:  Carlos.Molina@cl.cam.ac.uk
;; Date         9 May 2026
;;              Department of Computer Science and Technology,
;;              University of Cambridge.
;; Source: I took code of the factorial function from
;;         A history of Clojure, Rich Hickey, Proc. of the ACM 
;;         on Programming Languages, N.71, V.4 2020
;;         Functions are explained in several books and web pages.
;;         For example see Clojure, Karthikeyan A K, 
;;         Chapter 9. Functions
;;         https://clojure-book.gitlab.io/book.html#_functions
;; Run:
;; 1) Create a project:
;;    carlos@% lein new factorial 
;; 2) Edit project.clj file to add
;;    :main factorial.core) at the end
;; 3) Edit core.clj, In this example I call the factorial 
;;    function with n=4 
;; 4) carlos@% lein run
;;    24
;;

(ns factorial.core)


(defn factorial [n]     
   (loop [cnt n, acc 1] ;; counter set to n, accumulator set to 1
      (if (zero? cnt)
        acc
        (recur (dec cnt) (* acc cnt)))))


(defn -main
[] (println(factorial 4)))


