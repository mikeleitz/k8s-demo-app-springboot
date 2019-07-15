package com.mikeleitz.blog.k8s.message;


import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;


/**
 *
 * Repository for storing messages.
 *
 * @author leitz
 */
interface MessageRepository<T, ID extends Serializable> extends JpaRepository<Message, Long> {

}
