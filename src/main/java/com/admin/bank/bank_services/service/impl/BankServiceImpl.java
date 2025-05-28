package com.admin.bank.bank_services.service.impl;

import com.admin.bank.bank_services.model.Bank;
import com.admin.bank.bank_services.repository.BankRepository;
import com.admin.bank.bank_services.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    BankRepository bankRepository;

    @Override
    public List<Bank> findAllBanks() {
        return bankRepository.findAll();
    }

    @Override
    public Bank findBankById(Long id) {
        return bankRepository.findById(id).orElse(null);
    }

    @Override
    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public Bank updateBank(Long id, Bank bank) {
        Bank bankFind = bankRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el banco"));
        bankFind.setAddress(bank.getAddress());
        bankFind.setBranches(bank.getBranches());
        bankFind.setPhone(bank.getPhone());
        return bankRepository.save(bankFind);
    }

    @Override
    public void deleteBank(Long id) {
        bankRepository.deleteById(id);
    }
}
