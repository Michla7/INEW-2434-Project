package com.hcc.advweb;
 
 

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 



@Controller
@RequestMapping("/")
public class SpringTestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String viewHome(ModelMap model) {
	    model.addAttribute("greetings", "@index");
	    return "home";
	}
	
	@RequestMapping(value = "/store", method = RequestMethod.GET)
	public String viewStore(ModelMap model) {
		System.out.println("-----------Came inside my controller ----------");
	    model.addAttribute("bookName", "enter the bookname");
	    return "store";
	}	


}
