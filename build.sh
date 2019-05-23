#!/bin/bash

read -p "Start build? (y/n)?" choice
case "$choice" in 
  #y|Y ) mvn clean -Dspring.profiles.active=dev install;;
  y|Y ) mvn clean -Dmaven.test.skip=true install;;
  n|N ) echo "no";;
  * ) echo "invalid";;
esac
echo "jar tvf 명령어로 jar내부를 볼 수 있다. "


echo "backup previous version->build new version->push new version"
read -p "Start Dockerize SpringBoot? (y/n)?" choice
case "$choice" in 
  y|Y )     
    docker tag icarus096/spring-boot-jpa:latest icarus096/spring-boot-jpa:$(date +%Y%m%d%H%M)
    docker build -t icarus096/spring-boot-jpa:latest .
    docker push icarus096/spring-boot-jpa:latest;;
  n|N ) echo "no";;
  * ) echo "invalid";;
esac

read -p "Start Run Dockerized Image? (y/n)?" choice
case "$choice" in 
  y|Y ) docker run -it -p 8080:8080 --rm --name spring-boot-jpa icarus096/spring-boot-jpa:latest --spring.profiles.active=dev;;
  n|N ) echo "no";;
  * ) echo "invalid";;
esac


