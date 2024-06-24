package com.vis.prime.ivr.db.ws.service.impl;

import com.vis.prime.ivr.db.ws.entity.Usage;
import com.vis.prime.ivr.db.ws.repository.UsageRepository;
import com.vis.prime.ivr.db.ws.service.UsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Autowired
    public UsageRepository usageRepository;

    public boolean saveUsage(Usage usage) {
        try {
            usageRepository.save(usage);
            return true; // Return true if the save operation was successful
        } catch (Exception e) {
            e.printStackTrace(); // Log any exceptions
            return false; // Return false if the save operation failed
        }
    }

}
