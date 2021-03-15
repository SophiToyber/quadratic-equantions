package io.task.quadratic.equations.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import io.task.quadratic.equations.db.entity.EquantionResult;

@Component
public interface EquantionResultRepository extends MongoRepository<EquantionResult, String> {

}
