package com.vis.prime.ivr.db.ws.controller;

import com.vis.prime.ivr.db.ws.entity.CallOutRequest;
import com.vis.prime.ivr.db.ws.service.CallOutRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CallOutRequestController {

    Logger logger = LoggerFactory.getLogger(CallOutRequestController.class);

    @Autowired
    public CallOutRequestService callOutRequestService;

    @PostMapping(value = {"insert-call-out-request"}, produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<String> insertCallOutRequest(@RequestBody CallOutRequest callOutRequest) {
        this.logger.info("CallOutRequestController  | Insert Call Out Request | CalloutRequest "+callOutRequest);
        boolean isSuccess = this.callOutRequestService.saveCallOutRequest(callOutRequest);
        if (isSuccess) {
            this.logger.info("CallOutRequestController  | Insert Call Out Request | Successfully inserted ");
            return ResponseEntity.status(HttpStatus.OK).body("CallOutRequest saved successfully");
        } else {
            this.logger.info("CallOutRequestController  | Insert Call Out Request| Failed to save CallOutRequest");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save CallOutRequest");
        }
    }
}
