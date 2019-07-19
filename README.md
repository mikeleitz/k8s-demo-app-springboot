# k8s-demo-app-springboot
This is a Spring boot application that exposes a couple of REST endpoints.  The Maven build creates a Docker container that can be deployed to Kubernetes.

# Docker

```bash
docker push mleitz1/k8s-demo-app:0.0.1-SNAPSHOT_arm32
docker push mleitz1/k8s-demo-app:0.0.1-SNAPSHOT_amd64
```

# Kubernetes

## Deploy

```bash
kubectl apply -f  https://raw.githubusercontent.com/mikeleitz/k8s-demo-app-springboot/master/docker-arm32/k8s-demo-app-kubernetes.yaml

```

# Running

There are three endpoints you can use: hostname, guid, and message.

## hostname

Gets the hostname the application is running on.

```bash
$ http GET 192.168.2.10/hostname
HTTP/1.1 200
Content-Length: 16
Content-Type: text/plain;charset=UTF-8
Date: Fri, 19 Jul 2019 14:35:28 GMT

k8s-demo-app-pod 
```
## guid

Gets a global id.

```bash
$ http GET 192.168.2.10/guid
HTTP/1.1 200
Content-Length: 36
Content-Type: text/plain;charset=UTF-8
Date: Fri, 19 Jul 2019 14:35:31 GMT

9deacba5-1212-4456-a1ba-4d7da4c4cc4f
```

## Save a message

This application has an in memory database that saves messages.  If the application restarts or moves to a different pod/node, then the data is lost.


### Create message

```bash
$ http  POST 192.168.2.10/message message="my message"
HTTP/1.1 200
Content-Length: 0
Date: Fri, 19 Jul 2019 14:36:53 GMT
```

### Get message

```bash
$ http GET 192.168.2.10/message
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Date: Fri, 19 Jul 2019 14:39:40 GMT
Transfer-Encoding: chunked

[
    {
        "id": 1,
        "message": "my message"
    },
    {
        "id": 2,
        "message": "my message"
    },
    {
        "id": 3,
        "message": "my message"
    }
]
```

