package com.mongodbapp.service.impl;

import com.mongodbapp.exception.EntityNotFoundException;
import com.mongodbapp.service.AbstractService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;

@RequiredArgsConstructor
public abstract class AbstractServiceImpl<T, ID, R extends MongoRepository<T, ID>> implements AbstractService<T, ID> {
    private final R repository;

    @Override
    public T findById(ID id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
    }

    @Override
    public MongoRepository<T, ID> getRepository() {
        return repository;
    }
}
