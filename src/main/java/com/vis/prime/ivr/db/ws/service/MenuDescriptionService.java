package com.vis.prime.ivr.db.ws.service;

import java.util.Optional;

import com.vis.prime.ivr.db.ws.entity.MenuDescription;

public interface MenuDescriptionService {
	
	Optional<MenuDescription> getMenuDescriptionById(String imdMenuId);

}
