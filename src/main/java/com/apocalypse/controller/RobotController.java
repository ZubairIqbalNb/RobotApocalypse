package com.apocalypse.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apocalypse.model.Robot;

@RestController
@RequestMapping("/robot")
public class RobotController {
	
	@Autowired
	RestTemplate restTemplate;

	   @RequestMapping(value = "/list")
	   public ResponseEntity<?> getRobotList() {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    String robotListUrl = "https://robotstakeover20210903110417.azurewebsites.net/robotcpu";
	      
	    Robot[] robots = restTemplate.getForObject(robotListUrl,Robot[].class);
	   
	    return ResponseEntity.ok(robots);
	    }

}
