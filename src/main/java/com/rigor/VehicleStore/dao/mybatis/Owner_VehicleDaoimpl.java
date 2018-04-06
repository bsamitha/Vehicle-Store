package com.rigor.VehicleStore.dao.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.rigor.VehicleStore.dao.OwnerDao;
import com.rigor.VehicleStore.dao.Owner_VehicleDao;
import com.rigor.VehicleStore.dao.model.Owner;

public class Owner_VehicleDaoimpl implements Owner_VehicleDao {

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

	@Override
	public List<Owner> getAllData() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Owner_VehicleDao dao = session.getMapper(Owner_VehicleDao.class);
			return dao.getAllData();
		} finally {
			session.close();
		}
	}

	@Override
	public List<Owner> getOwnerVehicles(int oid) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Owner_VehicleDao dao = session.getMapper(Owner_VehicleDao.class);
			return dao.getOwnerVehicles(oid);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Owner> getVehicleOwner(int vid) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Owner_VehicleDao dao = session.getMapper(Owner_VehicleDao.class);
			return dao.getVehicleOwner(vid);
		} finally {
			session.close();
		}
	}
	
	public static void main(String[] args){
		Owner_VehicleDaoimpl obj = new Owner_VehicleDaoimpl();
		System.out.println(obj.getDataById(1801));
		System.out.println(obj.getAllData());
	}

	@Override
	public List<Owner> getDataById(int vid) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Owner_VehicleDao dao = session.getMapper(Owner_VehicleDao.class);
			return dao.getDataById(vid);
		} finally {
			session.close();
		}
	}

}
