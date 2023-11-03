package org.example;

import org.example.entities.Department;
import org.example.entities.Employee;
import org.example.service.EmployeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

        EmployeService employeeService = appContext.getBean("employeeService", EmployeService.class);

        Employee employee = new Employee();
        Department department = new Department(1L,"IT");
        employee.setName("employé1");
        employee.setSalary(10000.0);
        employee.setDepartment(department);

        employeeService.getAllEmp().stream().forEach(System.out::println);
    }
}