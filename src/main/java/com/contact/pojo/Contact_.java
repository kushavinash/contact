
package com.contact.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

public class Contact_ {
	
	

    @JsonProperty("id")
   
    @NotNull(message = "Id is compulsory")
    @NotBlank(message = "Id is compulsory")
    private Integer id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("person")
    private Person person;
    @JsonProperty("company")
    private Company company;
    @JsonProperty("phone")
    private Phone phone;
    @JsonProperty("customer")
    private List<Customer> customer = null;
    @JsonProperty("supplier")
    private List<Supplier> supplier = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
   
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("type")
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

    @JsonProperty("customer")
    public List<Customer> getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    @JsonProperty("supplier")
    public List<Supplier> getSupplier() {
        return supplier;
    }

    @JsonProperty("supplier")
    public void setSupplier(List<Supplier> supplier) {
        this.supplier = supplier;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
