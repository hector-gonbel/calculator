# calculator
Calculator project for a technical test of Sanitas
## Requirements
Tracer-1.0.0.jar

It's neccesary to install the jar dependency locally in the .m2 folder using:

mvn install:install-file -Dfile=tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer
-Dversion=1.0.0 -Dpackaging=jar -DgeneratePom=true
## Execute app
Go to root directory and execute:
mvn spring-boot:run

### Note: 
use main branch, develop branch has the last changes but It's not working
