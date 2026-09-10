package com.service.impl;

import com.service.IEmisorService;
import com.sysventas.model.Emisor;
import com.sysventas.repository.EmisorRepository;
import com.sysventas.repository.ICrudGenericoRepository;

public class EmisorServiceImp extends ICrudGenericoServiceImp<Emisor, Long> implements IEmisorService {

    private final EmisorRepository emisorRepository;

    public EmisorServiceImp(EmisorRepository emisorRepository) {
        this.emisorRepository = emisorRepository;
    }

    @Override
    protected ICrudGenericoRepository<Emisor, Long> getRepository(){
        return emisorRepository;
    }
}
