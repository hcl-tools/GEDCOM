package com.gedcom.parser;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    /**
     * We are using the key of the PersonID (individual id) for the people.
     * We are using the key of the FamilyID for the families.
     */
    static HashMap<String, Family> families = new HashMap<>();      // @F1@, Family
    static HashMap<String, Person> people = new HashMap<>();        // @1D@, Person

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // Your code here to read the file.

        mainMenu();
    }

    private static void mainMenu() {
        int i = 0;
        while (i != 3) {
            System.out.println("-------------------");
            System.out.println("     Main Menu     ");
            System.out.println("-------------------");
            System.out.println("1 - Display Menu");
            System.out.println("2 - Find Menu");
            System.out.println();
            System.out.println("3 - Quit");

            i = Integer.valueOf(ask("Enter choice >> "));

            switch (i) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    findMenu();
                    break;
            }
        }
    }

    private static void displayMenu() {
        int i = 0;
        while (i != 4) {
            System.out.println("-------------------");
            System.out.println("   Display Menu    ");
            System.out.println("-------------------");
            System.out.println("1 - Display all families");
            System.out.println("2 - Display all Men");
            System.out.println("3 - Display all Women");
            System.out.println();
            System.out.println("4 - Back");

            i = Integer.valueOf(ask("Enter choice >> "));

            switch (i) {
                case 1:
                    displayAllFamilies();
                    break;
                case 2:
                    displayAllMen();
                    break;
                case 3:
                    displayAllWomen();
                    break;
            }
        }
    }

    private static void displayAllFamilies() {
        for (String id : families.keySet()) {
            System.out.println(families.get(id));
            System.out.println(families.get(id).displayChildren());
        }
    }
    private static void displayAllMen() {
        for (String id : people.keySet()) {
            if (people.get(id).getSex() == 'M') {
                System.out.println(people.get(id));
            }
        }
    }
    private static void displayAllWomen() {
        for (String id : people.keySet()) {
            if (people.get(id).getSex() == 'F') {
                System.out.println(people.get(id));
            }
        }
    }

    private static void findMenu() {
        int i = 0;
        while (i != 3) {
            System.out.println("-------------------");
            System.out.println("     Find Menu     ");
            System.out.println("-------------------");
            System.out.println("1 - Find Family");
            System.out.println("2 - Find Person");
            System.out.println();
            System.out.println("3 - Back");

            i = Integer.valueOf(ask("Enter choice >> "));

            switch (i) {
                case 1:
                    findFamily();
                    break;
                case 2:
                    findPerson();
                    break;
            }
        }
    }

    private static void findFamily() {
        String familyName = ask("Family name >> ");
        for (String id : families.keySet()) {
            if (families.get(id).getFamilyName().equalsIgnoreCase(familyName)) {
                System.out.println(families.get(id));
                System.out.println(families.get(id).displayChildren());
                return;
            }
        }
        System.out.println("No family with that name found!");
    }

    private static void findPerson() {
        String firstName = ask("First name >> ");
        String lastName = ask("Last name >> ");

        for (String id : people.keySet()) {
            Person p = people.get(id);
            if (p.getFirstName().equalsIgnoreCase(firstName) && p.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("No person with that name found!");
    }

    private static String ask(String question) {
        System.out.print(question);
        return keyboard.nextLine();
    }
}
