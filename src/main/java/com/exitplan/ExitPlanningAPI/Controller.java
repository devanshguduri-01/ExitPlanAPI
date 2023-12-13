package com.exitplan.ExitPlanningAPI;

import com.exitplan.ExitPlanningAPI.Entity.ExitPlanning;
import com.exitplan.ExitPlanningAPI.Repo.ExitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ExitPlanning")
public class Controller {

    @Autowired
    private ExitRepo repo;

    @PostMapping
    public ExitPlanning createPlan(@RequestBody ExitPlanning plan) {
        return repo.save(plan);
    }

    @GetMapping
    public List<ExitPlanning> getAllEntities() {
        return repo.findAll();
    }
}