package com.Sachin;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts>SachinContact;
    private String myNumber;
        //Constructor for working on the initialisation of class
        MobilePhone(String myNumber){
        //just wanted a fresh ArrayList
        this.SachinContact=new ArrayList <Contacts>();
        this.myNumber=myNumber;
    }
    //now we have to create class for adding new contact!
        public boolean addNewContact(Contacts  contact){
        //we have to check whether it has been added sucessfully or not.
        if(findContact(contact.getContactName())>=0){
            System.out.println("Contact in the file already");//to see whether it is in the list or not.
            return false;
        }
        SachinContact.add(contact);
            return true;
        }
        public boolean updateContact(Contacts oldContact,Contacts newContact){
            int foundPosition=findContact(oldContact);
            //let's check whether the given contact is in the list or not!
            if(foundPosition<0){
                System.out.println(oldContact.getContactName()+" is not in the ArrayList");
                return false;
            }
            //"set" will replace old contact with new contact
            this.SachinContact.set(foundPosition,newContact);
            System.out.println(oldContact.getContactName()+" have been replaced with " + newContact.getContactName());
            return true;
        }

        public String queryContact(Contacts contact){
            if(findContact(contact)>=0){
                return contact.getContactName();
            }
            return null;
        }

        public boolean removeContact(Contacts contact){
            int foundPosition=findContact(contact);
            if(foundPosition<0){
                System.out.println(contact.getContactName()+"is not found");
                return false;
            }
            SachinContact.remove(foundPosition);
            System.out.println(contact.getContactName()+" is deleted from the ArrayList");
            return true;
        }

        private int findContact(Contacts contact) {
            return this.SachinContact.indexOf(contact);
    }
        private int findContact (String  contact) {
        //we have to get the contacts name so......
        for (int i = 0; i < this.SachinContact.size(); i++) {
            //We are looking for the contacts in the array list
            Contacts contacts = this.SachinContact.get(i);
            if (contacts.getContactName().equals(contact))
                return i;
            //if the contact name is in the list then it will return it's position
        }

        return -1;
    }
    public void printContact(){
        System.out.println("All contact Lists");
        for(int i=0;i<SachinContact.size();i++){
            //this will print the required things in the list of contacts
            System.out.println((i+1)+"-"+ SachinContact.get(i).getContactName()+SachinContact.get(i).getPhoneNumber());
        }
    }
}
