package com.hcc.advweb;

 
import java.util.ArrayList;

public class CustomersList {

	private static ArrayList<Customer> _CustomersList;
	
	public static ArrayList<Customer> getCustomersList() {
		if ((_CustomersList == null) || (_CustomersList.size() == 0)) {
			_CustomersList = new ArrayList<Customer>();
			_CustomersList.add(new Customer(1,"Raj","Joseph"));
			_CustomersList.add(new Customer(2,"Jose","Gonzales"));
			_CustomersList.add(new Customer(3,"Bob","Smith"));
			_CustomersList.add(new Customer(4,"Adrian","Shah"));
			_CustomersList.add(new Customer(5,"Kelly","Branco"));
		}
		System.out.println("Customer List ---->"+_CustomersList);
		return _CustomersList;
	}
	public static void setCustomersList(ArrayList<Customer> CustomersList) {
		_CustomersList = CustomersList;
	}

	public static ArrayList<Customer> addCustomer(Customer Customer) {
		getCustomersList().add(Customer);
		return _CustomersList;
	}
	

}
