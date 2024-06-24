package com.vis.prime.ivr.db.ws.service;

import com.vis.prime.ivr.db.ws.entity.IvrDnisMapping;


import java.util.Optional;

public interface IvrDnisMappingService {

    Optional<IvrDnisMapping> findIvrDnisMappingForVdn(String vdn);;
}
