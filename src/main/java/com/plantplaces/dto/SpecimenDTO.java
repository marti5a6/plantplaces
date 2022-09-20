package com.plantplaces.dto;

public class SpecimenDTO {
	
	private int specimenID;
	private String latitudes;
	private String longitudes;
	private String description;
	
	
	
	public int getSpecimenID() {
		return specimenID;
	}
	
	public void setSpecimenID(int specimenID) {
		this.specimenID = specimenID;
	}
	
	public String getLatitudes() {
		return latitudes;
	}
	
	public void setLatitudes(String latitudes) {
		this.latitudes = latitudes;
	}
	
	public String getLongitudes() {
		return longitudes;
	}
	
	public void setLongitudes(String longitudes) {
		this.longitudes = longitudes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
