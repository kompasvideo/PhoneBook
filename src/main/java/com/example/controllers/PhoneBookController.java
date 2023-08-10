package com.example.controllers;

import com.example.models.PhoneBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhoneBookController {

    @GetMapping(value = "/", produces = "text/html; charset=utf-8" )
    public String showFirstView(Model model) {
        PhoneBook phoneBook = new PhoneBook(1,"Иванов", "Иван", "Иванович",
            "+7(919)154-56-78","ул. Ленина 1, 15","рабочий");
        model.addAttribute("phoneBook", phoneBook);
        return "index";
    }
    @GetMapping("/viewAddRecord")
    public String viewAddRecord2() {
        return "view-add-record";
    }

}
