package com.exitplan.ExitPlanningAPI.Repo;

import com.exitplan.ExitPlanningAPI.Entity.ExitPlanning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExitRepo extends JpaRepository<ExitPlanning, Integer> {
    // you can add custom query methods here if needed
}
