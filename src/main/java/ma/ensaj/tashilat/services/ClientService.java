package ma.ensaj.tashilat.services;

import ma.ensaj.tashilat.beans.Client;
import ma.ensaj.tashilat.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client findById(int id){
        return clientRepository.findById(id).get();
    }

    public void create(Client client){
        clientRepository.save(client);
    }

    public void update(Client client){
        clientRepository.save(client);
    }

    public void delete(int id){
        clientRepository.delete(clientRepository.findById(id).get());
    }
}
