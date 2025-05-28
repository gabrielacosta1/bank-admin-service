package com.admin.bank.bank_services.repository;

import com.admin.bank.bank_services.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {
}
