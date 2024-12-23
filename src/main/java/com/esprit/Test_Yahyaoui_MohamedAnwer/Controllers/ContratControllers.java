package com.esprit.Test_Yahyaoui_MohamedAnwer.Controllers;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Contrat;
import com.esprit.Test_Yahyaoui_MohamedAnwer.Services.Signateur.ContratFunctionality;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/contrat")
public class ContratControllers {
    private final ContratFunctionality contratFunctionality;

    public ContratControllers(ContratFunctionality contratFunctionality) {
        this.contratFunctionality = contratFunctionality;
    }

    @PostMapping(path = "/addContrat")
    public Contrat addContrat(@RequestBody Contrat c){
        return contratFunctionality.ajouterContrat(c);
    }

    @GetMapping(path = "oldContrat/{idF}")
    public Contrat getOldestContrat(@PathVariable int idF){
        return contratFunctionality.getContratBf(idF);
    }
}
