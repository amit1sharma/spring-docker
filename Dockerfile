FROM openjdk:8
EXPOSE 8080
ADD build/libs/spring-docker.jar spring-docker.jar
ENTRYPOINT ["java","-jar", "/spring-docker.jar"]