package com.cooperweisbach.daos;


import com.cooperweisbach.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findAll();
    List<Post> findAllByMemberId(Integer memberId);

}
