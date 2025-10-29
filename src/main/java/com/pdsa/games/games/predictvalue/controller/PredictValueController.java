package com.pdsa.games.games.predictvalue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games/predictvalue")
public class PredictValueController {

    @GetMapping("/solve")
    public String solve() {
        return "Dummy Predict Value solution";
    }
}