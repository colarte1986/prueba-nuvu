package com.nuvu.pruebatecnica.servie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.nuvu.pruebatecnica.commons.GenericServiceImpl;
import com.nuvu.pruebatecnica.dao.api.ClienteRepository;
import com.nuvu.pruebatecnica.model.Cliente;
import com.nuvu.pruebatecnica.service.api.ClienteServiceAPI;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteServiceAPI{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public CrudRepository<Cliente, Long> getDao() {
		return clienteRepository;
	}

}
