package com.hcc.advweb;

 

import java.util.ArrayList;



public interface CustomerDAO {

	public void addCustomer(Customer Customer);	
	public ArrayList<Customer> getCustomersList();	
	public Customer getCustomer(int Id);	
	public Customer updateCustomer(Customer Customer);

}
