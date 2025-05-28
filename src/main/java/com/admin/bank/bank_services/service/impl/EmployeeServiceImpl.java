package com.admin.bank.bank_services.service.impl;

import com.admin.bank.bank_services.model.Employee;
import com.admin.bank.bank_services.repository.EmployeeRepository;
import com.admin.bank.bank_services.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee employeeFind = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el empleado"));
        employeeFind.setBranch(employee.getBranch());
        employeeFind.setDni(employee.getDni());
        employeeFind.setName(employee.getName());
        employeeFind.setPhone(employee.getPhone());
        employeeFind.setPosition(employee.getPosition());
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
