/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author root
 */
public class Person {
    private String sirName;
    private String middleName;
    private String lastName;

    public Person(String sirName, String middleName, String lastName) {
        this.sirName = sirName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    private String salutation;
    private String ID;
    private String telNo;
    private String email;
    private String maritalStatus;
    private String Occupation;
    private String dateToAmani;
    private String occupancyNature;
    private String from;
    private String referee;
    private String refereeContacts;
    private String reasonForMoving;

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public String getDateToAmani() {
        return dateToAmani;
    }

    public void setDateToAmani(String dateToAmani) {
        this.dateToAmani = dateToAmani;
    }

    public String getOccupancyNature() {
        return occupancyNature;
    }

    public void setOccupancyNature(String occupancyNature) {
        this.occupancyNature = occupancyNature;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getRefereeContacts() {
        return refereeContacts;
    }

    public void setRefereeContacts(String refereeContacts) {
        this.refereeContacts = refereeContacts;
    }

    public String getReasonForMoving() {
        return reasonForMoving;
    }

    public void setReasonForMoving(String reasonForMoving) {
        this.reasonForMoving = reasonForMoving;
    }
    
    
    
}
