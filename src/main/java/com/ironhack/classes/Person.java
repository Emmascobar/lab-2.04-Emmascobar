package com.ironhack.classes;

import java.io.FileWriter;
import java.io.IOException;

public class Person {
    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public short setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("The age cannot be less than 0");
        }
        return setAge(this.age);
    }

    public static void personInfo(Person person) throws IOException {
        FileWriter info = null;
        info = new FileWriter("src/Info.txt", true);
        info.write(person.toString());

        if (person == null) {
            throw new NullPointerException("Can't write a empty person");
        }
        info.close();

    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    @Override
    public String toString() {
        return "Person{" + '\n' +
                "id=" + id + '\n' +
                ", name='" + name + '\n' +
                ", age=" + age + '\n' +
                ", occuppation='" + occupation + '\'' +
                '}';
    }

}