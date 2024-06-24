package com.vis.prime.ivr.db.ws.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vis.prime.ivr.db.ws.entity.MenuDescription;
import com.vis.prime.ivr.db.ws.service.MenuDescriptionService;

@RestController
@RequestMapping("api")
public class MenuDescriptionController {
	
	@Autowired
	private MenuDescriptionService service;
	
	@GetMapping("/get-menu-description-by-id/{imdMenuId}")
	public ResponseEntity<MenuDescription> getMenuDescriptionById(@PathVariable String imdMenuId) {
		Optional<MenuDescription> oMenuDesc = this.service.getMenuDescriptionById(imdMenuId);
		return oMenuDesc.isPresent() ? ResponseEntity.status(HttpStatus.OK).body(oMenuDesc.get()) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

}
