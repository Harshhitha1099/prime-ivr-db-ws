package com.vis.prime.ivr.db.ws.service.impl;

import com.vis.prime.ivr.db.ws.entity.CallOutRequest;
import com.vis.prime.ivr.db.ws.repository.CallOutRequestRepository;
import com.vis.prime.ivr.db.ws.service.CallOutRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallOutRequestServiceImpl  implements  CallOutRequestService {


    @Autowired
    public CallOutRequestRepository callOutRequestRepository;

    public boolean saveCallOutRequest(CallOutRequest callOutRequest) {
        try {
            callOutRequestRepository.save(callOutRequest);
            return true; // Return true if the save operation was successful
        } catch (Exception e) {
            e.printStackTrace(); // Log any exceptions
            return false; // Return false if the save operation failed
        }
    }
}
