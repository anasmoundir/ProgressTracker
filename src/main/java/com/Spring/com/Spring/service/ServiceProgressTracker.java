package com.Spring.com.Spring.service;

import com.Spring.Model.Objectif;
import com.Spring.Model.Utilisateur;

public class ServiceProgressTracker {

    private Utilisateur utilisateur;
    private Objectif objectif;

    public ServiceProgressTracker(Utilisateur utilisateur, Objectif objectif) {
        this.utilisateur = utilisateur;
        this.objectif = objectif;
    }
    public  void assignGoal()
    {
        System.out.println("assigning goals to the user" + utilisateur.getNom());
        System.out.println("Goal description" +objectif.getDescription());
    }

}
