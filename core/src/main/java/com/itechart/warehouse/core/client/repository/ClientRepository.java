package com.itechart.warehouse.core.client.repository;

import com.itechart.warehouse.core.client.Client;
import com.itechart.warehouse.core.entity.repository.EntityRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ClientRepository extends EntityRepository<Client> {

}
