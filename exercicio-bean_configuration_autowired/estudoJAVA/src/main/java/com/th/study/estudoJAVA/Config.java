package com.th.study.estudoJAVA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean(name = "jsonTest")
    public String JsonCom(){
        return "{nome: 'Thiago', idade: '20'}";
    }
}
