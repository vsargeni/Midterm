package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SectionID;
	private Date StartDate;
	private Date EndDate;
	
	
	
	
	
	
	
	
	
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}

