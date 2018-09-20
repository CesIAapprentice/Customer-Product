package Controller;

import Model.Customer;
import Model.Order;
import Model.Product;
import Model.Warehouse;

public class ControllerProduct {
	
	
//-------------------------------------------------------
// METHODS	
	
	public void addProductToWarehouse(Product product, Warehouse warehouse, Integer quantity) {
		if(!warehouse.getInventory().keySet().contains(product)){
			warehouse.getInventory().put(product, quantity);
		} else {
			warehouse.getInventory().replace(product, warehouse.getInventory().get(product) + quantity);
		}
	}
	
	public void createOrder(Customer customer, Boolean isPrepaid, String numberOfOrder) {
		customer.getOrder().add(new Order(isPrepaid,numberOfOrder));
		
	}
	
	public void addProductToOrder(Order order, Product product, Integer quantity) {
		if(!order.getOrderline().getOrderlist().containsKey(product)){
			order.getOrderline().getOrderlist().put(product, quantity);
		} else {
			order.getOrderline().getOrderlist().replace(product, order.getOrderline().getOrderlist().get(product) + quantity);
		}
	}

}
