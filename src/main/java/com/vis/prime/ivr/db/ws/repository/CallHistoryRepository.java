package com.vis.prime.ivr.db.ws.repository;

import com.vis.prime.ivr.db.ws.entity.AutoparkFailover;
import com.vis.prime.ivr.db.ws.entity.CallHistory;
import com.vis.prime.ivr.db.ws.entity.CallHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallHistoryRepository extends JpaRepository<CallHistoryEntity, String> {


}

