package com.esprit.Test_Yahyaoui_MohamedAnwer.DAO;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Beneficiaire;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BeneficiaireRepository extends JpaRepository<Beneficiaire,Integer> {

    Beneficiaire findByCin(int cinBf);
    Set<Beneficiaire> findByAssurances_Contrat_Type(TypeContrat typeContrat);
}
