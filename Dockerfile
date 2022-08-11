FROM openjdk:18
COPY out/artifacts/jenkinspipeline_jar/jenkinspipieline.jar jenkinspipieline.jar
ENTRYPOINT["java" , "-jar" , "/jenkinspipeline.jar"]