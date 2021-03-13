# For Java 8, try this
FROM openjdk:8-jdk-alpine

# Refer to Maven build -> finalName
ARG JAR_FILE=target/football-inquiry-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/football-inquiry-0.0.1-SNAPSHOT.jar /opt/app/football-inquiry-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} football-inquiry-0.0.1-SNAPSHOT.jar
EXPOSE 8081
# java -jar /opt/app/football-inquiry-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","football-inquiry-0.0.1-SNAPSHOT.jar"]
# sudo docker build -t spring-boot:1.0 .
# sudo docker run -d -p 8081:8081 -t spring-boot:1.0
