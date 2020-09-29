package com.immutable.demo;

public class TestImmutable {

	public static void main(String[] args) {
		Address address = new Address("Chennai", "Tamil Nadu");
		Employee employee = new Employee("Mike", 15, address);
		
		System.out.println("Original Employee object : \n" + employee);
		
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		
		System.out.println("Employee object after local variable address change :\n" + employee);
		
		Address empAddress = employee.getAddress();
		empAddress.setCity("Jaipur");
		empAddress.setState("Rajasthan");
		
		System.out.println("Employee object after employee address change:\n" + employee);
	}

}
