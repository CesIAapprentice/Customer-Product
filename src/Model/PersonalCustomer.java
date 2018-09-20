package Model;
/*
 * ###extends Customer###
 * A particular type of customer
 * who don't belong to any enterprise
 * and thus he/she can't get any debt
 * 
 * 
 * PARAMETERS
 * 
 * SUPER
 * List<Order> order		List of orders
 * String name				Name of the Customer
 * String deliveryAddress	Address for deliveries
 * String phone				Phone number of the Customer
 * 
 * LOCAL
 * char creditCard			Credit Card data. Personal Customers don't get any debt
 * 
 * 
 */


import java.util.List;

public class PersonalCustomer extends Customer{
	
	private String creditCard;
	
// ---------------------------------------------------------
// CONSTRUCTOR		

	public PersonalCustomer(List<Order> order, String name, String deliveryAddress, String phone,
							String creditCard) {
		super(order, name, deliveryAddress, phone);
		this.creditCard = creditCard;
	}
	
//--------------------------------------------------
// GETTERS / SETTERS

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
}