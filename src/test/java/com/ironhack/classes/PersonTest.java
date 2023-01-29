package com.ironhack.classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    @BeforeEach
    void setUp(){
        person = new Person(02, "Juan Perez", 25, "Teacher");
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void setAge_Over0_true() {
    assertEquals(0, person.setAge(0));
    assertEquals(10, person.setAge(5));
    }
}