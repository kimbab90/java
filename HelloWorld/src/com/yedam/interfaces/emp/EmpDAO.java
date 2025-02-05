package com.yedam.interfaces.emp;

public interface EmpDAO {

	boolean registerEmp(Employee emp);
	
	boolean modifyEmp(Employee emp);
	
	boolean removeEmp(int empNo);
	
	Employee[] search(Employee emp);
	
}
