package com.Spring.Model;

public class Objectif {

    private  int id;
    private String description;
    private  boolean etatAchievement;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEtatAchievement() {
        return etatAchievement;
    }

    public void setEtatAchievement(boolean etatAchievement) {
        this.etatAchievement = etatAchievement;
    }
}
