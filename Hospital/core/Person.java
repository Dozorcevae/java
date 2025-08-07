//Person.java
package Hospital.core;

import static Hospital.util.generateId.nextId;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected final String id;


    public Person(String firstName, String lastName, String prefix) {
        this.firstName = firstName;
        this.lastName = lastName;   
        this.id = nextId(prefix);
    }

    public void setFirstName(String name){ this.firstName = name; }
    public void setLastName(String name){ this.lastName = name; }

    public String getId() { return this.id; }
    public String getFullName() { return firstName + " " + lastName; }

    public String toString() {
        return "{Name=" + getFullName() + ", ID=" + id + "}";
    }
}
