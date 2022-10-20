FROM openjdk:12
VOLUME /tmp
EXPOSE 8079
ADD ./target/office-service-0.0.1-SNAPSHOT.jar office-service.jar
ENTRYPOINT ["java","-jar","/office-service.jar"]
