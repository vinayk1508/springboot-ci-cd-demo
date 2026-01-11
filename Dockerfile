# Use lightweight Java image
FROM eclipse-temurin:21-jre
WORKDIR /project
COPY target/*.jar springboot-ci-cd-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot-ci-cd-demo.jar"]
