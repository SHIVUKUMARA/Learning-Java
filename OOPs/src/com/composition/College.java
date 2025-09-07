package com.composition;

public class College {

	private int collegeId;
	private String collegeName;
	private Department dept;

	public College(int collegeId, String collegeName, Department dept) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "],\n dept=[" + dept + "]";
	}

	
}
