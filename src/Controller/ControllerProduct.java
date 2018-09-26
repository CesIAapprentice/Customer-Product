package Controller;

import java.util.HashMap;
import java.util.Map;

import Model.Product;

public class ControllerProduct {
	
	private Map <Product, Integer> inventory;
	
//-------------------------------------------------------
// CONSTRUCTOR
	
	public ControllerProduct() {
	this.inventory = new HashMap<Product, Integer>();
	}
	
//-------------------------------------------------------
// METHODS	
		
	public void addNewProduct(Product product, Integer quantity) {
		this.inventory.put(product, quantity);
	}
	
	public void addMoreUnits(Product product, Integer quantity) {
		this.inventory.put(product, getQuantity(product) +quantity);
	}
	
	public Integer getQuantity(Product product) {
		return this.inventory.get(product);
	}

	public void takeProductUnits (Product product, Integer quantity) {
		this.inventory.put(product, getQuantity(product) - quantity);
	}
	
//-------------------------------------------------------
// GETTERS & SETTERS	
				
	public Map<Product, Integer> getInventory() {
		return inventory;
	}

	public void setInventory(Map<Product, Integer> inventory) {
		this.inventory = inventory;
	}
	
	
	
	
}
