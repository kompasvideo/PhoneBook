package com.example.models;

public class PhoneBook {
    // ID
    private int PhoneBookID;
    // Фамилия
    private String LastName;
    // Имя
    private String FirstName;
    // Отчество
    private String ThreeName;
    // Номер телефона
    private String NumberPhone;
    //Адрес
    private String Address;
    // Описание
    private String Description;

    public PhoneBook() {
    }

    public PhoneBook(int phoneBookID, String lastName, String firstName, String threeName, String numberPhone, String address, String description) {
        PhoneBookID = phoneBookID;
        LastName = lastName;
        FirstName = firstName;
        ThreeName = threeName;
        NumberPhone = numberPhone;
        Address = address;
        Description = description;
    }

    public int getPhoneBookID() {
        return PhoneBookID;
    }

    public void setPhoneBookID(int phoneBookID) {
        PhoneBookID = phoneBookID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getThreeName() {
        return ThreeName;
    }

    public void setThreeName(String threeName) {
        ThreeName = threeName;
    }

    public String getNumberPhone() {
        return NumberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        NumberPhone = numberPhone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
            "PhoneBookID=" + PhoneBookID +
            ", LastName='" + LastName + '\'' +
            ", FirstName='" + FirstName + '\'' +
            ", ThreeName='" + ThreeName + '\'' +
            ", NumberPhone='" + NumberPhone + '\'' +
            ", Address='" + Address + '\'' +
            ", Description='" + Description + '\'' +
            '}';
    }
}
