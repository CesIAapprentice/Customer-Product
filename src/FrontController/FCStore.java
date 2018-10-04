package FrontController;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Model.Customer.Customer;
import Model.Order.Order;
import Model.Order.OrderLine;
import Model.Product.Product;

public class FCStore {
	
	private String loggedIn;
	Scanner reader;
	
	
	
	public FCStore(Scanner reader) {
		this.reader = new Scanner(System.in);
		this.loggedIn = "";
	}
	
	public void printStore() {
		for(Product product : this.controllerproduct.getProducts()) {
			String quantity = String.valueOf(this.controllerproduct.getQuantity(product));
			System.out.println(product + " Availability: " + quantity);
		}
	}

	public void addToBasket() {
		System.out.print("Enter name for the good:");
		String productName = reader.nextLine();
		Product product = getProductByName(productName);
		Customer customer = getCustomerByName(this.loggedIn);
		List<Order> customerOrders = getOrderlistFromCustomer(customer);
		Order isLastOrderClosed = getLastOrderFromCustomer(customerOrders);
		if(isOrderClosed(isLastOrderClosed)) {
			createOrder(customer);
		}
		Order lastOrder = getLastOrderFromCustomer(customerOrders);
		OrderLine orderline = lastOrder.getOrderline();
		Map<Product, Integer> orderlist = orderline.getOrderlist();
		orderlist.put(product, 1);
	}
	
	public Product getProductByName(String name) {
		return this.controllerproduct.getProductByName(name.toLowerCase());
	}
	
	public Customer getCustomerByName(String name) {
		return this.controllercustomer.getCustomer(this.loggedIn);
	}
	
	public List<Order> getOrderlistFromCustomer(Customer customer) {
		return customer.getOrder();
	}
	
	public Order getLastOrderFromCustomer(List<Order> orderlist) {
		return orderlist.get(orderlist.size()-1);
	}
	
	public boolean isOrderClosed (Order order) {
		return order.isClosed();
	}
	
	public void createOrder(Customer customer) {
		this.controllercustomer.createNewOrder (customer);
	}

}
