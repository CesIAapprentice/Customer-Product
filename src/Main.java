import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Controller.ControllerCustomer;
import Controller.ControllerOrder;
import Controller.ControllerOrderline;
import Controller.ControllerProduct;
import Model.Order;
import Model.PersonalCustomer;
import Model.Product;
import View.Report;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControllerOrder controllerOrder = new ControllerOrder();
		ControllerOrderline controllerOrderline = new ControllerOrderline();
		ControllerProduct controllerProduct = new ControllerProduct();
		ControllerCustomer controllerCustomer = new ControllerCustomer();
		
		Product tele = new Product(1,"Smart TV", 100.0f, "remarks");
		Product tablet = new Product(2,"Kindle", 50.0f, "remarks");
		
		controllerProduct.addNewProduct(tele, 10);
		controllerProduct.addNewProduct(tablet, 50);
		controllerProduct.addMoreUnits(tele, 5);
		
		controllerCustomer.addPersonalCustomer(new ArrayList<Order>(), "Ces", "deliveryAddress", "000000000",
				"creditCard");
		PersonalCustomer somebody = (PersonalCustomer)controllerCustomer.getPersons().get(0);
		
		somebody.getOrder().add(new Order(new Date(Calendar.getInstance().getTime().getTime()), false, "00"));
		
		controllerProduct.addProductToOrder(somebody.getOrder().get(0), tablet, 1);
		controllerProduct.addProductToOrder(somebody.getOrder().get(0), tele, 3);
		controllerProduct.addProductToOrder(somebody.getOrder().get(0), tele, 9);
	
		System.out.println("Items in order: " + somebody.getOrder().get(0).getOrderline().getOrderlist().keySet().size() + "\n");
		
		System.out.println(somebody.getOrder().get(0).getDateReceived() + "\n");
		
		float total = 0.0f;
		

		
		for(Product product : somebody.getOrder().get(0).getOrderline().getOrderlist().keySet()) {
			
			total +=  product.getPrice() * somebody.getOrder().get(0).getOrderline().getOrderlist().get(product);

			System.out.println(product.getName() + " (" + product.getPrice() + ") : " + 
								somebody.getOrder().get(0).getOrderline().getOrderlist().get(product) + 
								" = " + (product.getPrice() * somebody.getOrder().get(0).getOrderline().getOrderlist().get(product)));
		}
		
		
		System.out.println("\n" + "TOTAL: " + total);
		
	}
}