package com.andrewxyz.soap.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.andrewxyz.ws.authdirect.AuthRequest;
import com.andrewxyz.ws.authdirect.AuthResponse;
import com.andrewxyz.ws.authdirect.ClientAuthRequest;
import com.andrewxyz.ws.authdirect.ClientAuthResponse;
import com.andrewxyz.ws.authdirect.OtpRequest;
import com.andrewxyz.ws.authdirect.OtpResponse;

/**
 * @author Andri Mardiana
 * @since  2 Jun 2016
 */

@Endpoint
public class AuthServiceEndpoint {
	private static final Logger logger = LoggerFactory.getLogger(AuthServiceEndpoint.class);
	private static final String NAMESPACE_URI = "http://ws.andrewxyz.com/authDirect";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "authRequest")
	@ResponsePayload
	public AuthResponse auth(@RequestPayload AuthRequest request) {
		logger.info("Incoming request for Auth");
		logger.info(request.toString());
		
		AuthResponse response = new AuthResponse();
		response.setAuthAttemptLeft(null);
		response.setAuthSessionId("b7da31ff-053e-49fd-a3d7-64bfbf714ec8");
		response.setRefId("2FA0226b20bf4c3874bd28f25ceb42136b0fe");
		response.setResponseCode("1000");
		response.setResponseMsg("Authentication success");
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "clientAuthRequest")
	@ResponsePayload
	public ClientAuthResponse clientAuth(@RequestPayload ClientAuthRequest request) {
		logger.info("Incoming request for clientAuth");
		logger.info(request.toString());
		
		ClientAuthResponse response = new ClientAuthResponse();
		response.setAuthSessionId("sessionid");
		response.setResponseCode("99");
		response.setResponseMsg("res message dodol");
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "otpRequest")
	@ResponsePayload
	public OtpResponse otp(@RequestPayload OtpRequest request) {
		logger.info("Incoming request for otp");
		logger.info(request.toString());
		
		OtpResponse response = new OtpResponse();
		response.setAuthSessionId("b7da31ff-053e-49fd-a3d7-64bfbf714ec8");
		response.setRefId("2FA01d1c57ad96216478ab7e5685307ff3b4a");
		response.setResendOtpLeft(3);
		response.setResponseCode("2000");
		response.setResponseMsg("Authentication message is sent");
		
		return response;
	}
}
