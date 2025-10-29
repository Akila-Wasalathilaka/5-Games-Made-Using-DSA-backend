package com.pdsa.games.repository;

import com.pdsa.games.model.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultRepository extends MongoRepository<Result, String> {
    // Dummy repository
}