package com.rigor.VehicleStore.dao.model;

import java.util.List;

public class Owner {

	private int ownerid;
	private String name;
	private List<Vehicle> vehicles;
	
	public Owner(){
		
	}
	
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public String toString() {
		return "Owner [ownerid=" + ownerid + ", name=" + name + ", vehicles=" + vehicles + "]";
	}
	
	
}
