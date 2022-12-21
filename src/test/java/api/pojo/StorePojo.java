package api.pojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class StorePojo {
    @JsonProperty
    public int id;
    @JsonProperty
    public int petId;
    @JsonProperty
    public int quantity;
    @JsonProperty
    public String shipDate; // Date
    @JsonProperty
    public String status;
    @JsonProperty
    public boolean complete;

}
