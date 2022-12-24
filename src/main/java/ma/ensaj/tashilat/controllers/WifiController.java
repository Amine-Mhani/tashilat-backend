package ma.ensaj.tashilat.controllers;

import ma.ensaj.tashilat.beans.Client;
import ma.ensaj.tashilat.beans.Internet;
import ma.ensaj.tashilat.beans.User;
import ma.ensaj.tashilat.beans.Wifi;
import ma.ensaj.tashilat.repositories.WifiRepository;
import ma.ensaj.tashilat.services.UserService;
import ma.ensaj.tashilat.services.WifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/wifi")
public class WifiController {

    @Autowired
    WifiService wifiService;

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<Wifi> findAll(){
        return wifiService.findAll();
    }

    @PostMapping("/add")
    public void addInternetBill(@RequestBody Wifi wifi){
        User user = userService.findById(1);
        wifi.setUser(user);
        wifi.setDate(new Date());
        wifi.setReference(wifi.getClient().getCode()+""+wifi.getMonth()+""+wifi.getOperator().getOperatorId());
        wifi.setCode(wifi.getClient().getCode());
        wifi.setPrice(200.0);
        wifi.setState("Not payed");
        wifi.setEmail(wifi.getClient().getEmail());
        wifiService.create(wifi);
    }

    @GetMapping("/get")
    public Wifi getClientById(@RequestParam int id) {
        return wifiService.findById(id);
    }

    @DeleteMapping("/delete")
    public void deleteClient(@RequestParam int id){
        wifiService.delete(id);
    }

    @PostMapping("/update")
    public void updateClient(@RequestBody Wifi new_wifi){
        new_wifi = wifiService.findById(new_wifi.getId());
        new_wifi.setState("Payed");
        wifiService.update(new_wifi);
    }
}
