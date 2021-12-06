FROM mysql:latest
RUN apt update && apt upgrade && apt install default-jre
COPY "./target/app.jar" "app.jar"
EXPOSE 3306 80
ENV MYSQL_ROOT_PASSWORD=root MYSQL_DATABASE=fundacion
ENTRYPOINT ["java","-jar","app.jar"]
