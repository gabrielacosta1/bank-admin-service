package com.admin.bank.bank_services.service.impl;

import com.admin.bank.bank_services.model.Client;
import com.admin.bank.bank_services.repository.ClientRepository;
import com.admin.bank.bank_services.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client findClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Long id, Client client) {
        Client clientFind = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el cliente"));
        clientFind.setAddress(client.getAddress());
        clientFind.setName(client.getName());
        clientFind.setDni(client.getDni());
        clientFind.setBranch(client.getBranch());
        clientFind.setAccounts(client.getAccounts());
        clientFind.setPhone(client.getPhone());
        return clientRepository.save(clientFind);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
