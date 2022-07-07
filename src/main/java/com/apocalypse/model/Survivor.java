package com.apocalypse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="survivor")
public class Survivor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column(name="name")
	String name;
	
	@Column(name="age")
	String age;
	
	@Column(name="gender")
	String gender;
	
	@Column(name="last_location")
	String lastLocation;
	
	@Column(name="water")
	Boolean water;
	
	@Column(name="food")
	Boolean food;
	
	@Column(name="medication")
	Boolean medication;
	
	@Column(name="ammunition")
	Boolean ammunition;
	
	@Column(name="contamination_count")
	int contaminationCount;
	
	@Column(name="is_infected")
	Boolean isInfected;

	public Survivor() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastLocation() {
		return lastLocation;
	}

	public void setLastLocation(String lastLocation) {
		this.lastLocation = lastLocation;
	}

	public Boolean getWater() {
		return water;
	}

	public void setWater(Boolean water) {
		this.water = water;
	}

	public Boolean getFood() {
		return food;
	}

	public void setFood(Boolean food) {
		this.food = food;
	}

	public Boolean getMedication() {
		return medication;
	}

	public void setMedication(Boolean medication) {
		this.medication = medication;
	}

	public Boolean getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(Boolean ammunition) {
		this.ammunition = ammunition;
	}

	public int getContaminationCount() {
		return contaminationCount;
	}

	public void setContaminationCount(int contaminationCount) {
		this.contaminationCount = contaminationCount;
	}

	public Boolean getIsInfected() {
		return isInfected;
	}

	public void setIsInfected(Boolean isInfected) {
		this.isInfected = isInfected;
	}

}
