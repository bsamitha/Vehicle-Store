package com.rigor.VehicleStore.dao.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.rigor.VehicleStore.dao.OwnerDao;
import com.rigor.VehicleStore.dao.VehicleDao;
import com.rigor.VehicleStore.dao.model.Owner;

public class OwnerDaoimpl implements OwnerDao {

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
	public void createOwner(Owner owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Owner> getAllOwners() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			OwnerDao dao = session.getMapper(OwnerDao.class);
			return dao.getAllOwners();
		} finally {
			session.close();
		}
	}
	
	public static void main(String[] args){
		OwnerDaoimpl obj = new OwnerDaoimpl();
		System.out.println(obj.getAllOwners());
	}

	@Override
	public void updateOwner(Owner owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOwner(int oid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Owner getOwnerById(int oid) {
		// TODO Auto-generated method stub
		return null;
	}

}
