package com.pdsa.games.controller;

import com.pdsa.games.model.GameSession;
import com.pdsa.games.service.GameSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class GameSessionController {

    @Autowired
    private GameSessionService gameSessionService;

    @GetMapping
    public List<GameSession> getSessions() {
        return gameSessionService.getAllSessions();
    }

    @PostMapping
    public GameSession createSession(@RequestBody GameSession session) {
        return gameSessionService.saveSession(session);
    }
}