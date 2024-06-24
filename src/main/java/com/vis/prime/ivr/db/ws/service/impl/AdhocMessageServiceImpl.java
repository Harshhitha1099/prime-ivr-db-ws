package com.vis.prime.ivr.db.ws.service.impl;

import com.vis.prime.ivr.db.ws.entity.AdhocMessage;
import com.vis.prime.ivr.db.ws.entity.AdhocMessageId;
import com.vis.prime.ivr.db.ws.repository.AdhocMessageRepository;
import com.vis.prime.ivr.db.ws.service.AdhocMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdhocMessageServiceImpl implements AdhocMessageService {

    Logger logger = LoggerFactory.getLogger(AdhocMessageServiceImpl.class);

    @Autowired
    public AdhocMessageRepository adhocMessageRepository;
    public Optional<AdhocMessage> findAdhocMessagesByFunctionalityAndStatus(String functionality,String status) {
        this.logger.debug("AdhocMessageServiceImpl  |  findAdhocMessagesByFunctionalityAndStatus  | Functionality : " + functionality + " | Status : "+status);
        Optional<AdhocMessage> optionalAdhocMessage = Optional.ofNullable(adhocMessageRepository.findAdhocMessagesByIdFunctionalityAndStatus(functionality, status));
        if (optionalAdhocMessage.isPresent()) {
            this.logger.debug("AdhocMessageServiceImpl  | result from  findAdhocMessagesByFunctionalityAndStatus  | AdhocMessage : " + optionalAdhocMessage.get());
        } else {
            this.logger.debug("AdhocMessageServiceImpl  | result not found from  findAdhocMessagesByFunctionalityAndStatus ");
        }
        return optionalAdhocMessage;

    }

}
