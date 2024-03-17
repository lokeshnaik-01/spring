# REST Controller
  - @RestController can be used to create controller
  - we can use GetMapping or PostMapping to handle http requests

# Maven
  - Maven is a project management tool
  - most popular use of maven is for build management and dependecies

## problems solved by Maven
  - when building java project we may need additional JAR files like Spring, Hibernate, JSON etc.
  - one approach is to downoad JAR files from each project web site
  - manualy add JAR files to our build path/classpath
  - We tell maven the dependencies we are working on.
  - maven will go and download the JAR files of these project and will make those available during compile/run

## How maven works
  - we have config file in the project which maven reads
  - check maven local repo if the dependencies are present if not there will pull it from mavem central repo (remote)
  - maven will also download supporting dependicies

# pom.xl
  - Project Object Model file(pom file)
  - configuration file of project
  - maven uses this to get the dependicies in project
  - located in root

## POM file structure
  1. Project Meta Date --> project name, version etc. Output File type: JAR, WAR
  2. Dependicies --> list of dependicies
  3. Plug ins --> Additional custom tasks to run: generate JUnit test reports etc

# Spring Boot
  - provides makes it easier to get started with spring dev
  - minimize amount of manual config
  - help to resolve dependency conflicts
  - provide an embedded http server
  - spring boot apps can run stand alone 

## Create a spring project
  - spring initializer can be used to create a spring project
  - [https://start.spring.io/](https://start.spring.io/) we can select the spring version, language, language and dependencies
  - `Artifact` in metadata is the name of the project 
  - in dependencies, you can add all the dependencies required

# Adding Rest Controller
  - We added a new package rest and in that we are writing the controller
  - `@RestController` will define the rest controller
  - `@GetMapping` will listen to the get request and call the function below