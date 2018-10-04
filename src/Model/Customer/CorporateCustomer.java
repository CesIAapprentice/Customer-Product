package Model.Customer;
/*
 * ###extends Customer###
 * A particular type of customer
 * who is able to get debt and 
 * be qualified with a creditRating
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
 * char creditRating		What and how to get debt from customer
 * String contact			??????????????????
 * Integer creditLimit		Credit limit for customer
 * 
 * 
 * METHODS
 * 
 * public String remind(String inquiry)		reminds customer his/her Data
 * 
 * 
 */

public class CorporateCustomer extends Customer{

	private String contact;
	private char creditRating;
	private Integer creditLimit;
	
// ---------------------------------------------------------
// CONSTRUCTOR	
		
	public CorporateCustomer(String name, String deliveryAddress, String phone, String contact) {
		super(name);
		super.setDeliveryAddress(deliveryAddress);
		super.setPhone(phone);
		this.contact = contact;
		this.creditRating = 'Z';
		this.creditLimit = 1000;
	}
	
// ---------------------------------------------------------
// METHODS	
		
	public String remind(String inquiry) {
		
		if(inquiry.equals("contact")) {
			return this.contact;
		}
		
		if(inquiry.equals("creditRating")) {
			return String.valueOf(this.creditRating);
		}
		
		if(inquiry.equals("creditLimit")){
			return String.valueOf(this.creditLimit);
		}
		
		return null;
	}

//--------------------------------------------------
// GETTERS / SETTERS

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}

	public char getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(char creditRating) {
		this.creditRating = creditRating;
	}
}