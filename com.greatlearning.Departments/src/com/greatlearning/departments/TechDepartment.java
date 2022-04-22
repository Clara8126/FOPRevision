package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment {
	public class AdminDepartment extends SuperDepartment {
		@Override
		public String getdepartmentName() {
			return (" Welcome to Tech Department ");
		}

		@Override
		public String getTodaysWork() {
			return ("Complete coding of module 1");
		}

		@Override
		public String getWorkDeadline() {
			return ("Complete by EOD ");
		}

		public String getTechStackInformation() {
			return ("Core Java ");
		}
	}

	}



