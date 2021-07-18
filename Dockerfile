FROM adoptopenjdk/openjdk11:latest
ADD build/libs/product-app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
