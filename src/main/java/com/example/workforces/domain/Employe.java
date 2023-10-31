package com.example.workforces.domain;

public class Employe {
    private Long id;
    private String nom;
    private double salaire;

    public Employe() {
    }

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
