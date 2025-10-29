package com.pdsa.games.repository;

import com.pdsa.games.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Dummy repository
}