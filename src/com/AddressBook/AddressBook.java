package com.AddressBook;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBook {

    ArrayList <Contacts> contactList = new ArrayList<>();

    void addContact() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name --> ");
        String name = sc.next();
        System.out.println("Enter Age --> ");
        int age = sc.nextInt();
        System.out.println("Enter City --> ");
        String city = sc.next();
        System.out.println("Enter State --> ");
        String state = sc.next();

        Contacts contact = new Contacts();
        contact.setName(name);
        contact.setAge(age);
        contact.setCity(city);
        contact.setState(state);

        contactList.add(contact);

    }
}
