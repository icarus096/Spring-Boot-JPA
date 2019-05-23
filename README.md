# Spring Boot -  sample Project

### Purpose
바로 써먹는 스프링부터 환경을 구성해 보자. 

###Configuration
라이브러리 포함, 설정 부분 등 정리

* Spring Boot 2.x
* JPA
* H2
* MySQL
* MS-SQL
* thymeleaf
* swagger-ui


### Install
Eclipse, IntelliJ IDEA 등의 IDE로 소스를 받은 후, Maven Configuration 추가


> * local profile로 구동하면, h2 db에 jpa 테이블객체가 생성된다.
> * spring boot application 이므로 바로 실행하면 된다. 
> * build.sh 스크립트를 통해 build 해도 된다. (mvn clean package -> dockerize -> docker push -> docker run)
> * mysql 등의 추가 DB 구성 테스트는 docker로 돌리자. () 

### Test URL 
* http://localhost:8080/h2-console h2-console 
* http://localhost:8080/swagger-ui.html swagger-ui
* http://localhost:8080/journal journal-rest json
* http://localhost:8080/ journal html page
...

 
