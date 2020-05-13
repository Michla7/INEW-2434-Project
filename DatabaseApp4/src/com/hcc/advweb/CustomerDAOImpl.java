package com.hcc.advweb;
 

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	ArrayList<Customer> CustomersList;
	
	public CustomerDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCustomer(Customer Customer) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(Customer);		
	}

	@Override
	public ArrayList<Customer> getCustomersList() {
	  CustomersList = 
				(ArrayList<Customer>)sessionFactory.
				getCurrentSession().createQuery("FROM Customer").
				list();
		return CustomersList;
	}

	@Override
	public Customer getCustomer(int Id) {
		Customer Customer = (Customer)sessionFactory.getCurrentSession().get(Customer.class, Id);
		return Customer;
	}

	@Override
	public Customer updateCustomer(Customer Customer) {
		
		return null;
	}

}
