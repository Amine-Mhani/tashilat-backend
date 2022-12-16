package ma.ensaj.tashilat.controllers;

import ma.ensaj.tashilat.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/Phone-Internet")
public class PagesController {

    @Autowired
    OperatorService operatorService;

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
}
