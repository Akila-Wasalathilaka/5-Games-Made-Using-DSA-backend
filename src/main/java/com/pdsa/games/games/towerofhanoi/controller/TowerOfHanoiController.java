package com.pdsa.games.games.towerofhanoi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games/towerofhanoi")
public class TowerOfHanoiController {

    @GetMapping("/solve")
    public String solve() {
        return "Dummy Tower of Hanoi solution";
    }
}