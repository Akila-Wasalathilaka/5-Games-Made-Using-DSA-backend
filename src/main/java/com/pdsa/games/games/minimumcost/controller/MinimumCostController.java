package com.pdsa.games.games.minimumcost.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games/minimumcost")
public class MinimumCostController {

    @GetMapping("/solve")
    public String solve() {
        return "Dummy Minimum Cost solution";
    }
}