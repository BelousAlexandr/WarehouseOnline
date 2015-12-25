package com.itechart.warehouse.core.client.service;

import com.itechart.warehouse.core.client.Client;
import com.itechart.warehouse.core.client.repository.ClientRepository;
import com.itechart.warehouse.core.entity.repository.EntityRepository;
import com.itechart.warehouse.core.entity.service.AbstractEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl extends AbstractEntityService<Client> implements ClientService{
    @Autowired
    private ClientRepository clientRepositoryImpl;

    @Override
    protected EntityRepository<Client> getRepository() {
        return clientRepositoryImpl;
    }


}
