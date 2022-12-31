package ma.ensaj.tashilat.controllers;

import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.services.InternetService;
import ma.ensaj.tashilat.services.OperatorService;
import ma.ensaj.tashilat.services.PhoneService;
import ma.ensaj.tashilat.services.WifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/Phone-Internet")
public class PagesController {

    @Autowired
    OperatorService operatorService;

    @Autowired
    PhoneService phoneService;
    @Autowired
    InternetService internetService;
    @Autowired
    WifiService wifiService;

    @GetMapping("/home")
    public String Login(ModelMap model){
        model.addAttribute("ops", operatorService.findAll());
        return "index";
    }

    @GetMapping("/phone")
    public String Phone(ModelMap model){
        model.addAttribute("ops", operatorService.findAll());
        return "phone";
    }

    @GetMapping("/internet")
    public String Internet(){
        return "internet";
    }

    @GetMapping("/bills")
    public String Count(){
        int count = phoneService.findAll().size()+internetService.findAll().size()+wifiService.findAll().size();
        return count+"";
    }

    @PostMapping("/total")
    public String getTotal(@RequestBody Operator operator){
        double total = phoneService.getCount(operator)+wifiService.getCount(operator)+internetService.getCount(operator);
        System.out.println(total);
        return total+"";
    }
}
