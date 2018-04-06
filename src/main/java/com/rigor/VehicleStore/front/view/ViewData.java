package com.rigor.VehicleStore.front.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rigor.VehicleStore.config.BeanConfiguration;
import com.rigor.VehicleStore.config.SystemErrorException;
import com.rigor.VehicleStore.dao.model.Vehicle;
import com.rigor.VehicleStore.front.controller.VehicleController;

public class ViewData {

	public static void main(String[] args) {

		ApplicationContext appcon = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		VehicleController controller = (VehicleController) appcon.getBean("vehicleController");

		List<Vehicle> viewList;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println();
				System.out.println("1. Get Vehicle by id");
				System.out.println("2. Get All Vehicless");
				System.out.println("3. Insert new Vehicle");
				System.out.println("4. Remove Vehicle");
				System.out.println("5. Update Vehicle details:");
				System.out.println("6. Exit");
				int select = input.nextInt();

				if (0 < select && select > 7) {
					System.out.println("invalid!");
				}
				if (select == 1) {
					System.out.println("vehicle id :");
					int id = input.nextInt();
					System.out.println(controller.getVehicleById(id).toString());
				}
				if (select == 2) {
					viewList = controller.getAllVehicles();
					Iterator<Vehicle> itr = viewList.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());
					}
				}
				if (select == 3) {
					System.out.println("Enter vehicle details:");
					System.out.println("vehicle id:");
					int vehicleid = input.nextInt();
					System.out.println("type:");
					String type = input.next();
					System.out.println("brand:");
					String brand = input.next();
					System.out.println("model:");
					String model = input.next();
					System.out.println("colour:");
					String colour = input.next();
					System.out.println("year:");
					String year = input.next();
					System.out.println("owner:");
					int ownerid = input.nextInt();
					controller.createVehicle(new Vehicle(vehicleid, type, brand, model, colour, year, ownerid));
				}
				if (select == 4) {
					System.out.println("Enter vehicle id to remove:");
					int vid = input.nextInt();
					controller.deleteVehicle(controller.getVehicleById(vid));
				}

				if (select == 5) {
					System.out.println("Enter vehicle id:");
					int id = input.nextInt();
					System.out.println("colour to update:");
					String colour = input.next();
					controller.updateVehicle(controller.getVehicleById(id), colour);
					System.out.println("Succesfully Updated");
				}
				if (select == 6) {
					System.out.println("selected to terminate");
					break;
				}
			} catch (SystemErrorException e) {
				System.out.println("System Error");
				System.out.println("Please retry");
				System.exit(0);
			}
		}
		System.out.println("terminated");
		System.exit(0);
	}
}
