package com.example.workforces;

import com.example.workforces.domain.Departement;
import com.example.workforces.domain.Employe;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class WorkForcesSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employe employe = context.getBean(Employe.class);
        Departement departement = context.getBean(Departement.class);

        System.out.println(employe);
        System.out.println(departement);

    }

}
