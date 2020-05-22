
package com.contact.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cname",
    "cadd"
})
public class Company {

    @JsonProperty("cname")
    private String cname;
    @JsonProperty("cadd")
    private String cadd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cname")
    public String getCname() {
        return cname;
    }

    @JsonProperty("cname")
    public void setCname(String cname) {
        this.cname = cname;
    }

    @JsonProperty("cadd")
    public String getCadd() {
        return cadd;
    }

    @JsonProperty("cadd")
    public void setCadd(String cadd) {
        this.cadd = cadd;
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
