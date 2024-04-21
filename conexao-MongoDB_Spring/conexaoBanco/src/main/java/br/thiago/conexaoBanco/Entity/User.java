package br.thiago.conexaoBanco.Entity;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class User {

    @Id
    private String userId;

    private String name;

    private Integer age;

    public User(String userId, String name, Integer age){
        super();
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


}
