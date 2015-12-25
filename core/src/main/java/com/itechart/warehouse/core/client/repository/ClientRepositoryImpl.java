package com.itechart.warehouse.core.client.repository;

import com.itechart.warehouse.core.client.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class ClientRepositoryImpl implements ClientRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Iterable<Client> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Client> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Client> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Client> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public Client findOne(Integer id) {
        return (Client) session().get(Client.class, id);
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Client> findAll() {
        return null;
    }

    @Override
    public Iterable<Client> findAll(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void delete(Client entity) {

    }

    @Override
    public void delete(Iterable<? extends Client> entities) {

    }

    @Override
    public void deleteAll() {

    }

    private Session session() {
        return sessionFactory.getCurrentSession();
    }

}
