package com.demo.package1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.demo.package2.Group;
import com.demo.package3.Person;

/**
 * This is utility class used to do all JAXB serialization to/from disk. 
 * It also requires that all configuration classes are located in this
 * dir. And it also requires that all JAXB serializeable classes are included
 * into jaxb.index.
 * 
 * @author abdul
 * 
 */
public class JAXBUtil {

    private static JAXBContext context;

    private static Marshaller marshaller;
    private static Unmarshaller unmarshaller;

    private static JAXBContext getContext() throws JAXBException {
        if (context == null) {
            //JAXBContext instance is created for handling classes 
            context = JAXBContext.newInstance(Group.class.getPackage()
                    .getName() + ":" + Person.class.getPackage().getName());
        }
        return context;

    }

    public static Marshaller getMarshaller() throws JAXBException {
        if (marshaller == null) {
            marshaller = getContext().createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        }
        return marshaller;
    }

    public static Unmarshaller getUnmarshaller() throws JAXBException {
        if (unmarshaller == null) {
            unmarshaller = getContext().createUnmarshaller();
        }
        return unmarshaller;

    }
}