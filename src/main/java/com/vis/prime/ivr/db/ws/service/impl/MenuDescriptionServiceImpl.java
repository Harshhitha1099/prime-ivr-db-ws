package com.vis.prime.ivr.db.ws.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vis.prime.ivr.db.ws.entity.MenuDescription;
import com.vis.prime.ivr.db.ws.repository.MenuDescriptionReposritory;
import com.vis.prime.ivr.db.ws.service.MenuDescriptionService;

@Service
public class MenuDescriptionServiceImpl implements MenuDescriptionService {

	Logger logger = LoggerFactory.getLogger(MenuDescriptionServiceImpl.class);
	@Autowired
	private MenuDescriptionReposritory repo;
	
	@Override
	public Optional<MenuDescription> getMenuDescriptionById(String imdMenuId) {
		this.logger.debug("MenuDescriptionServiceImpl | request | Menu Description |IMDMENUID : " +  imdMenuId);
		Optional<MenuDescription> menuDescriptionOptional = repo.findById(imdMenuId);
		if (menuDescriptionOptional.isPresent()) {
			MenuDescription menuDescription = menuDescriptionOptional.get();
			this.logger.debug("MenuDescriptionServiceImpl | result | Menu Description from DB By Id : " + menuDescription);
		} else {
			this.logger.debug("MenuDescriptionServiceImpl | result | Menu Description from DB By Id not found ");
		}
		return menuDescriptionOptional;
	}

}
