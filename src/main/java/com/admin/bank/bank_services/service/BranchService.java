package com.admin.bank.bank_services.service;

import com.admin.bank.bank_services.model.Branch;

import java.util.List;

public interface BranchService {
    List<Branch> findAllBranches();

    Branch findBranchById(Long id);

    Branch createBranch(Branch branch);

    Branch updateBranch(Long id, Branch branch);

    void deleteBranch(Long id);
}
