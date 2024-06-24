package com.vis.prime.ivr.db.ws.controller;

import com.vis.prime.ivr.db.ws.entity.AutoparkFailover;
import com.vis.prime.ivr.db.ws.service.AutoparkFailoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AutoparkFailoverController {

    @Autowired
    public AutoparkFailoverService autoparkFailoverService;

    @GetMapping("/get-autopark-failover-by-ucid/{ucid}")
    public ResponseEntity<AutoparkFailover> getAutoparkFailover(@PathVariable String ucid) {
        Optional<AutoparkFailover> optionalAutoparkFailover = this.autoparkFailoverService.findAutoparkFailover(ucid);
        return optionalAutoparkFailover.isPresent() ? ResponseEntity.status(HttpStatus.OK).body(optionalAutoparkFailover.get()) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }


}
