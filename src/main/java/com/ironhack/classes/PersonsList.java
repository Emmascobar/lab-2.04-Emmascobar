package com.ironhack.classes;
import javax.naming.InvalidNameException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class PersonsList {



    public List<Person> person;


    public PersonsList(List<Person> persons) {
        this.person = persons;
    }

    public List<Person> getPersons() {
        return person;
    }

    public void setPersons(List<Person> persons) {
        this.person = persons;
    }

    //EJERCICIO 2:
    public Person findByName(String name) {
        Person result = null;
        for (int i = 0; i < person.size(); i++) {
            String[] pname = person.get(i).getName().split(" ", 2);
            if (pname.length > 1 && name.equals(person.get(i).getName())) {
                result = (Person) person;
            } else {
                throw new IllegalArgumentException("Invalid format of name, make sure are -firstname lastname-");
            }
        }
        return result;
    }

    public boolean findByNameBoolean(String name) {
        boolean result2 = false;
        for (int i = 0; i < person.size(); i++) {
            if (name.equals(person.get(i).getName())) {
                result2 = true;
            } else {
                result2 = false;
            }
        }
        return result2;
    }

    //EJERCICIO 3:
    public Person clone(Person person) {
        Person found = null;
        try {
            found = findByName(person.getName());
            found.setId(found.getId() + 1);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("No found same persons");
        }
        return found;
    }
}
