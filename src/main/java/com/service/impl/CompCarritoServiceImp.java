package com.service.impl;

import com.service.ICompCarritoService;
import com.sysventas.model.CompCarrito;
import com.sysventas.repository.CompCarritoRepository;
import com.sysventas.repository.ICrudGenericoRepository;

public class CompCarritoServiceImp extends ICrudGenericoServiceImp<CompCarrito, Long> implements ICompCarritoService {

    private final CompCarritoRepository compCarritoRepository;

    public CompCarritoServiceImp(CompCarritoRepository compCarritoRepository) {
        this.compCarritoRepository = compCarritoRepository;
    }

    @Override
    protected ICrudGenericoRepository<CompCarrito, Long> getRepository(){
        return compCarritoRepository;
    }
}
