package com.vis.prime.ivr.db.ws.service.impl;

import com.vis.prime.ivr.db.ws.entity.HostMapping;
import com.vis.prime.ivr.db.ws.repository.HostMappingRepository;
import com.vis.prime.ivr.db.ws.service.HostMappingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HostMappingServiceImpl implements HostMappingService {

    Logger logger = LoggerFactory.getLogger(HostMappingServiceImpl.class);

    @Autowired
    public HostMappingRepository hostMappingRepository;

    public Optional<HostMapping> getHostMappingByVehicleTypeAndStatus(String vehicleType,String status) {
        this.logger.debug("HostMappingServiceImpl | request | host Mapping Details | host value(Vehicle Type) "+vehicleType +" | status :"+status);
        Optional<HostMapping> hostMappingOptional= Optional.ofNullable(hostMappingRepository.findByIdHostValueAndStatus(vehicleType,status));
        if (hostMappingOptional.isPresent()) {
            HostMapping hostMapping = hostMappingOptional.get();
            this.logger.debug("HostMappingServiceImpl | result | host Mapping Details by host value and status : " + hostMapping);
        } else {
            this.logger.debug("HostMappingServiceImpl | result | host Mapping Details by host value and status not found");
        }
      return hostMappingOptional;
    }
}
