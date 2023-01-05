package api.pojo.dummyRestAPI.PostPojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsePojo {
    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public Data data;
    @JsonProperty("message")
    public String message;

    public ResponsePojo(String status, Data data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public ResponsePojo(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
