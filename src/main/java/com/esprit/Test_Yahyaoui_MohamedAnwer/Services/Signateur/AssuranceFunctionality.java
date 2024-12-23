package com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Assurance;

public interface AssuranceFunctionality {
    Assurance ajouterAssurance(Assurance a,int cinBf,String matricule);
    double getMontantBF(int cinBF);
}
