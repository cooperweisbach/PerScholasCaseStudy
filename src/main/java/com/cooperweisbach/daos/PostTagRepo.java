package com.cooperweisbach.daos;

import com.cooperweisbach.models.PostTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostTagRepo extends JpaRepository<PostTag, Integer> {
}
