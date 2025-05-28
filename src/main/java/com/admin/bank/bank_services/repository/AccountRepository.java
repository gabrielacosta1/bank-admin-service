package com.admin.bank.bank_services.repository;

import com.admin.bank.bank_services.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
