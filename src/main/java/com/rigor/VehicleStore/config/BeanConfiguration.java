package com.rigor.VehicleStore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rigor.VehicleStore.dao.VehicleDao;
import com.rigor.VehicleStore.dao.mybatis.VehicleDaoimpl;
import com.rigor.VehicleStore.front.controller.VehicleController;
import com.rigor.VehicleStore.front.controllerimpl.VehicleControllerimpl;
import com.rigor.VehicleStore.service.VehicleService;
import com.rigor.VehicleStore.serviceimpl.VehicleServiceimpl;

@Configuration
public class BeanConfiguration {

	@Bean(name = "vehicleDao")
	public VehicleDao getVehicleDao() {
		return new VehicleDaoimpl();
	}

	@Bean(name = "vehicleService")
	public VehicleService getVehicleService() {
		return new VehicleServiceimpl();
	}
	
	@Bean(name = "vehicleController")
	public VehicleController getVehicleController(){
		return new VehicleControllerimpl();
	}
}
