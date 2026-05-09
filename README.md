# Clojurefun
This clojurefun repo contains some examples of programs written in the clojure language.


## The clojure functional programing language
Clojure is general-purpose programming language released in 2007. It is a functional programming language and a good alternative to consider for the implementation of multi-threaded applications that demand, immutable, persistent data structures and concurrency. 

In clojure, lists, vectors, maps and sets, strings, and all the scalar types, are immutable. Moreover, among other features, it includes, built-in support for concurrency via transactional memory and asynchronous agents. As such, it is free from the complexity of mutex locks and helps to design and implement clean and correct applications. More importantly, in comparison with code written in non-functional programming languages, clojure code is concise, easy to read and examine for correctness and, by extension, less buggy.

As explained in [A history of Clojure, Rich Hickey, Proc. of the ACM on Programming Languages, N.71, V.4 2020.](https://doi.org/10.1145/3386321 "Rich Hickey"), clojure is a dialect of List and is implemented and runs on top of the Java VM. From this position, it can interact with and take advantage of Java libraries. With these features, it has been welcome in industries as diverse as finance, climate science, retail, databases, analytics, publishing, healthcare, advertising, genomics and others where the programmer needs to control concurrency. For example, in the publishing industry, the implementation of applications for sharing the edition of on--line documents inevitably leads to concurrency.

An [open source copy](https://docdrop.org/download_annotation_doc/3386321-trk2f.pdf?ref=felixbarbalet.com "Rich Hickey") of Rich's article is currently available.

## Clojure is open source 
[The web page of clojure](https://clojure.org/about/rationale "Clojure") provides a detailed discussion of the language and latest updates. 
 

## Deployment of clojure
The [Install clojure](https://clojure.org/guides/install_clojure "Install Clojure") web page provides the guidanc e to install clojure and it supportive tool for Windows, Linux and MacOS platforms.

In this section I present a summary of the steps that I have followed to install clojure on a **MacBook Pro running Sequoia 15.7.3** and Homebrew 5.1.10 installed. 


1. I installed a java SDK: I used tumurin which is a well known open source

    carlos@~% brew install --cask temurin
	
	...
	
	temurin was successfully installed!
	
	carlos@~% java --version
	
	openjdk 26.0.1 2026-04-21
	

1.  I installed the clojure tools

    carlos@~% brew install clojure/tools/clojure
	
	carlos@~% clojure --version
	
	Clojure CLI version 1.12.4.1618


1. I installed leiningen 

   carlos@~% brew install leiningen
   <br/><br/> 
   carlos@ClojureFun% lein --version
   
   Leiningen 2.12.0 on Java 25.0.2 OpenJDK 64-Bit Server VM
   
 

1. I created the .lein file

    carlos@~% pwd
	
	/Users/carlosmolina
	
	carlos@~% mkdir .lein

1. I run REPL
 
   carlos@clojure% lein repl
      
   Retrieving nrepl/nrepl/1.0.0/nrepl-1.0.0.pom from clojars
   
   ...
   
   nREPL server started on port 49643 on host 127.0.0.1 - nrepl://127.0.0.1:49643
   
   REPL-y 0.5.1, nREPL 1.3.0
   
   Clojure 1.12.2
   
   OpenJDK 64-Bit Server VM 25.0.2
  
   ...
  
   user=>
   

1. I tested the installation with a hello-world program

   user=> (prn "Hello clojure!")
   
   "Hello clojure!"

   nil

   user=>



## Examples of clojure projects
Some projects of different levels of complexity to examine clojure features. I start with the hello-world program.

### Hello world project
This project shows the implementation of the hello-world programm in clojure. 

More importantly, it shows how to build a project in clojure and execute it. 


### Factorial project
This projects shows the implementation of the factorial function in clojure.
I assume that clojure and its tools are installed. I use vim to edit the files. I deliberately avoided more sophisticated editor like VS code to keep the explanation simple and focus on clojure, rather than on the editor. For example, in this exercise I wanted to see the simplicity of clojure in the implementation of a recursive function.  


## Corresponding author  
carlos.molina@cl.cam.ac.uk   
Department of Computer Science and Technology    
(The Computer Lab),    
University of Cambridge.

 
