package com.admin.bank.bank_services.service;

import com.admin.bank.bank_services.model.Client;

import java.util.List;

public interface ClientService {
    List <Client> findAllClients();

    Client findClientById(Long id);

    Client createClient(Client client);

    Client updateClient(Long id, Client client);

    void deleteClient(Long id);

}
