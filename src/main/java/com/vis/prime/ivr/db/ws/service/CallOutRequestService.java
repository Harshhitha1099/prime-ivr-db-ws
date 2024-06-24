package com.vis.prime.ivr.db.ws.service;

import com.vis.prime.ivr.db.ws.entity.CallOutRequest;
import com.vis.prime.ivr.db.ws.service.impl.CallOutRequestServiceImpl;

public interface CallOutRequestService{

     public boolean saveCallOutRequest(CallOutRequest callOutRequest);

}
