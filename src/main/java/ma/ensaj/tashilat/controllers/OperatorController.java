package ma.ensaj.tashilat.controllers;


import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Phone-Internet/operator")
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

    @PostMapping( "/create")
    public void ceate(@RequestParam("name") String name, @RequestParam("image") MultipartFile image) throws IOException {
        Operator fournisseur = new Operator();
        fournisseur.setName(name);
        fournisseur.setImage("data:image/jpeg;base64,"+ Base64.getEncoder().encodeToString(image.getBytes()));
        operatorService.create(fournisseur);
    }
}
