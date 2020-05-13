package com.hcc.advweb;
 

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO CustomerDAO;
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addCustomer(Customer Customer) {
		CustomerDAO.addCustomer(Customer);		
	}

	@Override
	@Transactional
	public ArrayList<Customer> getCustomersList() {
		return CustomerDAO.getCustomersList();
	}

	@Override
	@Transactional
	public Customer getCustomer(int Id) {
		return CustomerDAO.getCustomer(Id);
	}

	@Override
	@Transactional
	public Customer updateCustomer(Customer Customer) {
		return CustomerDAO.updateCustomer(Customer);
	}
	
	

}
