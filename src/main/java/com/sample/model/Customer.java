package com.sample.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;

	private int age;

	private int income;

	private int ssn;

	private List<String> cars;
	
	
	

	public Customer(String name, int age, int income, int ssn) {
		this.name = name;
		this.age = age;
		this.income = income;
		this.ssn = ssn;
	}

	public Customer() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}
	
	public void addString(String value) {  
        if (cars == null) {  
        	cars = new ArrayList<String>();  
        }  
        cars.add(value);  
   }

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", income=" + income + ", ssn=" + ssn + ", cars=" + cars
				+ "]";
	}  
	
	

}
