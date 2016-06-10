package com.andrewxyz.rest;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andri Mardiana
 * @since  2 Jun 2016
 */

@RestController
public class SampleRestController {
	private static final Logger logger = LoggerFactory.getLogger(SampleRestController.class);
	
    @RequestMapping(value = "andrewxyz/clients/{vClientID}/devices/{clientDeviceID}", method = RequestMethod.PUT) 
    public String enrollDevice(@PathVariable String vClientID, @PathVariable String clientDeviceID, 
        @RequestParam("apiKey") String apiKey, @RequestBody String body){ 
    	
    	try {
        	logger.info("Incoming request for Enroll device ");
        	logger.info("vClientId:" + vClientID + " - clientDeviceId:" + clientDeviceID + " - apiKey:" + apiKey);
        	logger.debug("body:" + body);
        	
        	return "{\"requestID\":\"VS2177589ee56c724a7f971994378b190b60\",\"clientDeviceID\":\"069bc278d375d3d66826bc08\",\"deviceID\":\"9441167226514bc4a1ed100c7278beb487923626e31c45ea\",\"vClientID\":\"324faf8e-7ed7-1756-425b-1029ab47b401\",\"vServerNonce\":\"f6d7cf3a94e7402a9d503d8687860d0ec53c\"}";
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
    	return "";
    }
}