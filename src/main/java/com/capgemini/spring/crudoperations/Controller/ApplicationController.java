package com.capgemini.spring.crudoperations.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.crudoperations.model.CustomerDetails;
import com.capgemini.spring.crudoperations.service.CustomerDetailsService;

//@RestController
//@RequestMapping("/Spring-crud-operation")
@Controller
public class ApplicationController {
	
	@Autowired
	CustomerDetailsService customerDetailsService;
	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("name", " welcome... !!");
        return "index";
    }
	
	
	
	@RequestMapping("/registration")  
    public String showform(Model m){  
    	m.addAttribute("command", new CustomerDetails());
    	return "registration"; }
	
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/register")
	public String registerCustomer(@ModelAttribute("customerDetails") CustomerDetails customerDetails )
	{
		customerDetailsService.registerCustomer(customerDetails );
		return "redirect:/viewuser";
	}

	@RequestMapping("/viewuser")  
    public String viewuser(Model m){  
        List<CustomerDetails> list=customerDetailsService.getAllUsers();  
        m.addAttribute("list",list);
        return "viewuser";  
    } 
	@RequestMapping(value="/edituser/{id}")  
    public String edit(@PathVariable Long id, Model m){  
		CustomerDetails userDetails = customerDetailsService.getUserById(id); 
        m.addAttribute("command",userDetails);
        return "usereditform";  
    }  
	/* It updates model object. */  
    @PutMapping("/editsave")  
    public String editsave(@ModelAttribute("customerDetails") CustomerDetails customerDetails){  
    	customerDetailsService.update(customerDetails);  
        return "redirect:/viewuser";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @GetMapping("/deleteuser/{id}")  
    public String delete(@PathVariable Long id){  
    	customerDetailsService.delete(id);  
        return "redirect:/viewuser";  
    }  
	
	
	
	
	@GetMapping("/login")
	public CustomerDetails loginCustomer(@RequestBody CustomerDetails customerDetails)
	{
		return customerDetailsService.loginCustomer(customerDetails);
		
	}
	
     
}
