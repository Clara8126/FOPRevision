package com.greatlearning.driverclass;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class DriverClass {
	public static void main(String[] agrs) 
	{
AdminDepartment admin = new AdminDepartment();
System.out.println(admin.getdepartmentName());
System.out.println(admin.getTodaysWork());
System.out.println(admin.getWorkDeadline());
System.out.println(admin.isTodayAHoliday());

HrDepartment hr = new HrDepartment();
System.out.println(hr.getdoActivity());
System.out.println(hr.getdepartmentName());
System.out.println(hr.getTodaysWork());
System.out.println(hr.getWorkDeadline());
System.out.println(hr.isTodayAHoliday());


TechDepartment tech = new TechDepartment();
System.out.println(tech.getdepartmentName());
System.out.println(tech.getTodaysWork());
System.out.println(tech.getWorkDeadline());
System.out.println(tech.getStackTechInformation());
System.out.println(tech.isTodayAHoliday());	
	
}
}
