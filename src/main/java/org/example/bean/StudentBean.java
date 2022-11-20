package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

public class StudentBean {
    private CollegeBean college;    private String name;
    private String lastname;
    private List<String> address;
    private Map<String,Integer> marks;

    public StudentBean() {
    }

    public StudentBean(CollegeBean college, String name, String lastname, List<String> address, Map<String,Integer> marks) {
        this.college = college;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.marks = marks;
    }

    public void setCollege(CollegeBean college) {
        this.college = college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "college=" + college +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                ", languagedesc=" + marks +
                '}';
    }

    //here annotation of spring bean life cycle is a part of j2ee so its remove from java 11 so we have to add dependency of annotation api
    @PostConstruct
    public void init()
    {
        System.out.println("This is StudentBean lifecycle init method");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("This is StudentBean lifecycle destroy method");
    }



}
