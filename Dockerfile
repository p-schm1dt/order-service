FROM openjdk:17
EXPOSE 8082
ADD target/order-service.jar order-service.jar
ENTRYPOINT ["java","-jar","/order-service.jar"]