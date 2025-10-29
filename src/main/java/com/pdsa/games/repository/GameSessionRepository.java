package com.pdsa.games.repository;

import com.pdsa.games.model.GameSession;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameSessionRepository extends MongoRepository<GameSession, String> {
    // Dummy repository
}