package com.itechart.warehouse.core.client.service;

import com.itechart.warehouse.core.client.Client;
import com.itechart.warehouse.core.client.repository.ClientRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceCustomImpl implements ClientServiceCustom{

    @Autowired
    private ClientRepositoryCustom clientRepositoryCustomImpl;

    @Override
    public List<Client> findAll() {
        return clientRepositoryCustomImpl.findAll();
    }
}
