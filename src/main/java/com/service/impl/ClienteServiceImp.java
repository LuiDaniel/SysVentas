package com.service.impl;

import com.service.IClienteService;
import com.sysventas.model.Cliente;
import com.sysventas.repository.ClienteRepository;
import com.sysventas.repository.ICrudGenericoRepository;

public class ClienteServiceImp extends ICrudGenericoServiceImp<Cliente, String> implements IClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImp(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    protected ICrudGenericoRepository<Cliente, String> getRepository(){
        return clienteRepository;
    }
}
