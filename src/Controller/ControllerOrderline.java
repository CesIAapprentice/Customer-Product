package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.OrderLine;
import Model.Product;

public class ControllerOrderline {
	
	private List<OrderLine> orderlines;
	
// ---------------------------------------------------------
// CONSTRUCTOR		
	
	public ControllerOrderline() {
		this.orderlines = new ArrayList<OrderLine>();
	}
	
// ---------------------------------------------------------
// METHODS
	
	public boolean isProductInOrderline(OrderLine orderline, Product product) {
		return orderline.getOrderlist().containsKey(product); 
	}
	
	public Integer howManyProductsInOrderline(OrderLine orderline, Product product) {
		return orderline.getOrderlist().get(product);
	}
	
	public void addProductToOrderline(OrderLine orderline, Product product, Integer quantity) {
		if(!isProductInOrderline(orderline, product)){
			orderline.getOrderlist().put(product, quantity);
		} else {
			orderline.getOrderlist().replace(product, howManyProductsInOrderline(orderline, product) + quantity);
		}
	}
	
	public void removeProductFromOrderline(OrderLine orderline, Product product, Integer quantity) {
		orderline.getOrderlist().replace(product, howManyProductsInOrderline(orderline, product) - quantity);
	}
		
}