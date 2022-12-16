package ma.ensaj.tashilat.controllers;

import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.beans.User;
import ma.ensaj.tashilat.services.OperatorService;
import ma.ensaj.tashilat.services.PhoneService;
import ma.ensaj.tashilat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhoneController {
    @Autowired
    PhoneService phoneService;
    @Autowired
    OperatorService operatorService;
    @Autowired
    UserService userService;

    @PostMapping("/create-phone-bill")
    public String CreatePhone(@RequestParam(name = "montant") Long price, @RequestParam(name = "phone_num") Long num, @RequestParam(name = "email") String email, @RequestParam(name = "operator") int operator){
        Operator op = operatorService.findById(operator);
        User user = userService.findById(1);
        phoneService.create(new Phone(price, String.valueOf(num), email, op, user, String.valueOf(price)));
        return "redirect:/Phone-Internet/phone";
    }
}
