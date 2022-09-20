package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * CRUD Operations for Specimen
 *
 */
public interface ISpecimenService {

	/**
	 * Get specimens from persistence layer
	 * @param id - a unique lookup
	 * @return a specimen with a matching id
	 */
	SpecimenDTO fetchByID(int id);

	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 */
	void save(SpecimenDTO specimenDTO);

}