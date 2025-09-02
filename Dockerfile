FROM openjdk:latest
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar
ENTRYPOINT ["Java", "-jar", "/app.jar"]