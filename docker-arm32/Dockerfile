FROM  arm32v7/openjdk:11.0.3-jre-slim-stretch

# Although this docker file is in docker-amd64/Dockerfile, the docker command is run from target/.  That's why we can use k8s-demo-app-0.0.1-SNAPSHOT.jar without a path.
COPY "k8s-demo-app-0.0.1-SNAPSHOT.jar" "/k8s-demo-app.jar"

EXPOSE 8080

CMD [ "-jar", "/k8s-demo-app.jar" ]
ENTRYPOINT [ "java" ]
