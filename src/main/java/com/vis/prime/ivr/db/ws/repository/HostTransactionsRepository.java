package com.vis.prime.ivr.db.ws.repository;

import com.vis.prime.ivr.db.ws.entity.HostTranscationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostTransactionsRepository extends JpaRepository<HostTranscationEntity, String> {

}