package com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Impementation;

import com.esprit.Test_Yahyaoui_MohamedAnwer.DAO.AssuranceRepository;
import com.esprit.Test_Yahyaoui_MohamedAnwer.DAO.BeneficiaireRepository;
import com.esprit.Test_Yahyaoui_MohamedAnwer.DAO.ContratRepository;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Assurance;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Beneficiaire;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Contrat;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur.AssuranceFunctionality;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

@Slf4j
@Service

public class AssuranceFunImpl implements AssuranceFunctionality {
    private final AssuranceRepository assuranceRepository;
    private final BeneficiaireRepository beneficiaireRepository;
    private final ContratRepository contratRepository;

    public AssuranceFunImpl(AssuranceRepository assuranceRepository, BeneficiaireRepository beneficiaireRepository, ContratRepository contratRepository) {
        this.assuranceRepository = assuranceRepository;
        this.beneficiaireRepository = beneficiaireRepository;
        this.contratRepository = contratRepository;
    }

    @Override
    public Assurance ajouterAssurance(Assurance a, int cinBf, String matricule) {
        Beneficiaire beneficiaire = beneficiaireRepository.findByCin(cinBf);
        Contrat contrat = contratRepository.findByMatricule(matricule);
        a.setBeneficiaire(beneficiaire);
        a.setContrat(contrat);
        return assuranceRepository.save(a);
    }

    @Override
    public double getMontantBF(int cinBF) {
        Beneficiaire beneficiaire = beneficiaireRepository.findByCin(cinBF);
        return beneficiaire.getAssurances().stream()
                .mapToDouble(a->{
                    float montant = a.getMontant();
                    switch (a.getContrat().getType()){
                        case Semestriel : return montant*2;
                        case Mensuel: return montant*12;
                        default: return montant;
                    }
                })
                .sum();
    }


    @Scheduled(cron = "*/10 * * * * *")
    public void statistique(){

        TreeMap<Integer,Integer> stats = new TreeMap<>(Collections.reverseOrder());
        beneficiaireRepository.findAll().forEach(bf->stats.put(bf.getAssurances().size(), bf.getCin()));
        stats.forEach((count,cin)-> System.out.println("Beneficiaire cin : "+cin+" numbre of assurance : "+count));

    }

}
