package com.esprit.Test_Yahyaoui_MohamedAnwer.Controllers;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Assurance;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur.AssuranceFunctionality;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/assurance")
public class AssuranceControllers {
    private final AssuranceFunctionality assuranceFunctionality;

    public AssuranceControllers(AssuranceFunctionality assuranceFunctionality) {
        this.assuranceFunctionality = assuranceFunctionality;
    }
    @PostMapping(path = "/addAssurance/{cinBf}/{matricule}")
    public Assurance addAssurance(@RequestBody Assurance a, @PathVariable int cinBf, @PathVariable String matricule){
        return assuranceFunctionality.ajouterAssurance(a,cinBf,matricule);
    }

    @GetMapping(path = "/getMontantByBfA/{cinBf}")
    public double getMontantBfByA(@PathVariable int cinBf){
        return assuranceFunctionality.getMontantBF(cinBf);
    }
}
