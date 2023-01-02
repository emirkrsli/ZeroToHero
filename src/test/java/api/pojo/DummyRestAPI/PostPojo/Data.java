package api.pojo.DummyRestAPI.PostPojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    @JsonProperty("name")
    public String name;
    @JsonProperty("salary")
    public String salary;
    @JsonProperty("age")
    public String age;
    @JsonProperty("id")
    public int id;

    public Data(){}

    public Data(String name, String salary, String age, int id) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
