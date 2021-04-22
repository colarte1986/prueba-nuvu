package com.nuvu.pruebatecnica.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nuvu.pruebatecnica.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Long>{

}
