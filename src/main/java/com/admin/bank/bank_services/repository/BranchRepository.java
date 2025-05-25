package com.admin.bank.bank_services.repository;

import com.admin.bank.bank_services.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Long> {
}
