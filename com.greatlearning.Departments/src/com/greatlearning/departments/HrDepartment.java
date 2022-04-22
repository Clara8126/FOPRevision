package com.greatlearning.departments;

public class HrDepartment extends SuperDepartment {
	public class AdminDepartment extends SuperDepartment {
		
		
		@Override
		public String getdepartmentName() {
			return (" Welcome to HR Department");
		}
		@Override
		public String getTodaysWork() {
			return ("Fill today’s worksheet and mark your attendance");
		}
		@Override
		public String getWorkDeadline() {
			return ("Complete by EOD ");
		}
		public String getdoActivity(){
			return ("Team Lunch ");
		}
		
		
	}

	
	
}
	
