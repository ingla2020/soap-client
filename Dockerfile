FROM openjdk:11
COPY target/app.war app.war
ENTRYPOINT ["java", "-jar", "/app.war"]