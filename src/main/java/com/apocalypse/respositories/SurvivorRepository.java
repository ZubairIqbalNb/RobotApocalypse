package com.apocalypse.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.apocalypse.model.Survivor;

public interface SurvivorRepository extends CrudRepository<Survivor, Long> {
	
	public List<Survivor> findByContaminationCountGreaterThanEqual(int count);
	
	public List<Survivor> findByContaminationCountLessThan(int count);
	
}
