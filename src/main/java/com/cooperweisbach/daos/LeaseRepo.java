package com.cooperweisbach.daos;

import com.cooperweisbach.models.Lease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepo extends JpaRepository<Lease, Integer> {
}
