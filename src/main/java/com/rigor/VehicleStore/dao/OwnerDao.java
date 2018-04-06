package com.rigor.VehicleStore.dao;

import java.util.List;

import com.rigor.VehicleStore.dao.model.Owner;

public interface OwnerDao {

	public void createOwner(Owner owner);

	public List<Owner> getAllOwners();

	public void updateOwner(Owner owner);

	public void deleteOwner(int oid);

	public Owner getOwnerById(int oid);

}
