package View;

import java.util.List;
import java.util.Scanner;

import Controller.*;
import Model.Customer;
import Model.Order;
import Model.Product;

public class IO {
	
	private Scanner reader;
	private String loggedIn;
	private ControllerCustomer controllercustomer;
	private ControllerProduct controllerproduct;
	
//-------------------------------------------------------
// CONSTRUCTOR
	
	public IO(Scanner reader) {
		
		this.loggedIn = "";
		this.reader = reader;
		this.controllercustomer = new ControllerCustomer();
		this.controllerproduct = new ControllerProduct();
	}
	
//-------------------------------------------------------
// METHODS
	
	public void login() {
		String name = askCustomerName();
		Customer customer = this.controllercustomer.getCustomer(name);
		if(customer != null) {
			System.out.println("Welcome " + name);
			this.loggedIn = name;
		} else {
			System.out.println(name + " not found");
		}
	}
	
	public boolean isLoggedIn() {
		return !this.loggedIn.equals("");
	}
	
	public String askCustomerName() {
		System.out.print("Enter your name: ");
		return reader.nextLine();
	}
	
	public void createCustomer() {
		
		String type = reader.nextLine();
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		System.out.print("Enter delivery address: ");
		String address = reader.nextLine();
		System.out.println("Enter phone number: ");
		String phone = reader.nextLine();
		
		while(true) {
			System.out.print("Enter type of customer (personal/corporate): ");
			if(type.toLowerCase().equals("corporate")) {
				System.out.print("Enter contact: ");
				String contact = reader.nextLine();
				this.controllercustomer.addCorporateCustomer(name, address, phone, contact);
				break;
			} else if(type.toLowerCase().equals("personal")) {
				System.out.println("Enter creditCard: ");
				String creditCard = reader.nextLine();
				this.controllercustomer.addPersonalCustomer(name, address, phone, creditCard);
				break;
			} else {
				System.out.println("Not a suitable type of customer");
			}
		}
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
		Order lastOrder = getLastOrderFromCustomer(customerOrders);
		if(isOrderClosed(lastOrder)) {
			createOrder(customer);
		}
		
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
	
	
	
// -------------------------------------------------------------------------------------------------
// GETTERS & SETTERS

	public String getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(String loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	
}