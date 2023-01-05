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
@RequestMapping("/Phone-Internet/wifi")
public class WifiController {

    @Autowired
    WifiService wifiService;

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<Wifi> findAll(){
        return wifiService.findAll();
    }

    @GetMapping("/not")
    public List<Wifi> findNotFound(){
        return wifiService.findByStateNotPayed();
    }

    @PostMapping("/add")
    public void addWifiBill(@RequestBody Wifi wifi){
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
    public Wifi getWifiById(@RequestParam int id) {
        return wifiService.findById(id);
    }

    @DeleteMapping("/delete")
    public void deleteWifi(@RequestParam int id){
        wifiService.delete(id);
    }

    @PostMapping("/update")
    public Wifi updateWifi(@RequestBody Wifi new_wifi){
        int id = new_wifi.getUser().getUserId();
        User user = userService.findById(id);

        new_wifi = wifiService.findById(new_wifi.getId());
        new_wifi.setState("Payed");
        new_wifi.setUser(user);

        return wifiService.update(new_wifi);
    }

    @GetMapping("/code/{code}")
    public List<Wifi> findWifiByCode(@PathVariable String code){
        return wifiService.findByCode(code);
    }

    @GetMapping("/not-code/{code}")
    public List<Wifi> findWifiByCodeAndState(@PathVariable String code){
        return wifiService.findByCodeAndNotPayed(code);
    }
}
