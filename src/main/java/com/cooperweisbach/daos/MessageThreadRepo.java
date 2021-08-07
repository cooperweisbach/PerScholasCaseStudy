package com.cooperweisbach.daos;

import com.cooperweisbach.models.MessageThread;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageThreadRepo extends JpaRepository<MessageThread, Integer> {
}
