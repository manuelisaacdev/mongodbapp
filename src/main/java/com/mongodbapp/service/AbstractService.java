package com.mongodbapp.service;

import com.mongodbapp.exception.EntityNotFoundException;
import com.mongodbapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbstractService <T, ID> {
    T findById(ID id) throws EntityNotFoundException;
    MongoRepository<T, ID>  getRepository();
}
