package com.ironhack.classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {
    PersonsList persons;
    @BeforeEach
    void setUp(){
    persons  = new PersonsList(List.of(
            new Person(01, "Emmanuel Escobar", 34, "Doctor"),
            new Person(02, "Juan Perez", 25, "Teacher"),
            new Person(03, "Matias", 30, "Developmer"),
            new Person(04, "Pedro Ferraro", 22, "Engginer")
    ));


    }

    @AfterEach
    void tearDown(){
    }

    @Test
     void findByName_Equals_Found() {
        //findByName:
        assertEquals("Pedro Ferraro", persons.findByName("Pedro Ferraro"));
        assertEquals("Emmanuel Escobar", persons.findByName("Pedro Ferraro"));
        assertEquals("Pedro", persons.findByName("Pedro Ferraro"));

        //findByNameBoolean:
//        assertEquals(true, persons.findByNameBoolean("Pedro Ferraro"));
//        assertEquals(false, persons.findByNameBoolean("Pedro"));


    }
}