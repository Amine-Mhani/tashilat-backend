package ma.ensaj.tashilat.controllers;


import ma.ensaj.tashilat.beans.User;
import ma.ensaj.tashilat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/login")
    public ResponseEntity<User> Login(@RequestParam String email){
        try {
            User user = userService.findUserByEmail(email);
            return new ResponseEntity<User>(user,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
