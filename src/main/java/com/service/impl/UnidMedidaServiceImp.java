package com.service.impl;

import com.service.IUnidMedidaService;
import com.sysventas.model.UnidMedida;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.UnidadMedidaRepository;

public class UnidMedidaServiceImp extends ICrudGenericoServiceImp<UnidMedida, Long> implements IUnidMedidaService {

    private final UnidadMedidaRepository unidadMedidaRepository;

    public UnidMedidaServiceImp(UnidadMedidaRepository unidadMedidaRepository) {
        this.unidadMedidaRepository = unidadMedidaRepository;
    }

    @Override
    protected ICrudGenericoRepository<UnidMedida, Long> getRepository(){
        return unidadMedidaRepository;
    }
}
