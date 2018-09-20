package Model;
/*
 * Order details, 
 * just to store items purchased
 * 
 * 
 * PARAMETERS
 * 
 * private Map<Product, Integer> orderlist		Which and how many of the items the order contains
 * 
 * 
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class OrderLine {
	
	private Map<Product, Integer> orderlist;
	
//--------------------------------------------------
// CONSTRUCTOR	

	public OrderLine() {
		this.orderlist = new HashMap<Product, Integer>();
	}
	
//--------------------------------------------------
// GETTERS / SETTERS

	public Map<Product, Integer> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(Map<Product, Integer> orderlist) {
		this.orderlist = orderlist;
	}
}