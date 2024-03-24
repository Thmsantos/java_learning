package br.fatec.projetoNota.service;

import br.fatec.projetoNota.model.Cliente;
import br.fatec.projetoNota.repository.RepositoryApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceApp {

    private RepositoryApp repository;

    @Autowired
    public ServiceApp(RepositoryApp repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        // Aplicação de validação do cliente;
    }
}
