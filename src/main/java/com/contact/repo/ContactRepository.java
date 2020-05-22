package com.contact.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.contact.pojo.Contact;


@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
	
	  @Query(value="{ 'fname' : ?0 }",fields="{ 'fname' : 1, 'lname' : 1}")
	  List<Contact> findByTheContactByFirstname(String firstname);	
	
}

