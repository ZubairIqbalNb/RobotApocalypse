package com.apocalypse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apocalypse.model.Survivor;
import com.apocalypse.model.PercentageAndSurvivorResponse;
import com.apocalypse.service.SurvivorService;

@RestController
@RequestMapping("/survivor")
public class SurvivorController {
	
	@Autowired
	SurvivorService survivorService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Survivor survivor) {
		Long id = survivorService.saveSurvivor(survivor);
		return new ResponseEntity<Long>(id, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/update-location")
	public ResponseEntity<?> updateLocation(@RequestParam("survivor_id") Long id,
			@RequestParam("last_location") String lastLocation) {	
		Survivor survivor =survivorService.updateSurvivor(id, lastLocation);
		return new ResponseEntity<Survivor>(survivor, HttpStatus.OK);
	}
	
	@GetMapping(value = "/infected-list-and-percentage")
	public ResponseEntity<?> getInfectedListAndPercentage(){
		PercentageAndSurvivorResponse infectedSurvivorListAndPercentage =(PercentageAndSurvivorResponse) survivorService.infectedSurvivorListAndPercentage();
		return new ResponseEntity<PercentageAndSurvivorResponse>(infectedSurvivorListAndPercentage, HttpStatus.OK);
	}
	
	@GetMapping(value = "/non-infected-list-and-percentage")
	public ResponseEntity<?> getNonInfectedListAndPercentage(){	
		PercentageAndSurvivorResponse nonInfectedSurvivorListAndPercentage = survivorService.nonInfectedSurvivorListAndPercentage();
		return new ResponseEntity<PercentageAndSurvivorResponse>(nonInfectedSurvivorListAndPercentage, HttpStatus.OK);	
	}

}
