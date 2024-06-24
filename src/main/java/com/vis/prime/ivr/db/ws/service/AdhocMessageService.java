package com.vis.prime.ivr.db.ws.service;

import com.vis.prime.ivr.db.ws.entity.AdhocMessage;
import com.vis.prime.ivr.db.ws.entity.AdhocMessageId;

import java.util.Optional;

public interface AdhocMessageService {

    Optional<AdhocMessage> findAdhocMessagesByFunctionalityAndStatus(String functionality, String status);


}
