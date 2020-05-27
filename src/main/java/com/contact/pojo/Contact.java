/*
 * package com.contact.pojo;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * import org.springframework.boot.autoconfigure.domain.EntityScan; //import
 * org.springframework.data.annotation.Id; //import
 * org.springframework.data.mongodb.core.mapping.Document;
 * 
 * import com.fasterxml.jackson.annotation.JsonAnyGetter; import
 * com.fasterxml.jackson.annotation.JsonAnySetter; import
 * com.fasterxml.jackson.annotation.JsonIgnore; import
 * com.fasterxml.jackson.annotation.JsonInclude; import
 * com.fasterxml.jackson.annotation.JsonProperty; import
 * com.fasterxml.jackson.annotation.JsonPropertyOrder; import
 * javax.persistence.Id;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.OneToOne; import
 * javax.persistence.Table; import java.io.Serializable;
 * 
 * @JsonInclude(JsonInclude.Include.NON_NULL)
 * 
 * @JsonPropertyOrder({ "contact" }) //@Document(collection="contact")
 * 
 * @Entity public class Contact implements Serializable{
 * 
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO)
 * 
 * @Column(name="id") private Integer id;
 * 
 * @JsonProperty("contact")
 * 
 * @OneToOne
 * 
 * @JoinColumn(name="contact_contactchild") private Contact_ contact= new
 * Contact_();
 * 
 * 
 * @JsonIgnore private Map<String, Object> additionalProperties = new
 * HashMap<String, Object>();
 * 
 * @JsonProperty("contact") public Contact_ getContact() { return contact; }
 * 
 * @JsonProperty("contact") public void setContact(Contact_ contact) {
 * this.contact = contact; }
 * 
 * public Integer getId() { return id; }
 * 
 * public void setId(Integer id) { this.id = id; }
 * 
 * }
 */