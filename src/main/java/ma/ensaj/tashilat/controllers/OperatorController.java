package ma.ensaj.tashilat.controllers;


import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/operator")
public class OperatorController {

    @Autowired
    OperatorService operatorService;

    @GetMapping("/all")
    public List<Operator> getAllOperators(){
        return operatorService.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteOperator(@RequestParam int id){
        operatorService.delete(id);
    }
}
