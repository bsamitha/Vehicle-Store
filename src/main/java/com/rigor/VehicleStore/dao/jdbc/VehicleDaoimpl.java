/*package com.rigor.VehicleStore.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rigor.VehicleStore.dao.VehicleDao;
import com.rigor.VehicleStore.dao.model.Vehicle;

public class VehicleDaoimpl implements VehicleDao {

	private Vehicle vehicle;
	private Connection connection;
	private Statement statement;
	private final String url = "jdbc:mysql://localhost:3306/vehiclestore";

	public void createVehicle(Vehicle vehicle) throws SQLException {
		try {
			String query = "Insert into vehicledata (vehicleid, type, brand, model, colour, year) Values("
					+ vehicle.getVehicleID() + ",'" + vehicle.getType() + "','" + vehicle.getBrand() + "','"
					+ vehicle.getModel() + "','" + vehicle.getColour() + "','" + vehicle.getYear() + "')";
			connection = DriverManager.getConnection(url, "root", "root");
			PreparedStatement prstatement = connection.prepareStatement(query);
			int val = prstatement.executeUpdate();
			System.err.println("created by " + val);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

	}

	public List<Vehicle> getAllVehicles() throws SQLException {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		try {
			String query = "Select * From vehicledata";
			connection = DriverManager.getConnection(url, "root", "root");
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				vehicle = new Vehicle(rs.getInt("vehicleid"), rs.getString("type"), rs.getString("brand"),
						rs.getString("model"), rs.getString("colour"), rs.getString("year"));
				vehicles.add(vehicle);
			}
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		return vehicles;
	}

	public Vehicle getVehicleById(int vid) throws SQLException {
		try {
			String query = "Select * From vehicledata where vehicleid = " + vid;
			connection = DriverManager.getConnection(url, "root", "root");
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.first()) {
				vehicle = new Vehicle(rs.getInt("vehicleid"), rs.getString("type"), rs.getString("brand"),
						rs.getString("model"), rs.getString("colour"), rs.getString("year"));
			}
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		return vehicle;
	}

	public void updateVehicle(Vehicle vehicle, String colour) throws SQLException {
		try {
			String query = "UPDATE vehicledata set colour = '" + colour + "' where vehicleid = '" + vehicle.getVehicleID()
					+ "'";
			connection = DriverManager.getConnection(url, "root", "root");
			PreparedStatement prstatement = connection.prepareStatement(query);
			int val = prstatement.executeUpdate();
			System.err.println("rows effected :" + val);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}



	public void deleteVehicle(int vid) throws SQLException {
		try {
			String query = "DELETE FROM `vehiclestore`.`vehicledata` WHERE `vehicleid`='" + vid
					+ "';";
			connection = DriverManager.getConnection(url, "root", "root");
			PreparedStatement prstatement = connection.prepareStatement(query);
			int val = prstatement.executeUpdate();
			System.err.println("rows affected " + val);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

	}

	public void updateVehicle(Vehicle vehicle) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
*/