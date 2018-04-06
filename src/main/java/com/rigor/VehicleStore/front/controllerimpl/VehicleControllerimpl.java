package com.rigor.VehicleStore.front.controllerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rigor.VehicleStore.config.BeanConfiguration;
import com.rigor.VehicleStore.config.SystemErrorException;
import com.rigor.VehicleStore.dao.model.Vehicle;
import com.rigor.VehicleStore.front.controller.VehicleController;
import com.rigor.VehicleStore.service.VehicleService;

public class VehicleControllerimpl implements VehicleController {

	@Autowired
	private VehicleService service;

	public void createVehicle(Vehicle vehicle) throws SystemErrorException {

		service.createVehicle(vehicle);
	}

	public List<Vehicle> getAllVehicles() throws SystemErrorException {

		return service.getAllVehicles();
	}

	public Vehicle getVehicleById(int vid) throws SystemErrorException {

		return service.getVehicleById(vid);
	}

	public void updateVehicle(Vehicle vehicle, String colour) throws SystemErrorException {

		service.updateVehicle(vehicle, colour);
	}

	public void deleteVehicle(Vehicle vehicle) throws SystemErrorException {

		service.deleteVehicle(vehicle);
	}

}
