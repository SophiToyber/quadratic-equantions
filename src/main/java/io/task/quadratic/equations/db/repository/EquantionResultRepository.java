package io.task.quadratic.equations.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.task.quadratic.equations.db.entity.EquantionsResult;

public interface EquantionResultRepository extends MongoRepository<EquantionsResult, String> {

}
