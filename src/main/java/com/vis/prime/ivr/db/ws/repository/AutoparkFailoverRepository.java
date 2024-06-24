package com.vis.prime.ivr.db.ws.repository;

import com.vis.prime.ivr.db.ws.entity.AutoparkFailover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoparkFailoverRepository extends JpaRepository<AutoparkFailover, String> {
}
