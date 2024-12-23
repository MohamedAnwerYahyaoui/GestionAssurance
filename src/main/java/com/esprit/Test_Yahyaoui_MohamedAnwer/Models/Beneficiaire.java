package com.esprit.Test_Yahyaoui_MohamedAnwer.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBenef;
    private int cin;
    private String nom;
    private String prenom;
    private String profession;
    private float salaire;
    @OneToMany(mappedBy = "beneficiaire")
    private List<Assurance>assurances;

    public int getIdBenef() {
        return idBenef;
    }

    public void setIdBenef(int idBenef) {
        this.idBenef = idBenef;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public List<Assurance> getAssurances() {
        return assurances;
    }

    public void setAssurances(List<Assurance> assurances) {
        this.assurances = assurances;
    }
}
