package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.CustomResonse;

import io.swagger.annotations.ApiOperation;

/**
 * The Class TestController.
 */
@RestController
public class TestController {
	
	/**
	 * Test swagger.
	 *
	 * @return the response entity
	 */
	@ApiOperation(value = "This is for test Only")
	@GetMapping(value = "/api/testswagger")
	public ResponseEntity<Object> testSwagger(@RequestParam String name) {
		String name1 = name;
		System.out.println("#####################"+name1);
		return CustomResonse.generateResponse(HttpStatus.OK, true, "success", null);
	}
}
