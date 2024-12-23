package com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Contrat;

public interface ContratFunctionality {
    Contrat ajouterContrat(Contrat c);
    Contrat getContratBf(int idBf);
}
