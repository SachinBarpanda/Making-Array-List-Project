package com.Sachin;

public class Contacts {
    private String contactName;
    private String phoneNumber;

    Contacts(String contactName,String phoneNumber){
        this.contactName=contactName;
        this.phoneNumber=phoneNumber;
    }
    public String getContactName(){
        return contactName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    //now we have to create static method for some reason!
    //cause we don't want to create another method on other classes
    public static Contacts createContact(String contactName,String phoneNumber){
        return new Contacts(contactName,phoneNumber);
    }
}
