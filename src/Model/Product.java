package Model;
/*
 * Order details, 
 * just to store items purchased
 * 
 * 
 * PARAMETERS
 * 
 * String ID		identifies the product
 * String name		name of the product
 * float price		price of the product
 * String remarks	????????????????????
 * 
 * 
 * HASHCODE & EQUALS
 * 
 * two products are the same product 
 * if they have the same ID
 * 
 */


public class Product {
	
	private Integer ID;
	private String name;
	private float price;
	private String remarks;
	
//--------------------------------------------------
// CONSTRUCTORS	

	public Product(Integer id, String name, float price, String remarks) {
		this.ID = id;
		this.name = name;
		this.price = price;
		this.remarks = remarks;
	}
	
//--------------------------------------------------
// HASHCODE & EQUALS	
	

	@Override
	public int hashCode() {
		if (this.ID!= null){
			return this.ID;
		}
		return -1;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (ID == -1) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	
	
	
//--------------------------------------------------
// GETTERS / SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}