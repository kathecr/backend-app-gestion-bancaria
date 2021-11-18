package com.app.appbanco.controller;

import com.app.appbanco.entity.Cliente;
import com.app.appbanco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes(){
        return clienteService.findAllClientes();
    }

    @GetMapping("/{id_Cliente}")
    public Cliente getClienteById

    @PostMapping
    public void saveCliente(@RequestBody Cliente cliente) throws Exception{
        clienteService.saveCliente(cliente);
    }
}
