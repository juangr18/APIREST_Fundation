FROM openjdk:latest
COPY "./target/app.jar" "app.jar"
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]