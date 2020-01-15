package com.webinterface.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.webinterface.service.component.SaveServiceImpl;
import com.webinterface.service.domain.SaveOrderRequest;
import com.webinterface.service.domain.SaveOrderResponse;

@RestController
@CrossOrigin
public class SaveController {

	@Autowired
	public SaveServiceImpl saveServiceImpl;

	@PostMapping(value = "/save")
	public ResponseEntity<SaveOrderResponse> save(@RequestBody SaveOrderRequest saveOrderRequest,
			@RequestHeader String authorizationCode) {
		SaveOrderResponse res = saveServiceImpl.saveOrder(saveOrderRequest, authorizationCode);

		return ResponseEntity.ok(res);
	}

}