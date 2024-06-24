package com.vis.prime.ivr.db.ws.service;

import com.vis.prime.ivr.db.ws.entity.HostMapping;

import java.util.Optional;

public interface HostMappingService {

    Optional<HostMapping> getHostMappingByVehicleTypeAndStatus(String vehicleType, String status);
}
