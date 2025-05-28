package com.admin.bank.bank_services.controller;

import com.admin.bank.bank_services.model.Account;
import com.admin.bank.bank_services.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> findAllAccounts(){
        return ResponseEntity.ok(accountService.findAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findAccountById(Long id){
        return ResponseEntity.ok(accountService.findAccountById(id));
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(Account account){
        return ResponseEntity.ok(accountService.createAccount(account));
    }

    @PutMapping("{/id}")
    public ResponseEntity<Account> updateAccount(Long id, Account account){
        return ResponseEntity.ok(accountService.updateAccount(id, account));
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<String> deleteAccount(Long id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Se elimino correctamente la cuenta");
    }

}
