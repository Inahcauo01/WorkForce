package org.example.service;

import org.example.entities.Employee;
import org.example.repository.EmployeeRepository;

import java.util.List;

public class EmployeService {
    private final EmployeeRepository employeeRepository;

    public EmployeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();
    }

    public Employee addEmp(Employee employee){
        return employeeRepository.save(employee);
    }

}
