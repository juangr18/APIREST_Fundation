FROM mysql:latest
COPY "./target/app.jar" "app.jar"
EXPOSE 3306
ENTRYPOINT ["java","-jar","app.jar"]