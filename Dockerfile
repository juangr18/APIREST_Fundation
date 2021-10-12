FROM ubuntu:latest
WORKDIR /
COPY "./target/app.jar" "app.jar"
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]