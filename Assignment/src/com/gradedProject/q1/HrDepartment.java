package com.gradedProject.q1;

public class HrDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Welcome to HR Department";
	}
	@Override
	public String  getTodaysWork() {
		return "Fill today's timesheet and mark yout attendance";
	}
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "Team Lunch";
	}

}
