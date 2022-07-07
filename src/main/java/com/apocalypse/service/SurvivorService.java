package com.apocalypse.service;

import com.apocalypse.model.Survivor;
import com.apocalypse.model.PercentageAndSurvivorResponse;

public interface SurvivorService {
	
	public Long saveSurvivor (Survivor survivor); 
	
	public Survivor updateSurvivor(Long id , String latitude , String longitude);
	
	public Survivor reportSurvivor(Long id);
	
	public PercentageAndSurvivorResponse infectedSurvivorListAndPercentage();
	
	public PercentageAndSurvivorResponse nonInfectedSurvivorListAndPercentage();

} 
