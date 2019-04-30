package com.gedcom.parser;

import java.util.ArrayList;

public class Family {

    private Person husband;
    private Person wife;
    private String status;
    private ArrayList<Person> children = new ArrayList<>();

    Family() {

    }

    Family(Person husband, Person wife, String status) {
        this.husband = husband;
        this.wife = wife;
        this.status = status;
    }

    public Person getHusband() { return this.husband; }
    public Person getWife() { return this.wife; }

    public String getStatus() { return this.status; }
    public String getFamilyName() { return this.husband.getName(); }

    public ArrayList<Person> getChildren() { return this.children; }

    public void addChild(Person p) { this.children.add(p); }
    public void addHusband(Person p) { this.husband = p; }
    public void addWife(Person p) { this.wife = p; }

    public boolean hasChild(String id) {
        for (Person p : children) {
            if (p.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public String displayChildren() {
        StringBuilder toReturn = new StringBuilder();

        for(Person child : children) {
            toReturn.append("\t").append(child).append("\n");
        }

        return toReturn.toString();
    }

    @Override
    public String toString() {
        return "[Family] Name: " + this.husband.getLastName() + ", HUSBAND: " + this.husband.getFirstName() + ", WIFE: " + this.wife.getFirstName();
    }
}
