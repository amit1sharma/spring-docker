This is a sample basic project which demonstrate how to make your application dockerised.

Dockerfile is the main configuration file for docker so that it can perform actions mentioned in Dockerfile.

This application can be sun through Main class SpringDockerApplication.java as well as from docker image

Steps to configure docker on linux

Install docker from repository

If docker demon is not running execute this command
<b>systemctl start docker</b>



* To make docker image go the root location of project(location of Dockerfile file) and execute command

<b>docker build -t springdockerimg.jar .</b>

-t : target <br>
springdockerimg.jar : docker image name to be created<br>
. : current location<br>

* Above mentioned command will download all the dependencies mentioned in Dockerfile and create an image.

after that try following command to check all the images present with docker

<b>docker image ls</b> 

* to run docker image run following command


<b>docker run -p 9090:8080 springdockerimg.jar</b>

9090 : container port<br>
8080 : tomcat port running inside container

application can accessed from both the ports

http://localhost:9090/persons <br>
http://localhost:8080/persons
