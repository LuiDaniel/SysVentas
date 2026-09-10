package com.service.impl;

import com.service.IAccesoService;
import com.sysventas.model.Acceso;
import com.sysventas.repository.AccesoRepository;
import com.sysventas.repository.ICrudGenericoRepository;

public class AccesoServiceImp extends ICrudGenericoServiceImp<Acceso, String> implements IAccesoService {

    private final AccesoRepository accesoRepository;

    public AccesoServiceImp(AccesoRepository accesoRepository) {
        this.accesoRepository = accesoRepository;
    }

    @Override
    protected ICrudGenericoRepository<Acceso, String> getRepository(){
        return accesoRepository;
    }
}
