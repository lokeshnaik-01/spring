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
