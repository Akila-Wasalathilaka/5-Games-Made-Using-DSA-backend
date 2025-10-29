package com.pdsa.games.games.shortestpath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games/shortestpath")
public class ShortestPathController {

    @GetMapping("/solve")
    public String solve() {
        return "Dummy Shortest Path solution";
    }
}