package com.gedcom.parser;

import java.util.HashMap;

public class Person {

    private String firstName;   // John
    private String lastName;    // Doe
    private char sex;           // M
    private String birthdate;   // 30/03/1890
    private String deathDate;   // 21/01/1921
    private String id;          // @I1@
    private HashMap<String, Object> events = new HashMap<>();

    Person() {}

    Person(String first, String last, char sex, String birthdate, String id) {
        this.firstName = first;
        this.lastName = last;
        this.sex = sex;
        this.birthdate = birthdate;
        this.id = id;
    }

    public String getName() { return this.firstName + " " + this.lastName; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getBirthdate() { return this.birthdate; }
    public String getDeathDate() { return this.deathDate; }
    public String getId() { return this.id; }

    public char getSex() { return this.sex; }

    public void setFirstName(String first) { this.firstName = first; }
    public void setLastName(String last) { this.lastName = last; }
    public void setSex(char sex) {
        if (sex != 'M' || sex != 'F') {
            System.err.println("Sex must be 'M' or 'F'");
            System.exit(-1);
        }
        this.sex = sex;
    }
    public void setID(String id) { this.id = id; }
    public void setBirthdate(String bday) { this.birthdate = bday; }
    public void setDeathDate(String dod) { this.deathDate = dod; }

    public void addEvent(String eventTitle, Object info) {
        this.events.put(eventTitle, info);
    }

    @Override
    public String toString() {
        return "[Person] ID: " + this.id + ", NAME: " + this.getName() + ", SEX: " + String.valueOf(this.sex) + ", DOB: " + this.birthdate + ", DOD: " + this.deathDate;
    }
}
