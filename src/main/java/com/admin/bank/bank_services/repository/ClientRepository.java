package com.admin.bank.bank_services.repository;

import com.admin.bank.bank_services.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
