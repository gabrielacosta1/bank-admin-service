package com.admin.bank.bank_services.service.impl;

import com.admin.bank.bank_services.model.Account;
import com.admin.bank.bank_services.repository.AccountRepository;
import com.admin.bank.bank_services.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account findAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Long id, Account account) {
        Account accountFind = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro la cuenta"));
        accountFind.setClient(account.getClient());
        accountFind.setNumberAccount(account.getNumberAccount());
        accountFind.setChange(account.getChange());
        accountFind.setEnabled(account.isEnabled());
        return accountRepository.save(accountFind);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
