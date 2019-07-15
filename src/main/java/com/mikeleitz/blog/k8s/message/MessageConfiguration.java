package com.mikeleitz.blog.k8s.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 *
 * @author leitz
 */
@Configuration
@EnableJpaRepositories("com.mikeleitz.blog.k8s")
public class MessageConfiguration {
    private Logger _logger = LoggerFactory.getLogger(MessageConfiguration.class);
}
