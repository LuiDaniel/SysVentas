package com.service.impl;

import com.service.IMarcaService;
import com.sysventas.model.Marca;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.MarcaRepository;

public class MarcaServiceImp extends ICrudGenericoServiceImp<Marca, Long> implements IMarcaService {

    private final MarcaRepository marcaRepository;

    public MarcaServiceImp(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    protected ICrudGenericoRepository<Marca, Long> getRepository(){
        return marcaRepository;
    }
}
