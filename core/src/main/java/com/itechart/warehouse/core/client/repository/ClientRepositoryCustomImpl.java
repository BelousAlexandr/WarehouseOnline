package com.itechart.warehouse.core.client.repository;

import com.itechart.warehouse.core.client.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientRepositoryCustomImpl implements ClientRepositoryCustom{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Client> findAll() {
        return session().createQuery("from Client").list();
    }

    private Session session() {
        return sessionFactory.getCurrentSession();
    }
}
