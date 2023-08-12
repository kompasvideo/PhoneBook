package com.example.services;

import com.example.models.PhoneBook;
import org.springframework.stereotype.Service;

@Service
public class PhoneBookService {
    public PhoneBookService() {
    }
    public PhoneBook GetPhoneBooks() {
        PhoneBook phoneBook = new PhoneBook(1,"Ivanov", "Ivan", "Ivanovich",
            "+7(919)154-56-78","st. Lenina 1, 15","worker");
        return phoneBook;
    }
}
