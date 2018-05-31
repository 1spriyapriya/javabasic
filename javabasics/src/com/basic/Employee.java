package com.basic;

public class Employee {
	String firstname;
	String lastname;
	double salary;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		if(salary <0)
		{
	    return salary;
		}
	  return 0;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String s[]){
	Employee e1=new Employee();
	e1.setFirstname("firstname");
	e1.setSalary(10000);
	System.out.println(e1.salary*12);
	double salary = e1.getSalary();
	salary=salary*1.1;
	Employee e2=new Employee();
	e2.setLastname("lastname");
	e2.setSalary(20000);
	System.out.println(e2.salary*12);
	salary = e2.getSalary();
	salary=salary*1.1;
	System.out.println(e1.salary);
	System.out.println(e2.salary);
	}

}
