package com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Beneficiaire;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.TypeContrat;

import java.util.Set;

public interface BeneficiaireFunctionality {
    Beneficiaire ajouterBeneficiaire(Beneficiaire bf);
    Set<Beneficiaire> getBeneficiaireByType(TypeContrat typeContrat);
}
