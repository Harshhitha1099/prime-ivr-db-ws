package com.vis.prime.ivr.db.ws.controller;

import com.vis.prime.ivr.db.ws.entity.AdhocMessage;
import com.vis.prime.ivr.db.ws.service.AdhocMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AdhocMessageController {

    @Autowired
    public AdhocMessageService adhocMessageService;

    @GetMapping("/get-adhocmessage-by-functionality-and-status/{functionality}/{status}")
    public ResponseEntity<AdhocMessage> getAdhocMessageByFunctionalityAndStatus(@PathVariable String functionality,
                                                                                @PathVariable String status) {
        Optional<AdhocMessage> optionalAdhocMessage = this.adhocMessageService.findAdhocMessagesByFunctionalityAndStatus(functionality, status);
        return optionalAdhocMessage.isPresent() ? ResponseEntity.status(HttpStatus.OK).body(optionalAdhocMessage.get()) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

    }


}
