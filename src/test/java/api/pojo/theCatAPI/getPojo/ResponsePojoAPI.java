package api.pojo.theCatAPI.getPojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class ResponsePojoAPI {
    @JsonProperty("breeds")
    public ArrayList<Object> breeds;
    @JsonProperty("id")
    public String id;
    @JsonProperty("url")
    public String url;
    @JsonProperty("width")
    public int width;
    @JsonProperty("height")
    public int height;
    @JsonProperty("pending")
    public int pending;
    @JsonProperty("approved")
    public int approved;
    @JsonProperty("rejected")
    public int rejected;
    @JsonProperty("sub_id")
    public String sub_id;
    @JsonProperty("created_at")
    public Date created_at;
    @JsonProperty("original_filename")
    public String original_filename;
    @JsonProperty("breed_ids")
    public String breed_ids;

    public ResponsePojoAPI(){}

    public ResponsePojoAPI(ArrayList<Object> breeds, String id, String url, int width, int height, int pending, int approved, int rejected, String sub_id, Date created_at, String original_filename, String breed_ids) {
        this.breeds = breeds;
        this.id = id;
        this.url = url;
        this.width = width;
        this.height = height;
        this.pending = pending;
        this.approved = approved;
        this.rejected = rejected;
        this.sub_id = sub_id;
        this.created_at = created_at;
        this.original_filename = original_filename;
        this.breed_ids = breed_ids;
    }

    public ArrayList<Object> getBreeds() {
        return breeds;
    }

    public void setBreeds(ArrayList<Object> breeds) {
        this.breeds = breeds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

    public int getRejected() {
        return rejected;
    }

    public void setRejected(int rejected) {
        this.rejected = rejected;
    }

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getOriginal_filename() {
        return original_filename;
    }

    public void setOriginal_filename(String original_filename) {
        this.original_filename = original_filename;
    }

    public String getBreed_ids() {
        return breed_ids;
    }

    public void setBreed_ids(String breed_ids) {
        this.breed_ids = breed_ids;
    }

    @Override
    public String toString() {
        return "ResponsePojoAPI{" +
                "breeds=" + breeds +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", pending=" + pending +
                ", approved=" + approved +
                ", rejected=" + rejected +
                ", sub_id='" + sub_id + '\'' +
                ", created_at=" + created_at +
                ", original_filename='" + original_filename + '\'' +
                ", breed_ids='" + breed_ids + '\'' +
                '}';
    }
}
