/**
 * 
 */
package com.demo.package1;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.demo.package2.Group;
import com.demo.package3.Person;

/**
 * Tutorial to demonstrate JAXB
 * 
 * @author abdul
 *
 */
public class Main {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
           
         File marshalFile = new File("marshal.xml");
  
         //Create group
         Group group = new Group();
         group.setName("VEHCILE");
         
         
         // create two Person Objetcs
         Person person1 = new Person();
         person1.setBuildDate(new Date("04-JAN-1988"));
         person1.setFirstName("HERO");
         person1.setLastName("HONDA");
         
         Person person2 = new Person();
         person2.setBuildDate(new Date("04-MAY-1988"));
         person2.setFirstName("MARUTI");
         person2.setLastName("SUZUKI");
         
         List<Person> members = new ArrayList<Person>();
         members.add(person1);
         members.add(person2);
                         
         group.setMembers(members);
 
         //Marshaller
         try {
            JAXBUtil.getMarshaller().marshal(group, marshalFile);
        } catch (JAXBException e) {
          
            e.printStackTrace();
        }
        
        
        Group group1 = new Group();
        try {
            // UnMarshaller
             group1 = (Group) JAXBUtil.getUnmarshaller().unmarshal(
                    marshalFile);
             System.out.println("Group1 \n" + "Name: " +  group1.getName()+
                     "\n" + "Members 1 " + "\n\t" + "FirstName : " + group1.getMembers().get(0).getFirstName() +
                     "\n\t" + "LastName : " + group1.getMembers().get(0).getLastName() +
                     "\n\t" + "BuildDate : " + group1.getMembers().get(0).getBuildDate() +
                     "\n" + "Members 2 " + "\n\t" + "FirstName : " + group1.getMembers().get(1).getFirstName() +
                     "\n\t" + "LastName : " + group1.getMembers().get(1).getLastName() +
                     "\n\t" + "BuildDate : " + group1.getMembers().get(1).getBuildDate());
        }catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        
    }

}
