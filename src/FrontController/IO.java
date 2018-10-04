package FrontController;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.*;
import Model.Customer.Customer;
import Model.Order.Order;
import Model.Order.OrderLine;
import Model.Product.Product;

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
	
	
	

	
	
	
	
	
// -------------------------------------------------------------------------------------------------
// GETTERS & SETTERS

	public String getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(String loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	
}