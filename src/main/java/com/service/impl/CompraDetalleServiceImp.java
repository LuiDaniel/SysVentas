package com.service.impl;

import com.service.ICompraDetalleService;
import com.sysventas.model.CompraDetalle;
import com.sysventas.repository.CompraDetalleRepository;
import com.sysventas.repository.ICrudGenericoRepository;

public class CompraDetalleServiceImp extends ICrudGenericoServiceImp<CompraDetalle, Long> implements ICompraDetalleService {

    private final CompraDetalleRepository compraDetalleRepository;

    public CompraDetalleServiceImp(CompraDetalleRepository compraDetalleRepository) {
        this.compraDetalleRepository = compraDetalleRepository;
    }

    @Override
    protected ICrudGenericoRepository<CompraDetalle, Long> getRepository(){
        return compraDetalleRepository;
    }
}
