package com.service.impl;

import com.service.ICompraService;
import com.sysventas.model.Compra;
import com.sysventas.repository.CompraRepository;
import com.sysventas.repository.ICrudGenericoRepository;

public class CompraServiceImp extends ICrudGenericoServiceImp<Compra, Long> implements ICompraService {

    private final CompraRepository compraRepository;

    public CompraServiceImp(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    protected ICrudGenericoRepository<Compra, Long> getRepository(){
        return compraRepository;
    }
}
