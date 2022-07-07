package com.apocalypse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Robot {
	
	@JsonProperty
	String model;
	
	@JsonProperty
	String serialNumber;
	
	@JsonProperty
	String manufacturedDate;
	
	@JsonProperty
	String category;

}
