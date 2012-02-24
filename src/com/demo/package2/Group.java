/**
 * 
 */
package com.demo.package2;



import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.demo.package3.Person;

/**
 * @author abdul
 *
 */

@XmlType(propOrder = { "name", "members" }, name = "group")

//This statement means that class "Group.java" is the root-element of our example
@XmlRootElement
public class Group {
    private String name;
    private List<Person> members = new ArrayList<Person>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }
}