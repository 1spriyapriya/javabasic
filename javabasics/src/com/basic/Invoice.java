package com.basic;

public class Invoice {
	String partnumber;
	String partdescription;
	int quantity;
	double price;
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public String getPartdescription() {
		return partdescription;
	}
	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
		this.quantity = 0;
		}
		this.quantity=quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0)
		{
		this.price = 0;
		}
		this.price=price;
	}
	public double getInvoiceAmount()
	{
		return quantity*price;
	}
		double InvoiceAmount=quantity*price;
		
	
	public static void main(String []args)
	{
		Invoice invoice=new Invoice();
		invoice.setPartnumber("5");
		invoice.setQuantity(3);
		invoice.setPartdescription("bolt");
		System.out.println(invoice.getPartnumber());
		
		System.out.println(invoice.getQuantity());
		System.out.println(invoice.getPartdescription());
		
		
	}
	
	
	
	
	

}
