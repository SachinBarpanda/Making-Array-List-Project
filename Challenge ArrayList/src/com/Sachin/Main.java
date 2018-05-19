package com.Sachin;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0977 562 3786");

    public static void main(String[] args) {
        //we are going to make our project dynamic so we will add dynamic way of
        //chosing what the person wants to use!
        boolean quit = false;
        startmyphone();
        printwhattodo();
        while(!quit){
            System.out.println("Enter your action for the mobile phone working");
            int todo=scanner.nextInt();
            //this is to cancel the implementation of integer scanner
            scanner.nextLine();

            switch(todo){
                case 0:
                    System.out.println("\n SHUT DOWN CONFORM");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    findifpossibleContact();
                    break;
            }
        }


    }

    public static void addNewContact(){
        System.out.println("Enter the name of the contact");
        String contactName=scanner.nextLine();
        System.out.println("Enter the number of the code");
        String phoneNumber= scanner.nextLine();
        Contacts newContact = Contacts.createContact(contactName,phoneNumber);
        //print a message that we have added a contact
        //cause it was boolean at first
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added"+contactName+" carrying number "+ phoneNumber);
        }
        else{
            System.out.println("Cannot add " +contactName+ " it's already in file");
        }
    }


    public static void startmyphone() {
        System.out.println("Starting mobile android Phone");
    }

    public static void printwhattodo(){
        System.out.println("Available actions");
        System.out.println("0- shutdown\n"+
                                               "1- to print contacts\n"+
                                                "2 - to add new\n"+
                                                "3- to  update contact with new one\n "+
                                                "4- to remove an existing contact\n"+
                                                "5-To search  if an existing contact is there to be used \n"+
                                                "6-to print a list of available actions");
    }
}