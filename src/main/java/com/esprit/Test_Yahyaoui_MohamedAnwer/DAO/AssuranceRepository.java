package com.esprit.Test_Yahyaoui_MohamedAnwer.DAO;

import com.esprit.Test_Yahyaoui_MohamedAnwer.Models.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceRepository extends JpaRepository<Assurance,Integer> {

}
