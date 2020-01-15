/**
 * 
 */
package com.webinterface.service.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webinterface.service.domain.SaveOrderRequest;
import com.webinterface.service.domain.SaveOrderResponse;
import com.webinterface.service.proxies.SaveProxy;


@Component
public class SaveServiceImpl {
	@Autowired
	private SaveProxy saveProxy;
	

	/**
	 * @param subscriptionIdentifier
	 * @param tenentId
	 * @param serviceType
	 * @return
	 */
	public SaveOrderResponse saveOrder(SaveOrderRequest saveOrderRequest,
			String authorizationCode) {

		return saveProxy.saveOrder(saveOrderRequest, authorizationCode);
	}
	
	
}
