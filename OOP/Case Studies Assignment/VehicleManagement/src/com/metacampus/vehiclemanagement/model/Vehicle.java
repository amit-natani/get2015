package com.metacampus.vehiclemanagement.model;

public class Vehicle {

	private String make;
	private String model;
	private String engineCC;
	private String fuelCapacity;
	private String mileage;
	
	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public String getFuelCapacity() {
		return fuelCapacity;
	}
	public String getMileage() {
		return mileage;
	}
	public String toString() {
		return "Make: "+getMake()+",Model: "+getModel()+
				",Engine CC: "+getEngineCC()+
				",Fuel Capacity: "+getFuelCapacity()+
				",Mileage: "+getMileage();
	}
}
