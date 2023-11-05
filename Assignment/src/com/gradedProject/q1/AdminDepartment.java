package com.gradedProject.q1;

public class AdminDepartment extends SuperDepartment{
	@Override
	public String departmentName() {
		return "welcome to Admin Department";
	}
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";

	}
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
