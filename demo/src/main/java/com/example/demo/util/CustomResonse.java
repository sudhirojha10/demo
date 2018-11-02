package com.example.demo.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * The Class CustomResonse.
 */
public class CustomResonse {
	
	/**
	 * Generate response.
	 *
	 * @param httpStatus the http status
	 * @param isSuccess the is success
	 * @param message the message
	 * @param data the data
	 * @return the response entity
	 */
	public static ResponseEntity<Object> generateResponse(HttpStatus httpStatus, boolean isSuccess, String message,
			Object data) {
		Map<String, Object> map = new HashMap<>();
		try {
			map.put("timeStamp", new Date());
			map.put("isSuccess", isSuccess);
			map.put("message", message);
			map.put("data", data);
			map.put("status", httpStatus);
			return new ResponseEntity<>(map, httpStatus);
		} catch (Exception exception) {
			map.clear();
			map.put("timeStamp", new Date());
			map.put("isSuccess", false);
			map.put("message", "Interal Server Error");
			map.put("data", null);
			map.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
			return new ResponseEntity<>(map, httpStatus);
		}
	}
}
