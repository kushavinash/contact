
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
    "txnumber",
    "leadtime"
})
public class Supplier {

    @JsonProperty("txnumber")
    private String txnumber;
    @JsonProperty("leadtime")
    private String leadtime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("txnumber")
    public String getTxnumber() {
        return txnumber;
    }

    @JsonProperty("txnumber")
    public void setTxnumber(String txnumber) {
        this.txnumber = txnumber;
    }

    @JsonProperty("leadtime")
    public String getLeadtime() {
        return leadtime;
    }

    @JsonProperty("leadtime")
    public void setLeadtime(String leadtime) {
        this.leadtime = leadtime;
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
