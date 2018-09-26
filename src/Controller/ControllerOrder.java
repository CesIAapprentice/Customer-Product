package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Customer;
import Model.Order;

public class ControllerOrder {
	
	private List<Order> orderlist;
	
// ---------------------------------------------------------
// CONSTRUCTOR		

	public ControllerOrder() {
		this.orderlist = new ArrayList<Order>();
	}
	
// ---------------------------------------------------------
// METHODS	

	public void createOrder(Customer customer, Boolean isPrepaid, String numberOfOrder) {
		this.orderlist.add(new Order(false, howManyOrdersStr() +1));
	}
	
	public Integer howManyOrdersInt() {
		return this.orderlist.size();
	}
	
	public String howManyOrdersStr() {
		return String.valueOf(this.orderlist.size());
	}
}