package com.itechart.warehouse.core.client.repository;

import com.itechart.warehouse.core.client.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ClientRepositoryCustom {

    List<Client> findAll();
}
