package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment {
	@Override
	public String getdepartmentName(){
		return (" Welcome to Admin Department");
	}
	@Override
	public String getTodaysWork() {
		return ("Complete your documents Submission");
	}
	@Override
	public String getWorkDeadline() {
		return ("Complete by EOD ");
	}

	
}
