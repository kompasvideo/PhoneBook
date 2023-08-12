package com.example.services;

import com.example.models.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public interface PhoneBookService {
    PhoneBook getPhoneBook(int id);
    List<PhoneBook> getPhoneBooks();
    void editRecordToPhoneBooks(PhoneBook newPhoneBook);
    void deleteRecordToPhoneBooks(int id);
    PhoneBook getNewPhoneBook();
    void addRecordToPhoneBooks(PhoneBook newPhoneBook);
}
