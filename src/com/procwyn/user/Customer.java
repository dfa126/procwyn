package com.procwyn.user;

public class Customer {
	private String companyName = "";
	private String companyStreet = "";
	private String companyCity = "";
	
	
	public Customer(String aCompanyName, String aCompanyStree, String aCompanyCity) {
		this.companyName = aCompanyName;
	}
	
	public void setCompanyName(String aCompanyName) {
		this.companyCity = aCompanyName;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public static void main(String args[]) {
		Customer o_c = new Customer("Bla Gmbh", "Blubb", "Blabber");
		System.out.println(o_c.getCompanyName());
	}
	
}
