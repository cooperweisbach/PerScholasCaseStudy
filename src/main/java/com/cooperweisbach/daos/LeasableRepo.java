package com.cooperweisbach.daos;

import com.cooperweisbach.models.Leasable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeasableRepo extends JpaRepository<Leasable, Integer> {
}
