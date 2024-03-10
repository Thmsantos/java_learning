package learning_spring.arquivos.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/teste")


public class controllers {

    @RequestMapping("/read")
    public String Test(){
        return "Funcionou!";
    }
}
