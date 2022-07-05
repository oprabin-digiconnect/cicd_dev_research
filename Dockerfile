FROM adoptopenjdk/openjdk11
EXPOSE 8090
ADD target/cicd-dev-research-1.0.jar cicd-dev-research-1.0.jar
ENTRYPOINT ["java","-jar","/cicd-dev-research-1.0.jar"]