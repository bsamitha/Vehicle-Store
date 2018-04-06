package com.rigor.VehicleStore.serviceimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.rigor.VehicleStore.config.BeanConfiguration;
import com.rigor.VehicleStore.config.SystemErrorException;
import com.rigor.VehicleStore.dao.VehicleDao;
import com.rigor.VehicleStore.dao.model.Vehicle;
import com.rigor.VehicleStore.service.VehicleService;

@Service
public class VehicleServiceimpl implements VehicleService {

	@Autowired
	private VehicleDao dao;

	public void createVehicle(Vehicle vehicle) throws SystemErrorException {

		try {
			dao.createVehicle(vehicle);
		} catch (SQLException e) {
			throw new SystemErrorException();
		}
	}

	public List<Vehicle> getAllVehicles() throws SystemErrorException {

		try {
			return dao.getAllVehicles();
		} catch (SQLException e) {
			throw new SystemErrorException();
		}
	}

	public Vehicle getVehicleById(int vid) throws SystemErrorException {

		try {
			return dao.getVehicleById(vid);
		} catch (SQLException e) {
			throw new SystemErrorException();
		}

	}

	public void updateVehicle(Vehicle vehicle, String colour) throws SystemErrorException {

		try {
			vehicle.setColour(colour);
			dao.updateVehicle(vehicle);
		} catch (SQLException e) {
			throw new SystemErrorException();
		}

	}

	public void deleteVehicle(Vehicle vehicle) throws SystemErrorException {

		try {
			dao.deleteVehicle(vehicle.getVehicleID());
		} catch (SQLException e) {
			throw new SystemErrorException();
		}

	}

}
