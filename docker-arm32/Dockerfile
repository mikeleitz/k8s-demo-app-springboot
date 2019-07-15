FROM  arm32v7/openjdk:11.0.3-jre-slim-stretch

COPY "k8s-demo-app-0.0.1-SNAPSHOT.jar" "/k8s-demo-app.jar"

EXPOSE 8080

CMD [ "-jar", "/k8s-demo-app.jar" ]
ENTRYPOINT [ "java" ]
