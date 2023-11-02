package com.example.workforces.controller;

import com.example.workforces.domain.Employe;
import com.example.workforces.service.EmployeService;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EmployeController {
    EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    public ResponseEntity<List<Employe>> getAllEmployees(){
        List<Employe> employes = employeService.getAllEmp();

        if (employes.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employes, HttpStatus.OK);
    }
}
