package com.vis.prime.ivr.db.ws.controller;

import com.vis.prime.ivr.db.ws.entity.HostMapping;
import com.vis.prime.ivr.db.ws.service.HostMappingService;
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
public class HostMappingController {

    @Autowired
    public HostMappingService hostMappingService;

    @GetMapping("/get-hostmapping-by-vehicleType-and-status/{vehicleType}/{status}")
    public ResponseEntity<HostMapping> getHostMappingByVehicleType(@PathVariable String vehicleType, @PathVariable String status)
    {
        Optional<HostMapping> optionalHostMapping = this.hostMappingService.getHostMappingByVehicleTypeAndStatus(vehicleType, status);
        return optionalHostMapping.isPresent() ? ResponseEntity.status(HttpStatus.OK).body(optionalHostMapping.get()) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

}
