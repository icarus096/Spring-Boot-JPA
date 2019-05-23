FROM java:8
MAINTAINER JaeDoAum <icarus096@gmail.com>

ARG JAR_NAME=spring-boot-jpa.jar
ADD ./target/spring-boot-jpa-0.0.1-SNAPSHOT.jar spring-boot-jpa.jar
EXPOSE 8080

# https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-jpa.jar"]
CMD ["--spring.profiles.active=dev"]
#CMD ["java","-jar","-Dspring.profiles.active=dev","slack-api.jar"]
#CMD ["java","-jar","slack-api.jar"]
