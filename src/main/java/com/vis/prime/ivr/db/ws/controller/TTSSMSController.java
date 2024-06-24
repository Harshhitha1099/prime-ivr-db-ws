package com.vis.prime.ivr.db.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vis.prime.ivr.db.ws.entity.TTSSMS;
import com.vis.prime.ivr.db.ws.service.TTSSMSService;

@RestController
@RequestMapping("api")
public class TTSSMSController {

	@Autowired
	private TTSSMSService service;
	
	@GetMapping("/get-all-ttssms")
	public ResponseEntity<List<TTSSMS>> getAllTTSSMS(){
		List<TTSSMS> ttssmsList = this.service.getAllTTSSMS();
		return ttssmsList.isEmpty() ? ResponseEntity.status(HttpStatus.NOT_FOUND).body(null) : ResponseEntity.status(HttpStatus.OK).body(this.service.getAllTTSSMS());
	}
	
}
