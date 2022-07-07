package com.apocalypse.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.apocalypse.model.Survivor;

public interface SurvivorRepository extends CrudRepository<Survivor, Long> {
	
	public List<Survivor> findByInfectionCountGreaterThanEqual(int count);
	
	public List<Survivor> findByInfectionCountLessThan(int count);
	
}
