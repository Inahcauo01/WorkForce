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

        Department department = new Department(1L,"IT");
        Employee employee = Employee.builder()
                .name("employe6")
                .salary(1006.0)
                .department(department)
                .build();
//        employeeService.addEmp(employee);
//        employeeService.deleteEmp(4L);
        employeeService.updateEmp(6L, employee);
//        System.out.println(employeeService.findById(5L));
        System.out.println("__________________________");
        employeeService.getAllEmp().forEach(System.out::println);
    }
}