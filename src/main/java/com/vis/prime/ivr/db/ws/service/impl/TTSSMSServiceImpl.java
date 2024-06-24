package com.vis.prime.ivr.db.ws.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vis.prime.ivr.db.ws.entity.TTSSMS;
import com.vis.prime.ivr.db.ws.repository.TTSSMSRepository;
import com.vis.prime.ivr.db.ws.service.TTSSMSService;

@Service
public class TTSSMSServiceImpl implements TTSSMSService {

	Logger logger = LoggerFactory.getLogger(TTSSMSServiceImpl.class);
	@Autowired
	private TTSSMSRepository repo;
	
	@Override
	public List<TTSSMS> getAllTTSSMS() {
		List<TTSSMS> ttssmsList = repo.findAll();
		if (!ttssmsList.isEmpty()) {
			this.logger.debug("TTSSMSServiceImpl  | result | List : " + ttssmsList);
		} else {
			this.logger.debug("TTSSMSServiceImpl  | result | List not found " );
		}
		return ttssmsList;
	}

}
