package com.lundberg.mongo.repository;

import com.lundberg.mongo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PersonRepository extends MongoRepository<Person, String> {
}
