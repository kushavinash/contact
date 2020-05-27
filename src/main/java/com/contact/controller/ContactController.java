package com.contact.controller;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.pojo.Contact_;
import com.contact.repo.ContactMysqlRepository;
//import com.contact.repo.ContactRepository;

@RestController
@RequestMapping(value="/api/v1")
public class ContactController {

	private static final Logger LOGGER=LoggerFactory.getLogger(ContactController.class);
	
	//@Autowired
	//ContactRepository repo ;
	@Autowired
	ContactMysqlRepository mysqlrepo;
	
	  @GetMapping("/contacts/{id}")
	 public Contact_ getContactById(@PathVariable("id") String id) {
		 
		  LOGGER.info("getContactById  call with paramater"+id);
		 return mysqlrepo.findById(Integer.parseInt(id))
                 .orElse(new Contact_());
	 }
	  
		
	  @DeleteMapping("/contacts/{id}")
	 public String deleteContactById(@PathVariable("id") String id) {
		 
		  LOGGER.info("getContactById  call with paramater"+id);
		  mysqlrepo.deleteById(Integer.parseInt(id));
		  
		  return "deleted contact id  "+id;
                 
	 }
	  
	  
	  @GetMapping("/contacts")
	 public List<Contact_> getAllContactBy() {	 
		 
		 List<Contact_> clist =  new ArrayList<Contact_>();
		 
		 mysqlrepo.findAll().forEach(clist::add);
		
				 
	  return 	clist ;
	 }
	  
	  @PostMapping("/contacts")
	  public Contact_ createContact(@RequestBody @Valid Contact_ contact) {	
		  
		  //aply validation on incoming data for 
		  //A customer or supplier can be a person or a company, but not both. Additionally, a company or person can be a supplier and a customer at the same time.
		 System.out.println("in save call ..."+contact); 
		  
		return   mysqlrepo.save(contact);
	  }
	  
	  
	  @PatchMapping("/contacts/{id}")
	  public Contact_  updateContact(@RequestBody @Valid Contact_ contact,@PathVariable("id") String id) {
		  
		  Contact_ cont = mysqlrepo.findById(Integer.parseInt(id)).orElse(new Contact_());
		  
		  contact.setId(cont.getId());
		  return   mysqlrepo.save(contact);  
		  
	  }

}
