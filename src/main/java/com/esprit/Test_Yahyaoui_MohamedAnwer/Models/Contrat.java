package com.esprit.Test_Yahyaoui_MohamedAnwer.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity

@AllArgsConstructor
@NoArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private String matricule;
    private Date dateEffet;
    @Enumerated(EnumType.STRING)
    private TypeContrat type;

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
    }

    public TypeContrat getType() {
        return type;
    }

    public void setType(TypeContrat type) {
        this.type = type;
    }
}
