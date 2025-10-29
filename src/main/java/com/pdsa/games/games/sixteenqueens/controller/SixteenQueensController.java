package com.pdsa.games.games.sixteenqueens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games/sixteenqueens")
public class SixteenQueensController {

    @GetMapping("/solve")
    public String solve() {
        return "Dummy Sixteen Queens solution";
    }
}