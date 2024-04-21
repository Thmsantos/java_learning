package br.thiago.conexaoBanco.Controller;

import br.thiago.conexaoBanco.Entity.User;
import br.thiago.conexaoBanco.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequestMapping("/")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/teste")
    public String teste(){
        return "AAAAA";
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
       return userService.addUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

}
