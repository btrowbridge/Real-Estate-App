package com.example.bradleytrowbridge.realestateapp;

import android.location.Address;
import android.os.Debug;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;

import java.io.Console;
import java.io.File;
import java.io.PrintWriter;

/**
 * Created by Bradley Trowbridge on 12/10/2015.
 */
public class Person {

    //private properties, null values handles at list setup
    protected String type = "None";
    protected String Fname = "John";
    protected String Lname = "Doe";
    protected MediaStore.Images picture = null;
    protected String company = null;
    protected ContactsContract.CommonDataKinds.Email email = null;
    protected ContactsContract.CommonDataKinds.Phone wphone = null;
    protected ContactsContract.CommonDataKinds.Phone cphone = null;
    protected Address address = null;

    //accessor methods
    public String getType(){return type;}
    public void setType(String value){type = value;}

    public String getFullName(){ return Fname + " " + Lname;}
    public String getFname(){ return Fname;}
    public void setFname(String value){Fname = value;}
    public String getLname(){return Lname;}
    public void setLname(String value){Lname = value;}

    public MediaStore.Images getPicture() {return picture;}
    public void setPicture(MediaStore.Images image){picture = image;}

    public String getCompany(){return company;}
    public void setCompany(String value){company = value;}

    public ContactsContract.CommonDataKinds.Email getEmail() {return email;}
    public void setEmail(ContactsContract.CommonDataKinds.Email e){email = e;}

    public ContactsContract.CommonDataKinds.Phone getWPhone(){return wphone;}
    public void setWPhone(ContactsContract.CommonDataKinds.Phone num){wphone = num;}
    public ContactsContract.CommonDataKinds.Phone getCPhone(){return cphone;}
    public void setCPhone(ContactsContract.CommonDataKinds.Phone num){cphone = num;}

    public Address getAddress(){return address;}
    public void setAddress(Address location){address = location;}

    //Constructor is empty in case user enters only partial data
    public Person( ){}

    public void writeToFile(){
        String fileName = "Contacts.txt";
        File file = new File(fileName);
       try {
           PrintWriter writer = new PrintWriter(file);


           writer.print(Fname + " ");
           writer.print(Lname + " ");
           writer.print(type + " ");
           if(email != null) {
               writer.print(email.toString() + " ");
           }
           if(wphone != null) {
               writer.print(wphone.toString() + " ");
           }
           if(cphone!= null) {
               writer.print(cphone.toString() + " ");
           }
           if(address != null) {
               writer.print(address.toString() + " ");
           }
           writer.println();
           writer.close();
       }
       catch(Exception e){

       }
    }
}
