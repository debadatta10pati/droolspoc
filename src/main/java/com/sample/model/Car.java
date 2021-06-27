package com.sample.model;

public class Car {
	
	private String carName;
	
	private String manufacturer;
	
	private int carPrice;
	
	private int carMake;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getCarMake() {
		return carMake;
	}

	public void setCarMake(int carMake) {
		this.carMake = carMake;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", manufacturer=" + manufacturer + ", carPrice=" + carPrice + ", carMake="
				+ carMake + "]";
	}
	
	

}
