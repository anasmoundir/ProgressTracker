package com.SpringFirst;


import com.Spring.Model.Objectif;
import com.Spring.Model.Utilisateur;
import com.Spring.com.Spring.service.ServiceProgressTracker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static   void   main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Utilisateur utilisateur = (Utilisateur) context.getBean("utilisateur");
        Objectif objectif = (Objectif) context.getBean("objectif");
        ServiceProgressTracker progressTracker = new ServiceProgressTracker(utilisateur, objectif);
        progressTracker.assignGoal();

    }

}