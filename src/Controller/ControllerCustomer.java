package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.CorporateCustomer;
import Model.Customer;
import Model.PersonalCustomer;

public class ControllerCustomer {
	
	List<Customer> customers;

	public ControllerCustomer() {
		this.customers = new ArrayList<Customer>();
	}
	
//-------------------------------------------------------
// METHODS	
	
	public void addPersonalCustomer(String name, String deliveryAddress, String phone, String creditCard) {
		customers.add(new PersonalCustomer(name, deliveryAddress, phone, creditCard));
	}
	
	public void addCorporateCustomer(String name, String deliveryAddress, String phone, String contact) {	
		customers.add(new CorporateCustomer(name, deliveryAddress, phone, contact));
	}
	
	
//-------------------------------------------------------
// GETTERS & SETTERS	

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public Customer getCustomer(String name) {
		for(Customer customer : this.customers) {
			if(customer.getName().equals(name)){
				return customer;
			}
		}
		return null;
	}
	
	
	
	
	

	
	
	
	

}
