package com.collection1;

import java.util.List;

public class Job {

	private int jobId;
	private String jobName;
	
	private List<Employee> Employee;

	public Job(int jobId, String jobName, List<Employee> employee) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.Employee = employee;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobName=" + jobName + ", employee=" + Employee + "]";
	}
	
}
