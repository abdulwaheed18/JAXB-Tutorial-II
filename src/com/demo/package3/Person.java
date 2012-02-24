package com.demo.package3;



import java.util.Date;

import javax.xml.bind.annotation.XmlType;

//If you want you can define the order in which the fields are written...Optional
@XmlType(propOrder = { "lastName", "firstName", "buildDate" }, name = "person")
public class Person {
    private Date buildDate;
    private String firstName;
    private String lastName;

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}