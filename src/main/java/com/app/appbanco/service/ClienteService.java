package com.app.appbanco.service;

import com.app.appbanco.entity.Cliente;
import com.app.appbanco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> findAllClientes(){
        return clienteRepository.findAll();
    }
    


    public void saveCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

}
