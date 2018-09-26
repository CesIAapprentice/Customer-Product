package Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
	
	public Product getProductByName(String name) {
		for(Product product : this.inventory.keySet()) {
			if(product.getName().equals(name)){
				return product;
			}
		}
		return null;
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
	
	public Set<Product> getProducts(){
		return inventory.keySet();
	}

	public void setInventory(Map<Product, Integer> inventory) {
		this.inventory = inventory;
	}
	
	
	
	
}
