package ma.ensaj.tashilat.services;

import ma.ensaj.tashilat.beans.Internet;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.repositories.InternetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InternetService {

    @Autowired
    InternetRepository internetRepository;

    public List<Internet> findAll(){
        return internetRepository.findAll();
    }

    public Internet findById(int id){
        return internetRepository.findById(id).get();
    }

    public Internet create(Internet internet){
        return internetRepository.save(internet);
    }

    public void update(Internet internet){
        internetRepository.save(internet);
    }

    public void delete(int id){
        internetRepository.delete(internetRepository.findById(id).get());
    }
}
