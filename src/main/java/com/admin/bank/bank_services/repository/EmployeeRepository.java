package com.admin.bank.bank_services.repository;

import com.admin.bank.bank_services.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
