package com.rigor.VehicleStore.service;

import java.sql.SQLException;
import java.util.List;

import com.rigor.VehicleStore.config.SystemErrorException;
import com.rigor.VehicleStore.dao.model.Vehicle;

public interface VehicleService {

	public void createVehicle(Vehicle vehicle) throws SystemErrorException;

	public List<Vehicle> getAllVehicles() throws SystemErrorException;

	public Vehicle getVehicleById(int vid) throws SystemErrorException;

	public void updateVehicle(Vehicle vehicle, String colour) throws SystemErrorException;

	public void deleteVehicle(Vehicle vehicle) throws SystemErrorException;

}
