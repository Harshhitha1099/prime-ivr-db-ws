package com.vis.prime.ivr.db.ws.repository;

import com.vis.prime.ivr.db.ws.entity.AdhocMessage;
import com.vis.prime.ivr.db.ws.entity.AdhocMessageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdhocMessageRepository extends JpaRepository<AdhocMessage, AdhocMessageId> {

    AdhocMessage findAdhocMessagesByIdFunctionalityAndStatus(String functionality,String status);
}
