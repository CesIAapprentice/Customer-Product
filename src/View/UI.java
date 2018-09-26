package View;

import java.util.Scanner;

public class UI {
	
	IO io;
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
		this.menus.setCustomer();
		String userchoice=reader.nextLine();
		
		if(userchoice.equals("1")){
			this.io.checkValidName(userchoice);
				
			}
		}
		
		if(userchoice.equals("2")){
			buyMenu();
		}
		
		if(userchoice.equals("x")){
			break;
		}
		else {
			System.out.println("Unknown Command");
		}
	}
	
	public void storeMenu(Customer customer) {
		while (true) {
			this.menus.storeMenu();
			String userchoice=reader.nextLine();
			
			if(userchoice.equals("1")){
				this.io.printStore();
			}
			
			if(userchoice.equals("2")){
				buyMenu();
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
	
	public void buyMenu(Customer customer) {
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