package com.sort;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		int flag = emp1.getName().compareTo(emp2.getName());
		if(flag == 0) {
			flag = emp1.getAge() - emp2.getAge();
		}
		return flag;
	}

}
