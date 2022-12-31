package ma.ensaj.tashilat.controllers;

import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.beans.User;
import ma.ensaj.tashilat.services.OperatorService;
import ma.ensaj.tashilat.services.PhoneService;
import ma.ensaj.tashilat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Phone-Internet/phone")
@CrossOrigin
public class PhoneController {
    @Autowired
    PhoneService phoneService;
    @Autowired
    OperatorService operatorService;
    @Autowired
    UserService userService;

    /**@GetMapping("/add")
    public String CreatePhone(@RequestParam(name = "amount") Long price, @RequestParam(name = "number") Long num, @RequestParam(name = "email") String email, @RequestParam(name = "operator") int operator){
        Operator op = operatorService.findById(operator);
        User user = userService.findById(1);
        phoneService.create(new Phone(price, String.valueOf(num), email, op, user, String.valueOf(price)));
        return "redirect:/Phone-Internet/phone";
    }*/

    @PostMapping("/add")
    public Phone createPhone(@RequestBody Phone phone){
        System.out.println(phone.getOperator().getName());
        phone.setPrice(phone.getPrice());
        phone.setAmount(phone.getPrice()+"");
        phone.setReference("#"+phone.getNumber()+""+phone.getOperator().getOperatorId()+""+phone.getPrice());
        phone.setNumber("+212-"+Long.parseLong(phone.getNumber()));
        phone.setDate(new Date());
        return phoneService.create(phone);
    }

    @GetMapping("/all")
    public List<Phone> getAllPhoneBills(){
        return phoneService.findAll();
    }

    @DeleteMapping("/delete")
    public void deletePhone(@RequestParam int id){
        phoneService.delete(id);
    }

    @GetMapping("/get")
    public Phone getPhoneById(@RequestParam int id) {
        return phoneService.findById(id);
    }

    @PostMapping("/update")
    public void updatePhone(@RequestBody Phone new_phone){
        Phone phone = phoneService.findById(new_phone.getPhoneId());
        new_phone.setUser(phone.getUser());
        new_phone.setReference(phone.getReference());
        new_phone.setDate(new Date());
        new_phone.setPrice(Double.parseDouble(new_phone.getAmount()));
        phoneService.update(new_phone);
    }

    @PostMapping("/total")
    public String getTotal(@RequestBody Operator operator){
        double total = phoneService.getCount(operator);
        return total+"";
    }

}
