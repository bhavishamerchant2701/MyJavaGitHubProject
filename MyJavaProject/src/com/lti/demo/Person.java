package com.lti.demo;

public class Person {

	private String PersonName;
	private int PersonAge;
	private double Salary;
	
	public Person(String personName, int personAge, double salary) {
		super();
		PersonName = personName;
		PersonAge = personAge;
		Salary = salary;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public int getPersonAge() {
		return PersonAge;
	}
	public void setPersonAge(int personAge) {
		PersonAge = personAge;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Person [PersonName=" + PersonName + ", PersonAge=" + PersonAge + ", Salary=" + Salary + "]";
	}
	
}
