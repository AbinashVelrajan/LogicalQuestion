package org.logic;

public class Employee {
	
	private void add() throws EmployeeNotFoundException{
		throw new EmployeeNotFoundException();
		}
	public static void main(String[] args) throws EmployeeNotFoundException {
		Employee e = new Employee();
		e.add();
		
	}

}
