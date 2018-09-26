package View;

public class Menus {
	
	public void setCustomer() {
		System.out.println("PROFILE");
		System.out.println("");
		System.out.println("1. Login with name");
		System.out.println("2. Create a new user");
		System.out.println("3. Go to the Store");
		System.out.println("x. Quit");
		System.out.println("");
	}
	
	public void storeMenu() {
		System.out.println("STORE");
		System.out.println("");
		System.out.println("1. Print goods in the store");
		System.out.println("2. Buy some goods from the store");
		System.out.println("3. Go to payment");
		System.out.println("x. Quit");
		System.out.println("");
		System.out.print("your choice:");
	}
	
	public void buyMenu() {
		System.out.println("BASKET CASE");
		System.out.println("1. Enter a good to buy");
		System.out.println("2. Remove an Item from your basket");
		System.out.println("3. Print your basket");
		System.out.println("x. Quit");
		System.out.println("");
		System.out.print("your choice:");
	}
	
	public void payMenu() {
		System.out.println("PAYMENT");
		System.out.println("1. Enter a method of payment");
		System.out.println("2. Change a method of payment");
		System.out.println("3. Pay the bill");
		System.out.println("x. Quit");
		System.out.println("");
		System.out.print("your choice:");
	}
}