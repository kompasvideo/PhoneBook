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
        PhoneBook phoneBook = new PhoneBook(1,"Ivanov", "Ivan", "Ivanovich",
            "+7(919)154-56-78","st. Lenina 1, 15","worker");
        model.addAttribute("phoneBook", phoneBook);
        model.addAttribute("header", "Notebook");
        return "view-record";
    }

    @PostMapping(value = "/deleteRecord")
    public String deleteRecord(@RequestParam("id") int id, Model model) {
        PhoneBook phoneBook = new PhoneBook(1,"Ivanov", "Ivan", "Ivanovich",
            "+7(919)154-56-78","st. Lenina 1, 15","worker");
        model.addAttribute("phoneBook", phoneBook);
        model.addAttribute("header", "Notebook");
        return "delete-record";
    }

    @PostMapping(value = "/editRecord")
    public String editRecord(@RequestParam("id") int id, Model model) {
        PhoneBook phoneBook = new PhoneBook(1,"Ivanov", "Ivan", "Ivanovich",
            "+7(919)154-56-78","st. Lenina 1, 15","worker");
        model.addAttribute("phoneBook", phoneBook);
        model.addAttribute("header", "Notebook");
        model.addAttribute("editRecord","Edit record");//"Добавить запись");
        return "edit-record";
    }

    @PostMapping(value = "/editSaveRecord")
    public String editSaveRecord(@ModelAttribute("phoneBook") PhoneBook phoneBook, Model model) {
        model.addAttribute("phoneBook", phoneBook);
        model.addAttribute("header", "Notebook");
        model.addAttribute("addRecord","Add record");//"Добавить запись");
        model.addAttribute("editRecord","Edit record");//"Добавить запись");
        model.addAttribute("delRecord","Delete record");//"Добавить запись");
        return "index";
    }

}
