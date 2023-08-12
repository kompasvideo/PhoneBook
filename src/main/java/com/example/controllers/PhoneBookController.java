package com.example.controllers;

import com.example.models.PhoneBook;
import com.example.services.PhoneBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhoneBookController {
    private PhoneBookService phoneBookService;

    public PhoneBookController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @GetMapping(value = "/")
    public String showFirstView(Model model) {
        model.addAttribute("phoneBook", phoneBookService.GetPhoneBooks());
        model.addAttribute("header", "Notebook");
        model.addAttribute("addRecord","Add record");//"Добавить запись");
        model.addAttribute("editRecord","Edit record");//"Добавить запись");
        model.addAttribute("delRecord","Delete record");//"Добавить запись");
        return "index";
    }
    @GetMapping("/viewAddRecord")
    public String viewAddRecord2() {
        return "view-add-record";
    }

}
