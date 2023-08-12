package com.example.services;

import com.example.models.PhoneBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneBookServiceImpl implements PhoneBookService{
    private List<PhoneBook> phoneBooks;
    public PhoneBookServiceImpl() {
    }
    public PhoneBook getPhoneBook(int id) {
        PhoneBook phoneBook = null;
        if (phoneBooks == null) {
            phoneBook = new PhoneBook();
        } else {
            for (var item: phoneBooks ) {
                if (item.getPhoneBookID() == id) {
                    phoneBook = item;
                    break;
                }
            }

            if (phoneBook == null) {
                phoneBook = new PhoneBook();
            }
        }
        return phoneBook;
    }
    public List<PhoneBook> getPhoneBooks() {
        if (phoneBooks == null) {
            phoneBooks = new ArrayList<>();
            PhoneBook phoneBook = new PhoneBook(1, "Ivanov", "Ivan", "Ivanovich",
                "+7(919)154-56-78", "st. Lenina 1, 15", "worker");
            phoneBooks.add(phoneBook);
            phoneBook = new PhoneBook(2, "Petrov", "Petr", "Petrovich",
                "+7(919)154-56-79", "st. Petrova 7, 3", "worker");
            phoneBooks.add(phoneBook);
            phoneBook = new PhoneBook(3, "Sidorov", "Sidor", "Sidorovich",
                "+7(919)154-56-80", "st. Pushkina 4, 1", "worker");
            phoneBooks.add(phoneBook);
        }
        return phoneBooks;
    }
    public void editRecordToPhoneBooks(PhoneBook newPhoneBook){
        PhoneBook phoneBook = null;
        if (phoneBooks == null) {
            return;
        } else {
            for (var item: phoneBooks ) {
                if (item.getPhoneBookID() == newPhoneBook.getPhoneBookID()) {
                    item.setFirstName(newPhoneBook.getFirstName());
                    item.setLastName(newPhoneBook.getLastName());
                    item.setThreeName(newPhoneBook.getThreeName());
                    item.setNumberPhone(newPhoneBook.getNumberPhone());
                    item.setAddress(newPhoneBook.getAddress());
                    item.setDescription(newPhoneBook.getDescription());
                    break;
                }
            }
        }
    }
    public void deleteRecordToPhoneBooks(int id){
        PhoneBook phoneBook = null;
        if (phoneBooks == null) {
            return;
        } else {
            for (var item: phoneBooks ) {
                if (item.getPhoneBookID() == id) {
                    phoneBook = item;
                    break;
                }
            }
            if (phoneBook != null) {
                phoneBooks.remove(phoneBook);
            }
        }
    }
}
