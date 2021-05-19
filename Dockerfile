FROM adoptopenjdk/openjdk11:alpine

EXPOSE 8080

WORKDIR /javafolder

COPY target/*.jar  app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]