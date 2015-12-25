package com.itechart.warehouse.core.user.repository;

import com.itechart.warehouse.core.entity.repository.EntityRepository;
import com.itechart.warehouse.core.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends EntityRepository<User> {
}
