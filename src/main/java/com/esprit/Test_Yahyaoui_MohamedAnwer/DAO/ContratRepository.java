package com.esprit.Test_Yahyaoui_MohamedAnwer.DAO;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Beneficiaire;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Contrat;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {
    Contrat findByMatricule(String matricule);
}
