package com.service.impl;

import com.service.ICategoriaService;
import com.sysventas.model.Categoria;
import com.sysventas.repository.CategoriaRepository;
import com.sysventas.repository.ICrudGenericoRepository;

public class CategoriaServiceImp extends ICrudGenericoServiceImp<Categoria, Long> implements ICategoriaService {
    
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImp(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected ICrudGenericoRepository<Categoria, Long> getRepository(){
        return categoriaRepository;
    }
}


