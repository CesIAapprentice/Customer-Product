package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Warehouse;

public class ControllerWarehouse {
	
	List<Warehouse> warehouses;
	
//------------------------------------------------------
// CONSTRUCTOR	
	
	public ControllerWarehouse() {
		this.warehouses = new ArrayList<Warehouse>();
	}

//-------------------------------------------------------
// METHODS

	public void addWarehouse(String name) {
		this.warehouses.add(new Warehouse(name));
	}

//-------------------------------------------------------
// GETTERS & SETTERS
	
	public List<Warehouse> getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(List<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}
	
	
}