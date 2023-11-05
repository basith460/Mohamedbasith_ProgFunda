package com.gradedProject.q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment Aob=new AdminDepartment();
		System.out.println(Aob.departmentName());
		System.out.println(Aob.getTodaysWork());
		System.out.println(Aob.getWorkDeadline());
		System.out.println(Aob.isTodayAHoliday());
		System.out.println();
		HrDepartment hob=new HrDepartment();
		System.out.println(hob.departmentName());
		System.out.println(hob.doActivity());
		System.out.println(hob.getTodaysWork());
		System.out.println(hob.getWorkDeadline());
		System.out.println(hob.isTodayAHoliday());
		System.out.println();
		TechDepartment tob=new TechDepartment();
		System.out.println(tob.departmentName());
		System.out.println(tob.getTodaysWork());
		System.out.println(tob.getWorkDeadline());
		System.out.println(tob.getTechStackInformation());
		System.out.println(tob.isTodayAHoliday());

	}

}
