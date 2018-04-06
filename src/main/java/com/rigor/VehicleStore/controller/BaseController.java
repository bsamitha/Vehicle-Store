package com.rigor.VehicleStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rigor.VehicleStore.config.SystemErrorException;
import com.rigor.VehicleStore.dao.model.Vehicle;
import com.rigor.VehicleStore.service.VehicleService;
import com.rigor.VehicleStore.serviceimpl.VehicleServiceimpl;

@Controller
public class BaseController {

	@Autowired
	private VehicleService vehicleservice;
	
	@RequestMapping(value = "/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/allData", method = RequestMethod.GET )
	public ResponseEntity<List<Vehicle>> getAllVehicles() throws SystemErrorException{
		List<Vehicle> values = new ArrayList<Vehicle>();
		values = vehicleservice.getAllVehicles();
		return new ResponseEntity<List<Vehicle>>(values, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/dataById/{id}", method = RequestMethod.GET)
	public ResponseEntity<Vehicle> getVehicleById(@PathVariable("id") int id) throws SystemErrorException{
		Vehicle vehicle = vehicleservice.getVehicleById(id);
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/insertData", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addVehicle(@RequestBody Vehicle vehicle) throws SystemErrorException {
	  vehicleservice.createVehicle(vehicle);
	 }
	
}
