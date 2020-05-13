package com.hcc.advweb;
 

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
//	@RequestMapping(value="/store",method=RequestMethod.GET)
//	public ModelAndView gotoStore(ModelAndView modelView) {
//		Customer customer = new Customer();
//	
//		modelView.addObject("Customer",customer);
//		modelView.setViewName("store");
//		return modelView;
//	}
	
//	@RequestMapping(value="/Customerslist", method= RequestMethod.GET)
//	public ModelAndView getCustomersList(ModelAndView model) {
//		ArrayList<Customer> CustomersList = CustomerService.getCustomersList();
//		model.addObject("CustomersList",CustomersList);
//		model.setViewName("Customerslist");
//		return model;
//	}
	
	@RequestMapping(value="/customerslist", method= RequestMethod.GET)
	public ModelAndView getCustomersList(ModelAndView model) {
		System.out.println("-----------Now inside my Cust controller for picking up customers list ----------");
		ArrayList<Customer> customersList = customerService.getCustomersList();
		model.addObject("customerslist", customersList);
		model.setViewName("customerslist");
		return model;
	}


	@RequestMapping(value="/newcustomer",method=RequestMethod.GET)
	public ModelAndView newCustomer(ModelAndView modelView) {
		Customer Customer = new Customer();
		modelView.addObject("Customer",Customer);
		modelView.setViewName("addnewcustomer");
		return modelView;
	}
	
	@RequestMapping(value="/addCustomer", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addSpringCustomer(@ModelAttribute Customer Customer) {
		System.out.println("----------");
	
		int i = 0;
		ArrayList<Customer> cs = customerService.getCustomersList();
		for(Customer c: cs) {
			if(c.getId() == i) 
				i++;
			else
				break;
		}
		
		Customer.setId(i);
		
		if (Customer.getId() == 0) {
			customerService.addCustomer(Customer);
			System.out.println("----NEW CUSTOMER ADDED!------");
		} else {
			customerService.addCustomer(Customer);			
			System.out.println("----NEW CUSTOMER ADDED! ID NOT 0------");
		}
		Customer customer = customerService.getCustomer(i);

		return new ModelAndView("confirmation","customer",customer);
	}
	
	
}
