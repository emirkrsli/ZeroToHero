package api.pojo.dummyRestAPI.PostPojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class RequestPojo {
    @JsonProperty("name")
    public String name;
    @JsonProperty("salary")
    public String salary;
    @JsonProperty("age")
    public String age;

    public RequestPojo(String name, String salary, String age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public RequestPojo() {
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

    @Override
    public String toString() {
        return "RequestPojo{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
