package com.javarush.task.task33.task3309;

/*
Комментарий внутри xml
*/

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws JAXBException {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(obj, writer);
        return writer
                .toString()
                .replaceAll("<" + tagName + ".?>",
                        "<!--" + comment + "-->\n" + "<" + tagName + ">");
    }

    public static void main(String[] args) {

    }
}