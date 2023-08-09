package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PhoneBookController {

    @RequestMapping(value = "/", method = RequestMethod.GET,
        produces = "application/json; charset=utf-8")
    @ResponseBody
    public String showFirstView() {
        return "index";
    }
    @RequestMapping("/viewAddRecord")
    public String viewAddRecord2() {
        return "viewAddRecord";
    }

}
