package com.itechart.warehouse.core.user.repository;

import com.itechart.warehouse.core.entity.repository.EntityRepository;
import com.itechart.warehouse.core.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends EntityRepository<User> {
}
