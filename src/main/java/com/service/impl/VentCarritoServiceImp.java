package com.service.impl;

import com.service.IVentCarritoService;
import com.sysventas.model.VentCarrito;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.VentCarritoRepository;

public class VentCarritoServiceImp extends ICrudGenericoServiceImp<VentCarrito, Long> implements IVentCarritoService {

    private final VentCarritoRepository ventCarritoRepository;

    public VentCarritoServiceImp(VentCarritoRepository ventCarritoRepository) {
        this.ventCarritoRepository = ventCarritoRepository;
    }

    @Override
    protected ICrudGenericoRepository<VentCarrito, Long> getRepository(){
        return ventCarritoRepository;
    }
}
