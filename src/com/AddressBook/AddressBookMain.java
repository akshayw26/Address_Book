package com.AddressBook;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(" welcome to Address Book Program ");
        AddressBook familyAddressBook = new AddressBook();

        familyAddressBook.addContact();

        System.out.println(familyAddressBook.contactList);

    }
}
