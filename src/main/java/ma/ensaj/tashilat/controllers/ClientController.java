package ma.ensaj.tashilat.controllers;

import ma.ensaj.tashilat.beans.Client;
import ma.ensaj.tashilat.beans.Internet;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.beans.User;
import ma.ensaj.tashilat.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Phone-Internet/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<Client> findAll(){
        return clientService.findAll();
    }

    @PostMapping("/add")
    public void addClient(@RequestBody Client client){
        client.setCode("#"+client.getCin()+"2022");
        client.setNumber("+212-"+Long.parseLong(client.getNumber()));
        clientService.create(client);
    }

    @DeleteMapping("/delete")
    public void deleteClient(@RequestParam int id){
        clientService.delete(id);
    }

    @GetMapping("/get")
    public Client getClientById(@RequestParam int id) {
        return clientService.findById(id);
    }

    @PostMapping("/update")
    public void updateClient(@RequestBody Client new_client){
        new_client.setCode("#"+new_client.getCin()+"2022");
        clientService.update(new_client);
    }
}
