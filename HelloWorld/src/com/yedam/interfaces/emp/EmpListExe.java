package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmpListExe implements EmpDAO {

	List<Employee> empList = new ArrayList<Employee>();

	public EmpListExe() {
		empList.add(new Employee(1001, "김사원", "1111"));
		empList.add(new Employee(1002, "이대리", "2222"));
		empList.add(new Employee(1003, "박주임", "3333"));
		empList.add(new Employee(1004, "최사장", "4444", "2000-01-01", 500));
	}

	@Override
	public boolean registerEmp(Employee emp) {
		// TODO Auto-generated method stub
		return empList.add(emp);
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == emp.getEmpNo()) {

				if (!emp.getTelNo().equals("")) {
					empList.get(i).setTelNo(emp.getTelNo());
				}

//				if (!sdf.format(emp.getHireDate()).equals("1900-01-01")) {
//					empList.get(i).setHireDate(emp.getHireDate());
//				}

				try {
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						empList.get(i).setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}

				if (emp.getSalary() != 0) {
					empList.get(i).setSalary(emp.getSalary());
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == empNo) {
				empList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		// TODO Auto-generated method stub
		Employee[] result = new Employee[10];
		int idx = 0;

//		for (int i = 0; i < empList.size(); i++) {
//			if (empList.get(i).getSalary() >= emp.getSalary()
//					&& (empList.get(i).getEmpName().indexOf(emp.getEmpName()) != -1)) {
//				result[idx] = empList.get(i);
//				idx++;
//			}
//		}
		
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpName().indexOf(emp.getEmpName()) != -1) {
				result[idx] = empList.get(i);
				idx++;
			}
		}

		return result;
	}

}
