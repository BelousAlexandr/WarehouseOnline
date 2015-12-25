package com.itechart.warehouse.core.client.service;

import com.itechart.warehouse.core.client.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientService {

    Client find(int id);

    Iterable<Client> findAll();

    Page<Client> findAll(Pageable pageable);

}
