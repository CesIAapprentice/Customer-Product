package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.CorporateCustomer;
import Model.Customer;
import Model.Order;
import Model.PersonalCustomer;

public class ControllerCustomer {
	
	List<Customer> persons;

	public ControllerCustomer() {
		this.persons = new ArrayList<Customer>();
	}
	
//-------------------------------------------------------
// METHODS	
	
	public void addPersonalCustomer(List<Order> order, String name, String deliveryAddress, String phone,
			String creditCard) {
		persons.add(new PersonalCustomer(order, name, deliveryAddress, phone, creditCard));
	}
	
	public void addCorporateCustomer(List<Order> order, String name, String deliveryAddress, String phone, char creditRating,
			String contact, Integer creditLimit) {
		persons.add(new CorporateCustomer(order, name, deliveryAddress, phone, creditRating, contact, creditLimit));
	}
	
//-------------------------------------------------------
// METHODS	

	public List<Customer> getPersons() {
		return persons;
	}

	public void setPersons(List<Customer> persons) {
		this.persons = persons;
	}
	
	
	
	

	
	
	
	

}
