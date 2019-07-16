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
