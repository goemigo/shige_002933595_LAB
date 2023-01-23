/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emi
 */
public class Person {
    String nuid;
    String firstName;
    String lastName;
    String collegeName;
    ContactInformation officeContactInfo;
    ContactInformation personalContactInfo;
    Address currentAddress;
    Address permanentAddress;

    public Person(){
        this.nuid = "";
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.officeContactInfo = new ContactInformation();
        this.personalContactInfo = new ContactInformation();
        this.currentAddress = new Address();
        this.permanentAddress = new Address();

    }
    
    public void setNuid(String nuid) {
        this.nuid = nuid;
    }
    
    public String getNuid() {
        return nuid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public ContactInformation getOfficeContactInfo() {
        return officeContactInfo;
    }

//    public void setOfficeContactInfo(ContactInformation officeContactInfo) {
//        this.officeContactInfo = officeContactInfo;
//    }

    public ContactInformation getPersonalContactInfo() {
        return personalContactInfo;
    }

//    public void setPersonalContactInfo(ContactInformation personalContactInfo) {
//        this.personalContactInfo = personalContactInfo;
//    }
   
    
//    public static void main(String args[]){
//        Person obj = new Person();
//        obj.setFirstName("Emily");
//        Address address = obj.getAddress();  
//    }
}
