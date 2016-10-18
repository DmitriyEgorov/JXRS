package ru.mydesignstio.jaxrs.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by ABarmin on 25.02.2016.
 */
@XmlRootElement(name = "person")
public class Person {
    private String name;
    private String id;
    private List<Integer> listOfNumber;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public List<Integer> getListOfNumber() {
        return listOfNumber;
    }

    public void setListOfNumber(List<Integer> listOfNumber) {
        this.listOfNumber = listOfNumber;
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
