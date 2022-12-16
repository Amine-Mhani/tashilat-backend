package ma.ensaj.tashilat.services;

import ma.ensaj.tashilat.beans.User;
import ma.ensaj.tashilat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(int id){
        return userRepository.findById(id).get();
    }

    public void create(User user){
        userRepository.save(user);
    }

    public void update(User user){
        userRepository.save(user);
    }

    public void delete(int id){
        userRepository.delete(userRepository.findById(id).get());
    }
}
