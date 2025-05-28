package com.admin.bank.bank_services.service;

import com.admin.bank.bank_services.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAllAccounts();

    Account findAccountById(Long id);

    Account createAccount(Account account);

    Account updateAccount(Long id, Account account);

    void deleteAccount(Long id);
}
