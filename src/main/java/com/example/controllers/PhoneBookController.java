package com.example.controllers;

import com.example.services.PhoneBookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhoneBookController {
    private PhoneBookService phoneBookService;

    public PhoneBookController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @GetMapping("/viewAddRecord")
    public String viewAddRecord2() {
        return "view-add-record";
    }

}
