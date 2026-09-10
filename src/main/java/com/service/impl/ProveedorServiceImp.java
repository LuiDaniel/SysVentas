package com.service.impl;

import com.service.IProveedorService;
import com.sysventas.model.Proveedor;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.ProveedorRepository;

public class ProveedorServiceImp extends ICrudGenericoServiceImp<Proveedor, Long> implements IProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorServiceImp(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    protected ICrudGenericoRepository<Proveedor, Long> getRepository(){
        return proveedorRepository;
    }
}
