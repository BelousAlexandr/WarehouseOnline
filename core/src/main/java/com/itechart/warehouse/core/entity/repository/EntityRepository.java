package com.itechart.warehouse.core.entity.repository;

import com.itechart.warehouse.core.entity.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EntityRepository<T extends Entity>
        extends CrudRepository<T, Integer>, PagingAndSortingRepository<T, Integer> {
}
