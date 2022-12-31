package ma.ensaj.tashilat.services;


import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Phone;
import ma.ensaj.tashilat.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    public List<Phone> findAll(){
        return phoneRepository.findAll();
    }

    public Phone findById(int id){
        return phoneRepository.findById(id).get();
    }

    public Phone create(Phone phone){
        return phoneRepository.save(phone);
    }

    public void update(Phone phone){
        phoneRepository.save(phone);
    }

    public void delete(int id){
        phoneRepository.delete(phoneRepository.findById(id).get());
    }

    public double getCount(Operator operator){
        return phoneRepository.getTotal(operator);
    }
}
