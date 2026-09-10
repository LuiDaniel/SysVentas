package com.service.impl;

import com.service.IUsuarioService;
import com.sysventas.model.Usuario;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.UsuarioRepository;

public class UsuarioServiceImp extends ICrudGenericoServiceImp<Usuario, Long> implements IUsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    protected ICrudGenericoRepository<Usuario, Long> getRepository(){
        return usuarioRepository;
    }
}
