package com.service.impl;

import com.service.IPerfilService;
import com.sysventas.model.Perfil;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.PerfilRepository;

public class PerfilServiceImp extends ICrudGenericoServiceImp<Perfil, Long> implements IPerfilService {

    private final PerfilRepository perfilRepository;

    public PerfilServiceImp(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    @Override
    protected ICrudGenericoRepository<Perfil, Long> getRepository(){
        return perfilRepository;
    }
}
