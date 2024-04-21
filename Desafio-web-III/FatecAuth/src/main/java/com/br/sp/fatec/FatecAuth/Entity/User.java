package com.br.sp.fatec.FatecAuth.Entity;
//https://dontpad.com/thiago/webDesafio
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, unique = true, length = 100)
    private String nome;

    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 25)
    private Role role;

    @Column(name = "dt_nasc", nullable = false, length = 30)
    private String dt_nasc;

    @Column(name = "RA", nullable = false, length = 15)
    private String RA;

    @Column(name = "curso", nullable = false, length = 50)
    private String curso;

    @Column(name = "SemestreAtual", nullable = false, length = 14)
    private String SemestreAtual;

    public enum Role{
        FUNCIONARIO, PROFESSOR, ALUNO, VESTIBULANDO
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        User user = (User) o;
        return Objects.equals(id, user.id);
    }


}
