package com.example.workforces.service;

import com.example.workforces.domain.Employe;
import com.example.workforces.repository.EmployeRepository;

import java.util.List;

public class EmployeService {
    EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public List<Employe> getAllEmp() {
        return employeRepository.findAll();
    }
}
