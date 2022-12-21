package api.pojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PetPojo {

    @JsonProperty
    private long id;
    @JsonProperty
    private Category category;
    @JsonProperty
    private String name;
    @JsonProperty
    private ArrayList<String> photoUrls;
    @JsonProperty
    private ArrayList<Tag> tags;
    @JsonProperty
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategoryId(int id) {
        this.category.id = id;
    }

    public void setCategoryName(String name) {
        this.category.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(ArrayList<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PetPojo(){
        this.category = new Category();
    }


}

class Category {
    public long id;
    public String name;

}

class Tag{
    public int id;
    public String name;
}
