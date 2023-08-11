package com.example.controllers;

import com.example.models.PhoneBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhoneBookController {

    @GetMapping(value = "/")
    public String showFirstView(Model model) {
        PhoneBook phoneBook = new PhoneBook(1,"Ivanov", "Ivan", "Ivanovich",
            "+7(919)154-56-78","st. Lenina 1, 15","worker");
        model.addAttribute("phoneBook", phoneBook);
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
