package com.cooperweisbach.daos;

import com.cooperweisbach.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepo extends JpaRepository<Member, Integer> {
    List<Member> findAll();
    List<Member> findByEmail(String email);
    List<Member> findByFirstName(String firstName);
    List<Member> findByMemberLevel(String memberLevel);
}
