package com.admin.bank.bank_services.controller;

import com.admin.bank.bank_services.model.Bank;
import com.admin.bank.bank_services.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController {
    @Autowired
    BankService bankService;

    @GetMapping
    public ResponseEntity<List<Bank>> findAllBanks(){
        return ResponseEntity.ok(bankService.findAllBanks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bank> findBankById(Long id){
        return ResponseEntity.ok(bankService.findBankById(id));
    }

    @PostMapping
    public ResponseEntity<Bank> createBank(Bank bank){
        return ResponseEntity.ok(bankService.createBank(bank));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bank> updateBank(Long id, Bank bank){
        return ResponseEntity.ok(bankService.updateBank(id, bank));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteBank(Long id){
        bankService.deleteBank(id);
        return ResponseEntity.ok("Se elimino correctamente el banco");
    }
}
