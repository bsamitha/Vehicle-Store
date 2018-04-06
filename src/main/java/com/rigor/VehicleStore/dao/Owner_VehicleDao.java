package com.rigor.VehicleStore.dao;

import java.util.List;

import com.rigor.VehicleStore.dao.model.Owner;

public interface Owner_VehicleDao {

	public List<Owner> getAllData();

	public List<Owner> getOwnerVehicles(int oid);

	public List<Owner> getVehicleOwner(int vid);

	public List<Owner> getDataById(int vid);
	
}
