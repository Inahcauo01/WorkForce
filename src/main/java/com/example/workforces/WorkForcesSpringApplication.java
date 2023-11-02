package com.example.workforces;

import com.example.workforces.controller.EmployeController;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkForcesSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(WorkForcesSpringApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("hi");
        EmployeController employeController = context.getBean(EmployeController.class);
        employeController.getAllEmployees();


//        Employe employe = context.getBean(Employe.class);
//        Departement departement = context.getBean(Departement.class);
//
//        System.out.println(employe);
//        System.out.println(departement);

    }

}
