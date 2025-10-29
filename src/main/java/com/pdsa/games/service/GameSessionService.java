package com.pdsa.games.service;

import com.pdsa.games.model.GameSession;
import com.pdsa.games.repository.GameSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameSessionService {

    @Autowired
    private GameSessionRepository gameSessionRepository;

    public List<GameSession> getAllSessions() {
        return gameSessionRepository.findAll();
    }

    public GameSession saveSession(GameSession session) {
        return gameSessionRepository.save(session);
    }
}