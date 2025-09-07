package com.interfaces;

public class College {

	private int collegeId;
	private String collegeName;
	private CollegeComponent component;
	
	public College(int collegeId, String collegeName, CollegeComponent component) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.component = component;
	}

	public String getInfo() {
		return this.collegeId + " "+ this.collegeName+" "+ this.component.getComponentName();
	}
	
	
}
