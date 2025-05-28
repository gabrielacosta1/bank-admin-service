package com.admin.bank.bank_services.controller;

import com.admin.bank.bank_services.model.Client;
import com.admin.bank.bank_services.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> findAllClients(){
        return ResponseEntity.ok(clientService.findAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findClientById(Long id){
        return ResponseEntity.ok(clientService.findClientById(id));
    }

    @PostMapping
    public ResponseEntity<Client> createClient(Client client){
        return ResponseEntity.ok(clientService.createClient(client));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(Long id, Client client){
        return ResponseEntity.ok(clientService.updateClient(id, client));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteClient(Long id){
        clientService.deleteClient(id);
        return ResponseEntity.ok("Se elimino el cliente correctamente");
    }
}
