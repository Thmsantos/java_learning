package br.thiago.conexaoBanco.Repository;

import br.thiago.conexaoBanco.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
