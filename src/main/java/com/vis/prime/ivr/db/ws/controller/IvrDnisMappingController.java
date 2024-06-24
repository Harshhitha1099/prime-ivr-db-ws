package com.vis.prime.ivr.db.ws.controller;

import com.vis.prime.ivr.db.ws.entity.IvrDnisMapping;
import com.vis.prime.ivr.db.ws.service.IvrDnisMappingService;
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
public class IvrDnisMappingController {
    @Autowired
    private IvrDnisMappingService ivrDnisMappingService;

    @GetMapping("/get-ivr-dnis-by-vdn/{vdn}")
    public ResponseEntity<IvrDnisMapping> getIvrDnisMapping(@PathVariable String vdn) {
        Optional<IvrDnisMapping> oIvrDnis = this.ivrDnisMappingService.findIvrDnisMappingForVdn(vdn);
        return oIvrDnis.isPresent() ? ResponseEntity.status(HttpStatus.OK).body(oIvrDnis.get()) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

}


