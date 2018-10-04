package FrontController;

import Model.Customer.Customer;

public class FCAccount {
	
	public void login() {
		String name = askCustomerName();
		Customer customer = this.controllercustomer.getCustomer(name);
		if(customer != null) {
			System.out.println("Welcome " + name);
			this.loggedIn = name;
		} else {
			System.out.println(name + " not found");
		}
	}
	
	public boolean isLoggedIn() {
		return !this.loggedIn.equals("");
	}
	
	public String askCustomerName() {
		System.out.print("Enter your name: ");
		return reader.nextLine();
	}
	
	public void createCustomer() {
		
		String type = reader.nextLine();
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		System.out.print("Enter delivery address: ");
		String address = reader.nextLine();
		System.out.println("Enter phone number: ");
		String phone = reader.nextLine();
		
		while(true) {
			System.out.print("Enter type of customer (personal/corporate): ");
			if(type.toLowerCase().equals("corporate")) {
				System.out.print("Enter contact: ");
				String contact = reader.nextLine();
				this.controllercustomer.addCorporateCustomer(name, address, phone, contact);
				break;
			} else if(type.toLowerCase().equals("personal")) {
				System.out.println("Enter creditCard: ");
				String creditCard = reader.nextLine();
				this.controllercustomer.addPersonalCustomer(name, address, phone, creditCard);
				break;
			} else {
				System.out.println("Not a suitable type of customer");
			}
		}
	}

}
