package com.vis.prime.ivr.db.ws.controller;

import com.vis.prime.ivr.db.ws.entity.Usage;
import com.vis.prime.ivr.db.ws.service.UsageService;
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
@RequestMapping("/api")
public class UsageController {

    @Autowired
    public UsageService usageService;

    Logger logger = LoggerFactory.getLogger(UsageController.class);

    @PostMapping(value = {"/insert-usage"}, produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<String> insertusage(@RequestBody Usage usage) {

        this.logger.info("UsageController  | Insert usage | usage request "+usage);
        boolean isSuccess = this.usageService.saveUsage(usage);

        if (isSuccess) {
            this.logger.info("UsageController  | Insert usage | Successfully inserted ");
            return ResponseEntity.status(HttpStatus.OK).body("Usage saved successfully");
        } else {
            this.logger.info("UsageController  | Insert usage | Failed to save usage ");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save usage");
        }
    }
}
