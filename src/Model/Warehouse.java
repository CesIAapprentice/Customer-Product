package Model;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
	
	String name;
	Map <Product,Integer>inventory;

	public Warehouse(String name) {
		this.name = name;
		this.inventory = new HashMap<Product, Integer>();
	}

	public Map<Product, Integer> getInventory() {
		return inventory;
	}

	public void setInventory(Map<Product, Integer> inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
