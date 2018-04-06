package com.rigor.VehicleStore.dao.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.rigor.VehicleStore.dao.VehicleDao;
import com.rigor.VehicleStore.dao.model.Vehicle;

@Component
public class VehicleDaoimpl implements VehicleDao {

	private static SqlSessionFactory sqlSessionFactory;

	static {
		String resource = "Mybatis/config/mybatis_Config.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);

			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void createVehicle(Vehicle vehicle) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			VehicleDao dao = session.getMapper(VehicleDao.class);
			dao.createVehicle(vehicle);
			session.commit();
		} finally {
			session.close();
		}
	}

	public List<Vehicle> getAllVehicles() throws SQLException {

		SqlSession session = sqlSessionFactory.openSession();
		try {
			VehicleDao dao = session.getMapper(VehicleDao.class);
			return dao.getAllVehicles();
		} finally {
			session.close();
		}
	}

	public Vehicle getVehicleById(int vid) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			VehicleDao dao = session.getMapper(VehicleDao.class);
			return dao.getVehicleById(vid);
		} finally {
			session.close();
		}
	}

	public void updateVehicle(Vehicle vehicle) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			VehicleDao dao = session.getMapper(VehicleDao.class);
			dao.updateVehicle(vehicle);
			session.commit();
		} finally {
			session.close();
		}

	}
	
	public void deleteVehicle(int vid) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			VehicleDao dao = session.getMapper(VehicleDao.class);
			dao.deleteVehicle(vid);
			session.commit();
		} finally {
			session.close();
		}

	}

}
