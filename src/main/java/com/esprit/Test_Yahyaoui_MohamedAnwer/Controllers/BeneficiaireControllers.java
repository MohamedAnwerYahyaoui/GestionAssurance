package com.esprit.Test_Yahyaoui_MohamedAnwer.Controllers;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Beneficiaire;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.TypeContrat;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur.BeneficiaireFunctionality;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/beneficiaire")
public class BeneficiaireControllers {
    private final BeneficiaireFunctionality beneficiaireFunctionality;

    public BeneficiaireControllers(BeneficiaireFunctionality beneficiaireFunctionality) {
        this.beneficiaireFunctionality = beneficiaireFunctionality;
    }

    @PostMapping(path = "/addBF")
    public Beneficiaire addBF(@RequestBody Beneficiaire bf){
        return beneficiaireFunctionality.ajouterBeneficiaire(bf);
    }
    @GetMapping(path = "/getBenefByType/{typeC}")
    public Set<Beneficiaire> getBfByTypeC(@PathVariable TypeContrat typeC){
        return beneficiaireFunctionality.getBeneficiaireByType(typeC);
    }
}
