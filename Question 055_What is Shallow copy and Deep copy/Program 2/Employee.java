package com.clonealbe.demo;

class Company {
	private String name;
	public Company(String name) {
		this.name = name;
	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}

}

public class Employee {
	private String name;
	private int age;
	private Company company;
	
	public Employee(String name, int age, Company company) {
		this.name = name;
		this.age = age;
		this.company = company;
	}
	
	//Copy constructor
	public Employee(Employee emp) {
		this.name = emp.getName();
		this.age = emp.getAge();
		Company company = new Company(emp.getCompany().getName());
		this.company = company;
	}
	
	public String getName() {	return name;	}
	public int getAge() {	return age;		}
	public void setName(String name) {	this.name = name; 	}
	public void setAge(int age) {	this.age = age;		}
	public Company getCompany() {	return company;		}
	public void setCompany(Company company) {	this.company = company;		}

	public static void main(String[] args) {
		Company c1 = new Company("Company_ABC");
		Employee e1 = new Employee("Mike", 10, c1);
		System.out.println("Employee 1, company name : " + e1.getCompany().getName());
		
		//Invoking copy constructor
		Employee e2 = new Employee(e1);
		System.out.println("Employee 2, company name : " + e2.getCompany().getName());
		e2.getCompany().setName("XYZ");
		System.out.println("----------------------------");
		System.out.println("Employee 1, company name : " + e1.getCompany().getName());
		System.out.println("Employee 2, company name : " + e2.getCompany().getName());
	}
}