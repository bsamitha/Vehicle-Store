package com.rigor.VehicleStore.front.controller;

import java.util.List;

import com.rigor.VehicleStore.config.SystemErrorException;
import com.rigor.VehicleStore.dao.model.Vehicle;

public interface VehicleController {
	public void createVehicle(Vehicle vehicle) throws SystemErrorException;

	public List<Vehicle> getAllVehicles() throws SystemErrorException;

	public Vehicle getVehicleById(int vid) throws SystemErrorException;

	public void updateVehicle(Vehicle vehicle, String colour) throws SystemErrorException;

	public void deleteVehicle(Vehicle vehicle) throws SystemErrorException;
}
