package com.webinterface.service.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.webinterface.service.domain.SaveOrderRequest;
import com.webinterface.service.domain.SaveOrderResponse;

@FeignClient(contextId = "ext-saveOrder", name = "extsaveservicerequestapi", url = "http://localhost:8443")
@Component
public interface SaveProxy {
	@PostMapping("/ext-saveOrder/save")
	public SaveOrderResponse saveOrder(@RequestBody SaveOrderRequest saveOrderRequest,
			@RequestHeader("authorizationCode") String authorizationCode);
	
}