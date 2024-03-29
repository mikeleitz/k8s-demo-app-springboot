package com.mikeleitz.blog.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.mikeleitz.blog.k8s")
public class K8sHostnameApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sHostnameApplication.class, args);
    }

}
