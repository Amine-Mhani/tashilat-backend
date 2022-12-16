package ma.ensaj.tashilat.services;


import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.repositories.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OperatorService {

    @Autowired
    OperatorRepository operatorRepository;

    public List<Operator> findAll(){
        return operatorRepository.findAll();
    }

    public Operator findById(int id){
        return operatorRepository.findById(id).get();
    }

    public void create(Operator operator){
        operatorRepository.save(operator);
    }

    public void update(Operator operator){
        operatorRepository.save(operator);
    }

    public void delete(int id){
        operatorRepository.delete(operatorRepository.findById(id).get());
    }
}
