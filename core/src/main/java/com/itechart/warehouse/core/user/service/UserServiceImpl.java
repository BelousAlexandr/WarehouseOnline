package com.itechart.warehouse.core.user.service;

import com.itechart.warehouse.core.entity.repository.EntityRepository;
import com.itechart.warehouse.core.entity.service.AbstractEntityService;
import com.itechart.warehouse.core.user.User;
import com.itechart.warehouse.core.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends AbstractEntityService<User> implements UserService {
    @Autowired
    private UserRepository userRepositoryImpl;

    public String firstNameById(int id) {
        User user = userRepositoryImpl.findOne(id);
        if(user != null) {
            return user.getFirstName();
        }
        return null;
    }

    @Override
    protected EntityRepository<User> getRepository() {
        return userRepositoryImpl;
    }
}
