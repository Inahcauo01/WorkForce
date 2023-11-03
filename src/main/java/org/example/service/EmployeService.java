package org.example.service;

import org.example.entities.Employee;
import org.example.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

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

    public void deleteEmp(Long id){
        employeeRepository.deleteById(id);
    }

    public Employee findById(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmp(Long id, Employee employee) {
        Optional<Employee> empData = employeeRepository.findById(id);
        if (empData.isPresent()) {
            Employee updateEmp = empData.get();
            updateEmp.setName(employee.getName());
            updateEmp.setSalary(employee.getSalary());
            return employeeRepository.save(updateEmp);
        } else
            return new Employee();
    }
}
