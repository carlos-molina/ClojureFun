# Factorial

This program shows hows how clojure uses a loop and recursion to implement the factorial function.
 
## Source and references
I copied and pasted the code of the factorial function from
[A history of Clojure, Rich Hickey, Proc. of the ACM on Programming Languages, N.71, V.4 2020.](https://doi.org/10.1145/3386321 "Rich Hickey") and I call it from a main function.]
An [open source copy](https://docdrop.org/download_annotation_doc/3386321-trk2f.pdf?ref=felixbarbalet.com "Rich Hickey") is currently available.

Function definition, calls and arguments are explained in several books and web pages.
See for example Chapter 9 of [Clojure, Karthikeyan A K](https://clojure-book.gitlab.io/book.html#_functions) "Karthikeyan book")
 


## Platform 

1.  I have a MacBook Pro with Sequoia 15.7.3

1.  I have installed Clojure CLI version 1.12.4.1618

     Installed it with: % brew install clojure/tools/clojure

1.   I have installed Leiningen 2.12.0 on Java 25.0.2 OpenJDK 64-Bit Server VM
      
      I installed it with: % brew install leiningen

## How to run
1. Create a project:
   carlos@% lein new factorial

1. Edit project.clj file to add
   :main factorial.core) at the end

1. Edit core.clj, In this example I call the factorial
   function with n=4

1. carlos@% lein run
   24

## Step by step guidance
The command_line_steps.txt file contains copy and paste of the command lines that I executed to created and execute factorial.clj.


## Corresponding author  
carlos.molina@cl.cam.ac.uk   
Department of Computer Science and Technology    
(The Computer Lab),    
University of Cambridge.
 
