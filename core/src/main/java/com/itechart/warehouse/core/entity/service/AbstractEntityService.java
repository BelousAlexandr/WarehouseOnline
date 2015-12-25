package com.itechart.warehouse.core.entity.service;

import com.itechart.warehouse.core.entity.Entity;
import com.itechart.warehouse.core.entity.repository.EntityRepository;
import com.itechart.warehouse.core.util.LoggingProvider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractEntityService<T extends Entity> {
    protected T load(int id) {
        T entity = getRepository().findOne(id);
        if (entity == null) {
            //TODO: throw new EntityNotFoundException(id);
            LoggingProvider.info("Entity with id {} not found", id);
        }
        return entity;
    }

    @Transactional(readOnly = true)
    public T find(int id) {
        return getRepository().findOne(id);
    }

    @Transactional(readOnly = true)
    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    @Transactional(readOnly = true)
    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    protected abstract EntityRepository<T> getRepository();
}