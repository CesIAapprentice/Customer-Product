package Model;
/*
 * abstract class Customer
 * Generic customer, with parameters valid
 * for any type of customer
 * 
 * 
 * PARAMETERS
 * 
 * List<Order> order		List of orders
 * String name				Name of the Customer
 * String deliveryAddress	Address for deliveries
 * String phone				Phone number of the customer
 * char creditRating		How good or bad a customer is
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
	
	private List<Order> order;
	
	private String name;
	private String deliveryAddress;
	private String phone;
	
// ---------------------------------------------------------
// CONSTRUCTOR		
	
	public Customer(String name) {
		this.order = new ArrayList<Order>();
		this.name = name;
		this.deliveryAddress = "";
		this.phone = "000000000";
	}
	
//--------------------------------------------------
// GETTERS / SETTERS

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}