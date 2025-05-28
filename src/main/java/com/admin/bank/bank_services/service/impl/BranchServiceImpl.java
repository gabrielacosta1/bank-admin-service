package com.admin.bank.bank_services.service.impl;

import com.admin.bank.bank_services.model.Branch;
import com.admin.bank.bank_services.repository.BranchRepository;
import com.admin.bank.bank_services.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BranchServiceImpl implements BranchService {
    @Autowired
    BranchRepository branchRepository;

    @Override
    public List<Branch> findAllBranches() {
        return branchRepository.findAll();
    }

    @Override
    public Branch findBranchById(Long id) {
        return branchRepository.findById(id).orElse(null);
    }

    @Override
    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public Branch updateBranch(Long id, Branch branch) {
        Branch branchFind = branchRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro la sucursal"));
        branchFind.setAddress(branch.getAddress());
        branchFind.setBank(branch.getBank());
        branchFind.setPhone(branch.getPhone());
        branchFind.setEmployees(branch.getEmployees());
        branchFind.setClients(branch.getClients());
        return branchRepository.save(branchFind);
    }

    @Override
    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }
}
