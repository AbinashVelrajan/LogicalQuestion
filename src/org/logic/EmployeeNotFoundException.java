package org.logic;

public class EmployeeNotFoundException extends Exception{

	@Override
	public String getMessage() {
		
		return "EmployeeNotFound";
	}

}
