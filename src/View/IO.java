package View;

import java.util.Scanner;

import Controller.*;
import Model.Product;

public class IO {
	
	Scanner reader;
	ControllerCustomer controllercustomer;
	ControllerProduct controllerproduct;
	
//-------------------------------------------------------
// CONSTRUCTOR
	
	public IO(Scanner reader) {
		
		this.reader = reader;
		this.controllercustomer = new ControllerCustomer();
		initializeCustomer(this.controllercustomer);
		this.controllerproduct = new ControllerProduct();
	}
	
//-------------------------------------------------------
// METHODS
	
	public void initializeCustomer(ControllerCustomer controllercustomer) {
		controllercustomer.
	}
	
	
	
	public void printStore() {
		for(Product product : this.controllerproduct.getProducts()) {
			String quantity = String.valueOf(this.controllerproduct.getQuantity(product));
			System.out.println(product + " Availability: " + quantity);
		}
	}
	
	public void addToBasket() {
		System.out.print("Enter name for the good:");
		String productName = reader.nextLine();
		Product productToBuy = this.controllerproduct.getProductByName(productName);
		
	}

}
