package com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Impementation;

import com.esprit.Test_Yahyaoui_MohamedAnwer.DAO.BeneficiaireRepository;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Beneficiaire;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.TypeContrat;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur.BeneficiaireFunctionality;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BeneficiaireFunImpl implements BeneficiaireFunctionality {
    private final BeneficiaireRepository beneficiaireRepository;

    public BeneficiaireFunImpl(BeneficiaireRepository beneficiaireRepository) {
        this.beneficiaireRepository = beneficiaireRepository;
    }

    @Override
    public Beneficiaire ajouterBeneficiaire(Beneficiaire bf) {
        return beneficiaireRepository.save(bf);
    }

    @Override
    public Set<Beneficiaire> getBeneficiaireByType(TypeContrat typeContrat) {
        return new HashSet<>(beneficiaireRepository.findByAssurances_Contrat_Type(typeContrat));
    }
}
