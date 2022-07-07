package com.apocalypse.model;

import java.util.List;

public class PercentageAndSurvivorResponse {
	
	double percentage;
	
	List<Survivor> survivorList;

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public List<Survivor> getSurvivorList() {
		return survivorList;
	}

	public void setSurvivorList(List<Survivor> survivorList) {
		this.survivorList = survivorList;
	}
	
}
