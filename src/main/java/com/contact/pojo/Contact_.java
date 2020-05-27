
package com.contact.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//import org.springframework.data.annotation.Id;
//ssimport org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "person",
    "company",
    "phone",
    "customer",
    "supplier"
})
@Entity
public class Contact_ implements Serializable {
	
	   
   // @NotNull(message = "Id is compulsory")
   // @NotBlank(message = "Id is compulsory")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Integer id;
    @JsonProperty("type")
    @Column
    private String type;
    @JsonProperty("person")
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_person")
    private Person person;
    @JsonProperty("company")
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_company")
    private Company company ;
    @JsonProperty("phone")
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_phone")
    private Phone phone ;
    @JsonProperty("customer")
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_customer")
    private Customer customer  ;
    @JsonProperty("supplier")
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_supplier")
    private Supplier supplier ;
    

    @JsonProperty("id")
   
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("type")
    @Column
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

    @JsonProperty("phone")
    public Phone getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

	public Customer getCustomer() {
		return customer;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	
}
