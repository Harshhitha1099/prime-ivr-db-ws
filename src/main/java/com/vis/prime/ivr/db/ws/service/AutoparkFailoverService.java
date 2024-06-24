package com.vis.prime.ivr.db.ws.service;

import com.vis.prime.ivr.db.ws.entity.AutoparkFailover;

import java.util.Optional;

public interface AutoparkFailoverService {

    Optional<AutoparkFailover> findAutoparkFailover(String ucid);

}
