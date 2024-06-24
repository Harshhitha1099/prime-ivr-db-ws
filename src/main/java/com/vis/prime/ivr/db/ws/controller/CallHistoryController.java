package com.vis.prime.ivr.db.ws.controller;

import com.vis.prime.ivr.db.ws.entity.CallHistory;
import com.vis.prime.ivr.db.ws.service.CallHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CallHistoryController {

    Logger logger = LoggerFactory.getLogger(CallHistoryController.class);

    @Autowired
    public CallHistoryService callHistoryService;

    @PostMapping(value = {"/insert-callhistory"}, produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<String> insertCallHistory(@RequestBody CallHistory callHistory) {
        this.logger.info("CallHistoryController  | Insert Call History | CallHistory Request "+ callHistory);
        boolean isSuccess = this.callHistoryService.saveCallHistory(callHistory);

        if (isSuccess) {
            this.logger.info("CallHistoryController  | Insert Call History | Successfully inserted ");
            return ResponseEntity.status(HttpStatus.OK).body(" CallHistory Successfully inserted.");
        } else {
            this.logger.info("CallHistoryController  | Insert Call History | Exception while inserted ");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save callhistory");

        }
    }
}



