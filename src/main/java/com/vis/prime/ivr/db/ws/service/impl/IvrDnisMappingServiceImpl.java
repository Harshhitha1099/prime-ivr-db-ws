package com.vis.prime.ivr.db.ws.service.impl;

import com.vis.prime.ivr.db.ws.entity.IvrDnisMapping;
import com.vis.prime.ivr.db.ws.repository.IvrDnisMappingRepository;
import com.vis.prime.ivr.db.ws.service.IvrDnisMappingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class IvrDnisMappingServiceImpl implements IvrDnisMappingService {

    Logger logger = LoggerFactory.getLogger(IvrDnisMappingServiceImpl.class);
    @Autowired
    public IvrDnisMappingRepository ivrDnisMappingRepository;

    @Override
    public Optional<IvrDnisMapping> findIvrDnisMappingForVdn(String vdn) {
        this.logger.debug("IvrDnisMappingServiceImpl | rrequest | IVR DNIS Mapping Details by VDN : " + vdn);
        Optional<IvrDnisMapping> ivrDnisMappingOptional = ivrDnisMappingRepository.findById(vdn);
        if (ivrDnisMappingOptional.isPresent()) {
            IvrDnisMapping ivrDnisMapping = ivrDnisMappingOptional.get();
            this.logger.debug("IvrDnisMappingServiceImpl| result | IVR DNIS Mapping Details by VDN : " + ivrDnisMapping);
        } else {
            this.logger.debug("IvrDnisMappingServiceImpl | result | IVR DNIS Mapping Details by VDN not found ");
        }
       return ivrDnisMappingOptional;
    }

}
