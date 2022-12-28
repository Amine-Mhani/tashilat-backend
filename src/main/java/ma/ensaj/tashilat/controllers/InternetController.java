package ma.ensaj.tashilat.controllers;


import ma.ensaj.tashilat.beans.Internet;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.beans.User;
import ma.ensaj.tashilat.services.InternetService;
import ma.ensaj.tashilat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Phone-Internet/internet")
public class InternetController {

    @Autowired
    InternetService internetService;
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public Internet addInternetBill(@RequestBody Internet internet){
        internet.setReference("#"+internet.getNumber()+""+internet.getOperator().getOperatorId()+""+internet.getPrice());
        internet.setNumber("+212-"+Long.parseLong(internet.getNumber()));
        internet.setDate(new Date());
        return internetService.create(internet);
    }

    @GetMapping("/all")
    public List<Internet> getAllInternet(){
        return internetService.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteInternet(@RequestParam int id){
       internetService.delete(id);
    }

    @GetMapping("/get")
    public Internet getInternetById(@RequestParam int id) {
        return internetService.findById(id);
    }

    @PostMapping("/update")
    public void updateInternet(@RequestBody Internet new_internet){
        Internet internet = internetService.findById(new_internet.getInternet_id());
        new_internet.setDate(new Date());
        new_internet.setReference(internet.getReference());
        new_internet.setUser(new_internet.getUser());
        internetService.update(new_internet);
    }
}
