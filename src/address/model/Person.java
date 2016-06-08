package address.model;

/**
 * Created by Bobbie on 6/7/2016.
 */

import address.util.LocalDateAdapter;
import javafx.beans.property.*;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 * Model class for a Person.
 *
 * Use StringProperty when the variable is going to be observed by others.
 * You also can observe it by attaching a listener. You can use this variable in bindings
 * with other observable objects of JavaFX. In some circumstances it is mandatory to use
 * JavaFX Property, like Person list rendered with tableView which is editable.
 * To reflect the changes immediately in edited cell, the underlying bound field should be a property.
 */
public class Person {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final StringProperty city;
    private final StringProperty state;
    private final IntegerProperty postalCode;
    private final StringProperty email;
    private final ObjectProperty<LocalDate> birthday;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null);
//        this(null, null, null, null, null, null, null);
    }

    /**
     * Constructor with some initial data.
     *
     * @param firstName
     * @param lastName
     */
    //public Person(String firstName, String lastName, String street, String city, String state, String email, Integer postalCode) {
    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
//        this.street = new SimpleStringProperty(street);
//        this.city = new SimpleStringProperty(city);
//        this.state = new SimpleStringProperty(state);
//        this.postalCode = new SimpleIntegerProperty(postalCode);
//        this.email = new SimpleStringProperty(email);

        // Some initial dummy data, just for convenient testing.
        this.street = new SimpleStringProperty("Street");
        this.city = new SimpleStringProperty("City");
        this.state = new SimpleStringProperty("State");
        this.postalCode = new SimpleIntegerProperty(12345);
        this.email = new SimpleStringProperty("Email");
        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1900, 1, 1));
    }

    /**
     * Getters and setters for fields.
     * @return
     */
    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }

    public String getState() {
        return state.get();
    }

    public void setState(String state) {
        this.state.set(state);
    }

    public StringProperty stateProperty() {
        return state;
    }

    public int getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(int postalCode) {
        this.postalCode.set(postalCode);
    }

    public IntegerProperty postalCodeProperty() {
        return postalCode;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}
