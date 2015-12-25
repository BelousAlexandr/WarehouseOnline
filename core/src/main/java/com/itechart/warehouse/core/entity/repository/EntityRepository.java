package com.itechart.warehouse.core.entity.repository;

import com.itechart.warehouse.core.entity.Entity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface EntityRepository<T extends Entity> extends PagingAndSortingRepository<T, Integer> {
}
