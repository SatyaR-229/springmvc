package org.example.bean;

import org.springframework.stereotype.Component;


public class CollegeBean {
    private String collegeName;
    private String standard;
    private int rollNo;
    private String course;

    public CollegeBean() {
    }

    public CollegeBean(String collegeName, String standard, int rollNo, String course) {

        this.collegeName = collegeName;
        this.standard = standard;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void init()
    {
        System.out.println("This is initialization method of CollegeBean");
    }

    public void destroy()
    {
        System.out.println("This is a collegebean Destroy method");
    }

    @Override
    public String toString() {
        return "CollegeBean{" +
                "collegeName='" + collegeName + '\'' +
                ", standard='" + standard + '\'' +
                ", rollNo=" + rollNo +
                ", course='" + course + '\'' +
                '}';
    }
}
