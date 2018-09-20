package View;

import Model.Order;
import Model.Product;
import Model.Warehouse;

public class Report {
	
	public void whatsInWarehouse(Warehouse warehouse) {
		
		System.out.println("Products in " + warehouse.getName() + ":");
		
		for(Product product : warehouse.getInventory().keySet()) {
			System.out.println(product.getName() + " " + warehouse.getInventory().get(product));
		}
		
		System.out.println("");
		
		
	}
	
	public void printOrder(Order order) {
		
	}

}
