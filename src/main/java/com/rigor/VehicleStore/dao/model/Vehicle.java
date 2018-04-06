package com.rigor.VehicleStore.dao.model;

public class Vehicle {

	private int vehicleID;
	private String type;
	private String brand;
	private String model;
	private String colour;
	private String year;
	private int ownerid;
	
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public Vehicle(){
		
	}
	public Vehicle(int vehicleID, String type, String brand, String model, String colour, String year, int ownerid) {
		super();
		this.vehicleID = vehicleID;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.year = year;
		this.ownerid = ownerid;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", type=" + type + ", brand=" + brand + ", model=" + model
				+ ", colour=" + colour + ", year=" + year + "]";
	}
	
}
