package api.pojo.DummyRestAPI;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DummyRestAPIPojo {
    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public ArrayList<Datum> data;
    @JsonProperty("message")
    public String message;

    public DummyRestAPIPojo(){}

    public DummyRestAPIPojo(String status, ArrayList<Datum> data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DummyRestAPIPojo{" +
                "status='" + status + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
