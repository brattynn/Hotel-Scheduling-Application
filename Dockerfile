FROM openjdk:latest
WORKDIR /app
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar
ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]