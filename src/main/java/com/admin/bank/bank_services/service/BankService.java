package com.admin.bank.bank_services.service;

import com.admin.bank.bank_services.model.Bank;

import java.util.List;

public interface BankService {
    List<Bank> findAllBanks();

    Bank findBankById(Long id);

    Bank createBank(Bank bank);

    Bank updateBank(Long id, Bank bank);

    void deleteBank(Long id);


}
