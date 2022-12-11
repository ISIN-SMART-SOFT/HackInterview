FROM alpine:3.16.2

RUN apk add openjdk17
COPY build/libs/*.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]