package com.itechart.warehouse.core.user.service;

import com.itechart.warehouse.core.entity.repository.EntityRepository;
import com.itechart.warehouse.core.entity.service.AbstractEntityService;
import com.itechart.warehouse.core.user.User;
import com.itechart.warehouse.core.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractEntityService<User> implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    protected EntityRepository<User> getRepository() {
        return null;
    }
}
