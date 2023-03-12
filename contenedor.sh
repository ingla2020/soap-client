#!/bin/sh

mvn clean install package
docker stop myjavaapp
docker rm myjavaapp
docker rmi myapp
docker build -t myapp .
docker run --name myjavaapp -p 8080:8080 myapp
