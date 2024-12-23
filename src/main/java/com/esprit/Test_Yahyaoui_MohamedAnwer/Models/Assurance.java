package com.esprit.Test_Yahyaoui_MohamedAnwer.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity


@AllArgsConstructor
@NoArgsConstructor
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssurance;
    private String designation;
    private float montant;
    @ManyToOne
    private Beneficiaire beneficiaire;
    @ManyToOne
    private Contrat contrat;

    public int getIdAssurance() {
        return idAssurance;
    }

    public void setIdAssurance(int idAssurance) {
        this.idAssurance = idAssurance;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Beneficiaire getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(Beneficiaire beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
}
