package com.rigor.VehicleStore.dao;

import java.sql.SQLException;
import java.util.List;

import com.rigor.VehicleStore.dao.model.Vehicle;

public interface VehicleDao {

	public void createVehicle(Vehicle vehicle) throws SQLException;

	public List<Vehicle> getAllVehicles() throws SQLException;

	public Vehicle getVehicleById(int vid) throws SQLException;

	public void updateVehicle(Vehicle vehicle) throws SQLException;

	public void deleteVehicle(int vid) throws SQLException;
}
