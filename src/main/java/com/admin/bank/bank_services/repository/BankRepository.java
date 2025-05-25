package com.admin.bank.bank_services.repository;

import com.admin.bank.bank_services.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Long> {
}
