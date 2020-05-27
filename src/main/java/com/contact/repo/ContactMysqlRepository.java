package com.contact.repo;

import org.springframework.data.repository.CrudRepository;

import com.contact.pojo.Contact_;

//@Repository
public interface ContactMysqlRepository extends CrudRepository<Contact_, Integer> {
    
	/*
	 * public List<Contact> findByItem(String item);
	 * 
	 * @Query("SELECT e FROM Expense e WHERE e.amount >= :amount") public
	 * List<Contact> listItemsWithPriceOver(@Param("amount") float amount);
	 */
}

