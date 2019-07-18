# Overview

This directory contains the Dockerfile to build the application's Docker image for a arm 32 bit cpu.

# Kubernetes manifests

There are two k8s manifests in this directory.

| Filename                                    | Purpose                                                                |
| --------------------------------------------| -----------------------------------------------------------------------|
| 01_k8s-demo-app-kubernetes_pod-service.yaml | Deploys one pod and its corresponding service*                         |
| 02_k8s-demo-app-kubernetes_deployment.yaml  | Creates a deployment (with replicatesets) for 3 pods and its service*. |

\* The service contains an external ip address of 192.168.2.10 by default.  If your master node runs on a different ip address, change the corresponding file (01_* or 02_*).

