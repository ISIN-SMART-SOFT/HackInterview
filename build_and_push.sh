./gradlew clean build
docker build interview-app/ -t ksergey1999/hack-interview:1.0.0
docker push ksergey1999/hack-interview:1.0.0