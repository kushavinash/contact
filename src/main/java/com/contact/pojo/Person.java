
package com.contact.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fname",
    "lname",
    "id"
})
@Entity
public class Person implements Serializable {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Integer id;



	@JsonProperty("fname")
    @Pattern(regexp = "[a-z-A-Z]*", message = "First name has invalid characters")
    @Column
    private String fname;
    @JsonProperty("lname")
    @Pattern(regexp = "[a-z-A-Z]*", message = "Last name has invalid characters")
    @Column
    private String lname;
    
	/*
	 * @JsonIgnore private Map<String, Object> additionalProperties = new
	 * HashMap<String, Object>();
	 */

    @JsonProperty("fname")
    public String getFname() {
        return fname;
    }

    @JsonProperty("fname")
    public void setFname(String fname) {
        this.fname = fname;
    }

    @JsonProperty("lname")
    public String getLname() {
        return lname;
    }

    @JsonProperty("lname")
    public void setLname(String lname) {
        this.lname = lname;
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
