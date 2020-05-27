
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

@Entity
public class Company {

    @JsonProperty("cname")
    @Column
    private String cname;
    @JsonProperty("id")
    @Column
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    
    
    private String regno ;
    
  //  @JsonIgnore
   // private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cname")
    public String getCname() {
        return cname;
    }
    
    

    @JsonProperty("cname")
    public void setCname(String cname) {
        this.cname = cname;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getRegno() {
		return regno;
	}



	public void setRegno(String regno) {
		this.regno = regno;
	}

 
	/*
	 * @JsonAnyGetter public Map<String, Object> getAdditionalProperties() { return
	 * this.additionalProperties; }
	 * 
	 * @JsonAnySetter public void setAdditionalProperty(String name, Object value) {
	 * this.additionalProperties.put(name, value); }
	 */
}
