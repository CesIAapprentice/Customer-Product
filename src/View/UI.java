package View;

import java.util.Scanner;

public class UI {
	
	IO io;
	Customer customer = new Customer();
	Menus menus = new Menus();
	Scanner reader;
	
//-------------------------------------------------------
// CONSTRUCTOR	
	
	public UI() {
		
		this.menus = new Menus();
		this.reader = new Scanner(System.in);
		this.io = new IO(this.reader);
	}

	public void start() {
		setCustomerMenu();
		storeMenu();
	}
	
	public void setCustomerMenu() {
		while(true) {
			
			this.menus.setCustomer();
			String userchoice=reader.nextLine();
			
			if(userchoice.equals("1")){
				this.io.login();
			}
		
			if(userchoice.equals("2")){
				this.io.createCustomer();
			}
		
			if(userchoice.equals("3")){
				break;
			}
			
			if(userchoice.equals("x")) {
				System.out.println("Bye");
				// and quit the program
			}
			else {
				System.out.println("Unknown Command");
			}
		}
	}
	
	public void storeMenu() {
		while (true) {
			this.menus.storeMenu();
			String userchoice=reader.nextLine();
			
			if(userchoice.equals("1")){
				this.io.printStore();
			}
			
			if(userchoice.equals("2")){
				while(this.io.isLoggedIn()) {
					System.out.println("Please, login first");
					this.io.login();
				}
				buyMenu();
			}
			
			if(userchoice.equals("3")){
				payMenu();
			}
			
			if(userchoice.equals("x")){
				System.out.println("Bye");
				// and quit the program
			}
			else {
				System.out.println("Unknown Command");
			}
		}
	}
	
	public void buyMenu() {
		while (true) {
			this.menus.buyMenu();
			String userchoice=reader.nextLine();
			
			if(userchoice.equals("1")){
				this.io.addToBasket();
			}
			
			if(userchoice.equals("2")){
				this.menus.buyMenu();
			}
			
			if(userchoice.equals("3")){
				this.menus.payMenu();
			}
			
			if(userchoice.equals("x")){
				break;
			}
			else {
				System.out.println("Unknown Command");
			}
		}
	}
}