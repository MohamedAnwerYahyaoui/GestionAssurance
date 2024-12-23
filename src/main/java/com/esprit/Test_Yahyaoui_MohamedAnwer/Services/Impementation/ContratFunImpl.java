package com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Impementation;

import com.esprit.Test_Yahyaoui_MohamedAnwer.DAO.BeneficiaireRepository;
import com.esprit.Test_Yahyaoui_MohamedAnwer.DAO.ContratRepository;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Assurance;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Beneficiaire;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Contrat;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur.ContratFunctionality;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class ContratFunImpl implements ContratFunctionality {
    private final ContratRepository contratRepository;
    private final BeneficiaireRepository beneficiaireRepository;

    public ContratFunImpl(ContratRepository contratRepository, BeneficiaireRepository beneficiaireRepository) {
        this.contratRepository = contratRepository;
        this.beneficiaireRepository = beneficiaireRepository;
    }

    @Override
    public Contrat ajouterContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat getContratBf(int idBf) {
        Beneficiaire beneficiaire = beneficiaireRepository.findById(idBf).orElse(null);

        return beneficiaire.getAssurances().stream()
                .map(Assurance::getContrat)
                .min(Comparator.comparing(Contrat::getDateEffet))
                .orElse(null);
    }
}
