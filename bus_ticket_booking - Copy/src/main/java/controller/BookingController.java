package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.BookingDao;
import dto.Customer;
import dto.Operator;

@Controller
public class BookingController {

	@Autowired
	Customer customer;
	
	@Autowired
	Operator operator;
	
	@Autowired
	BookingDao bookingDao;
	
//	Customer customer = new Customer();
//	Operator operator = new Operator();
//	BookingDao bookingDao = new BookingDao();
	
	@RequestMapping("/signupoperator")
	public ModelAndView createoperator(){
		System.out.println("entering the operator data");
		ModelAndView modelAndView = new ModelAndView("operator.jsp");
		modelAndView.addObject("operatorobj", operator);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/saveoperator")
	public String insertoperator(Operator odto){
		System.out.println("saving the operator data");
		bookingDao.insertOperator(odto);
		return "Operator data saved";
	}
	
	
	@RequestMapping("/entercustomer")
	public ModelAndView createcustomer(){
		System.out.println("entering the customer data");
		ModelAndView modelAndView = new ModelAndView("customer.jsp");
		modelAndView.addObject("customerobj", customer);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/savecustomer")
	public String insertcustomer(Customer cdto){
		System.out.println("saving the customer data");
		bookingDao.insertCustomer(cdto);
		return "Customer data saved";
	}
	
	@RequestMapping("/login")
	public ModelAndView operatorlogin(){
		System.out.println("Operator logging in");
		ModelAndView modelAndView = new ModelAndView("login.jsp");
		modelAndView.addObject("loginobj", operator);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/validation")
	public ModelAndView operatorvalidation(Operator operator){
		System.out.println("Operator data validating");
			Operator op= bookingDao.findbyid(operator.getOperator_id());
	        Boolean value= bookingDao.validation(op,operator);
	        if(value==true){
	        ModelAndView modelAndView = new ModelAndView("home.jsp");
			return modelAndView;
	        }else{
	        	ModelAndView modelAndView = new ModelAndView("invalid.jsp");
	        	return modelAndView;
	        }
	}

 
}
