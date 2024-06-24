package com.vis.prime.ivr.db.ws.service.impl;

import com.vis.prime.ivr.db.ws.entity.AutoparkFailover;
import com.vis.prime.ivr.db.ws.repository.AutoparkFailoverRepository;
import com.vis.prime.ivr.db.ws.service.AutoparkFailoverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AutoparkFailoverServiceImpl implements AutoparkFailoverService {

    Logger logger = LoggerFactory.getLogger(AutoparkFailoverServiceImpl.class);
    @Autowired
    public AutoparkFailoverRepository autoparkFailoverRepository;


    public Optional<AutoparkFailover> findAutoparkFailover(String ucid) {
        this.logger.debug("AutoparkFailoverServiceImpl| ucid | autopark Failover by ucid2 : " + ucid);
        Optional<AutoparkFailover> autoparkFailoverOptional = autoparkFailoverRepository.findById(ucid);
        if (autoparkFailoverOptional.isPresent()) {
            AutoparkFailover autoparkFailover = autoparkFailoverOptional.get();
            this.logger.debug("AutoparkFailoverServiceImpl| result | autopark Failover by ucid2 : " + autoparkFailover);
        } else {
            this.logger.debug("AutoparkFailoverServiceImpl| result | autopark Failover not found by ucid2  " );
        }
      return autoparkFailoverOptional;
    }

}


