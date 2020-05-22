package com.contact.controller;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.pojo.Contact;
import com.contact.repo.ContactRepository;

@RestController
@RequestMapping(value="/api/v1")
public class ContactController {

	private static final Logger LOGGER=LoggerFactory.getLogger(ContactController.class);
	
	@Autowired
	ContactRepository repo ;
	
	
	  @GetMapping("/contacts/{id}")
	 public Contact getContactById(@PathVariable("id") String id) {
		 
		  LOGGER.info("getContactById  call with paramater"+id);
		 return repo.findById(id)
                 .orElse(new Contact());
	 }
	  
		
	  @DeleteMapping("/contacts/{id}")
	 public String deleteContactById(@PathVariable("id") String id) {
		 
		  LOGGER.info("getContactById  call with paramater"+id);
		  repo.deleteById(id);
		  
		  return "deleted contact id  "+id;
                 
	 }
	  
	  
	  @GetMapping("/contacts")
	 public List<Contact> getAllContactBy() {	 
		 
		 List<Contact> clist =  new ArrayList<Contact>();
		 
		repo.findAll().forEach(clist::add);
		
				 
	  return 	clist ;
	 }
	  
	  @PostMapping("/contacts")
	  public Contact createContact(@RequestBody Contact contact) {	
		  
		  //aply validation on incoming data for 
		  //A customer or supplier can be a person or a company, but not both. Additionally, a company or person can be a supplier and a customer at the same time.
		  
		  contact.set_id(contact.getContact().getId()+"");
		return   repo.save(contact);
	  }

}
