package com.example.controllers;

import com.example.models.PhoneBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/Record")
public class RecordController {

    @PostMapping(value = "/viewRecord")
    public String viewRecord(@RequestParam("id") int id, Model model) {
        PhoneBook phoneBook = new PhoneBook(1,"Иванов", "Иван", "Иванович",
            "+7(919)154-56-78","ул. Ленина 1, 15","рабочий");
        model.addAttribute("phoneBook", phoneBook);
        return "view-record";
    }

    @PostMapping(value = "/deleteRecord")
    public String deleteRecord(@RequestParam("id") int id, Model model) {
        PhoneBook phoneBook = new PhoneBook(1,"Иванов", "Иван", "Иванович",
            "+7(919)154-56-78","ул. Ленина 1, 15","рабочий");
        model.addAttribute("phoneBook", phoneBook);
        return "delete-record";
    }

    @PostMapping(value = "/editRecord")
    public String editRecord(@RequestParam("id") int id, Model model) {
        PhoneBook phoneBook = new PhoneBook(1,"Иванов", "Иван", "Иванович",
            "+7(919)154-56-78","ул. Ленина 1, 15","рабочий");
        model.addAttribute("phoneBook", phoneBook);
        return "edit-record";
    }

    @PostMapping(value = "/editSaveRecord")
    public String editSaveRecord(@ModelAttribute("phoneBook") PhoneBook phoneBook) {
        return "index";
    }

}
