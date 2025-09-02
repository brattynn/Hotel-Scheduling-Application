FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["Java", "-jar", "/app.jar"]