package br.fatec.projetoNota;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "appName")
    public String appName(){
        return "Paulo da Silva";
    }
}
