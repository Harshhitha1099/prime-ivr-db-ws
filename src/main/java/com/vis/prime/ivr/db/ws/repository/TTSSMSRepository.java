package com.vis.prime.ivr.db.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vis.prime.ivr.db.ws.entity.TTSSMS;

@Repository
public interface TTSSMSRepository extends JpaRepository<TTSSMS, String> {

}
