package api.pojo.JSONPlaceHolder.GetPojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Geo {
    @JsonProperty("lat")
    public String lat;
    @JsonProperty("lng")
    public String lng;

    public Geo(){}

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
