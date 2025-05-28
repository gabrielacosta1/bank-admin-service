package com.admin.bank.bank_services.controller;

import com.admin.bank.bank_services.model.Branch;
import com.admin.bank.bank_services.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/branch")
public class BranchController {
    @Autowired
    BranchService branchService;

    @GetMapping
    public ResponseEntity<List<Branch>> findAllBranches(){
        return ResponseEntity.ok(branchService.findAllBranches());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Branch> findBranchById(Long id){
        return ResponseEntity.ok(branchService.findBranchById(id));
    }

    @PostMapping
    public ResponseEntity<Branch> createBranch(Branch branch){
        return ResponseEntity.ok(branchService.createBranch(branch));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Branch> updateBranch(Long id, Branch branch){
        return ResponseEntity.ok(branchService.updateBranch(id, branch));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteBranch(Long id){
        branchService.deleteBranch(id);
        return ResponseEntity.ok("Se elimino correctamente el banco");
    }
}
