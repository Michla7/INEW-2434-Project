package com.hcc.advweb;


import java.util.ArrayList;


public interface CustomerService {
	
	public void addCustomer(Customer Customer);
	
	public Customer getCustomer(int Id);
	
	public ArrayList<Customer> getCustomersList();
	
	public Customer updateCustomer(Customer Customer);
	
}
