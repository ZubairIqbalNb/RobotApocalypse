package com.apocalypse.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apocalypse.model.Survivor;
import com.apocalypse.model.PercentageAndSurvivorResponse;
import com.apocalypse.respositories.SurvivorRepository;
import com.apocalypse.service.SurvivorService;

@Service
public class SurvivorServiceImpl implements SurvivorService {
	
	@Autowired
	SurvivorRepository survivorRepository;

	@Override
	public Long saveSurvivor(Survivor survivor) {
		
			Survivor survivors = survivorRepository.save(survivor);	
			Long survivorId = survivors.getId();
			return survivorId;
	}

	@Override
	public Survivor updateSurvivor(Long id, String latitude, String longitude) {
		Survivor survivor = survivorRepository.findById(id).get();
		survivor.setLatitude(latitude);
		survivor.setLongitude(longitude);
		Survivor updatedSurvivor = survivorRepository.save(survivor); 
		return updatedSurvivor;
	}

	@Override
	public Survivor reportSurvivor(Long id) {
		Survivor survivor = survivorRepository.findById(id).get();
		if(survivor.getInfectionCount() == BigInteger.TWO.intValue()) {
			survivor.setIsInfected(Boolean.TRUE);
		}
		survivor.setInfectionCount(survivor.getInfectionCount() + 1);
		Survivor reportedSurvivor = survivorRepository.save(survivor);
		return  reportedSurvivor;
	}

	@Override
	public PercentageAndSurvivorResponse infectedSurvivorListAndPercentage() {
		int count =3;
		List<Survivor> infectedSurvivorList = survivorRepository.findByInfectionCountGreaterThanEqual(count);
		List<Survivor> totalSurvivors = (List<Survivor>) survivorRepository.findAll();
		int totalSurvivorsCount = totalSurvivors.size();
		int infectedCount = infectedSurvivorList.size();
		 
		 double InfectedPercentage = (infectedCount *100 / totalSurvivorsCount);
		 PercentageAndSurvivorResponse percentageAndSurvivorResponses = new PercentageAndSurvivorResponse();
		 percentageAndSurvivorResponses.setPercentage(InfectedPercentage);
		 percentageAndSurvivorResponses.setSurvivorList(infectedSurvivorList);
		 
		 return percentageAndSurvivorResponses;
	}

	@Override
	public PercentageAndSurvivorResponse nonInfectedSurvivorListAndPercentage() {
		int count =3;
		List<Survivor> nonInfectedSurvivorList = survivorRepository.findByInfectionCountLessThan(count);
		List<Survivor> totalSurvivors = (List<Survivor>) survivorRepository.findAll();
		int totalSurvivorsCount = totalSurvivors.size();
		int nonInfectedCount = nonInfectedSurvivorList.size();
		
		 double nonInfectedPercentage = (nonInfectedCount *100 / totalSurvivorsCount);
		 PercentageAndSurvivorResponse percentageAndSurvivorResponses = new PercentageAndSurvivorResponse();
		 percentageAndSurvivorResponses.setPercentage(nonInfectedPercentage);
		 percentageAndSurvivorResponses.setSurvivorList(nonInfectedSurvivorList);
		 return percentageAndSurvivorResponses;
		
	}
	
}
