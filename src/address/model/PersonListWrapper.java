package address.model;

/**
 * Created by Bobbie on 6/7/2016.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Helper class to wrap a list of persons. This is used for saving the list of persons to XML.
 * Our data that we want to save resides in the personData variable inside our MainApp class.
 * JAXB requires the top most class to be annotated with @XmlRootElement. personData is of
 * class ObservableList and we can't put any annotations to ObservableList.
 * So we need to create another class that is only used to hold our list of Persons for saving to XML.
 */
@XmlRootElement(name = "persons")
public class PersonListWrapper {

    private List<Person> persons;

    @XmlElement(name = "person")
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
