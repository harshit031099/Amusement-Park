//package org.snowpark.controller;
//
//import org.snowpark.model.Customer;
//import org.snowpark.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
//@Controller
//@RequestMapping("/customer")
//public class CustomerController {
//	
//	@Autowired
//	private CustomerService customerService;
//	
//	@GetMapping("/addcustomer")
//	public String addCustomer(Model model) {
//		
//		Customer customer = new Customer();
//		model.addAttribute("customer", customer);
//		return "customer/addcustomer";	
//	}
//	
//	@PostMapping("/addcustomer")
//	public String addCustomerProcess(@ModelAttribute("customer") Customer customer) {
//		System.out.println("=====================================================");
//		System.out.println(customer);
//		System.out.println("=====================================================");
//		customerService.addCustomer(customer);
//		return "customer/addcustomersuccess";
//	}
//
//}
