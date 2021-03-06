
package com.contact.pojo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cnumber",
    "orderdate"
})
@Entity
public class Customer {
	
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Integer id;

    @JsonProperty("cnumber")
    private Integer cnumber;
    @JsonProperty("orderdate")
    private String orderdate;
    
	/*
	 * @JsonIgnore private Map<String, Object> additionalProperties = new
	 * HashMap<String, Object>();
	 */

    @JsonProperty("cnumber")
    public Integer getCnumber() {
        return cnumber;
    }

    @JsonProperty("cnumber")
    public void setCnumber(Integer cnumber) {
        this.cnumber = cnumber;
    }

    @JsonProperty("orderdate")
    public String getOrderdate() {
        return orderdate;
    }

    @JsonProperty("orderdate")
    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }
	/*
	 * @JsonAnyGetter public Map<String, Object> getAdditionalProperties() { return
	 * this.additionalProperties; }
	 * 
	 * @JsonAnySetter public void setAdditionalProperty(String name, Object value) {
	 * this.additionalProperties.put(name, value); }
	 */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
