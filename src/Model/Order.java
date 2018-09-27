package Model;
/*
 * Generic class for orders
 * where to store general data
 * from orders, and linked to
 * the list of items for the order
 * 
 * 
 * PARAMETERS
 * 
 * Date dateReceived		Date the order was made
 * boolean isPrepaid		Whether or not the user paid the order
 * String num				Order number
 * Float Price				TOTAL amount for the order
 * 
 * 
 * 
 * AGGREGATION
 * 
 * Orderline orderline		an orderline to store items and quantities
 * 
 * 
 * 
 * METHODS
 * 
 * public boolean dispatch()
 * public boolean close()
 * 
 * 
 * 
 * 
 */


import java.sql.Date;
import java.util.Calendar;

public class Order {
	
	private OrderLine orderline;
	
	private Date dateReceived;
	private boolean isPrepaid;
	private boolean isClosed;
	private String num;
	private float price;
	
// ---------------------------------------------------------
// CONSTRUCTOR
	
	public Order(boolean isPrepaid, String num) {
		this.orderline = new OrderLine();
		this.dateReceived = new Date(Calendar.getInstance().getTime().getTime());
		this.isPrepaid = isPrepaid;
		this.isClosed = false;
		this.num = num;
		this.price = 0.0f;
	}
	
	public Order(Date dateReceived, boolean isPrepaid, String num) {
		this.orderline = new OrderLine();
		this.dateReceived = dateReceived;
		this.isPrepaid = isPrepaid;
		this.isClosed = false;
		this.num = num;
		this.price = 0.0f;
	}
	
// ---------------------------------------------------------
// METHODS
	
	public boolean dispatch() {
		return false;
	}
	
	public boolean close() {
		return false;
	}

//--------------------------------------------------
// GETTERS / SETTERS	

	public OrderLine getOrderline() {
		return orderline;
	}

	public void setOrderline(OrderLine orderline) {
		this.orderline = orderline;
	}

	public Date getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public boolean isPrepaid() {
		return isPrepaid;
	}

	public void setPrepaid(boolean isPrepaid) {
		this.isPrepaid = isPrepaid;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}