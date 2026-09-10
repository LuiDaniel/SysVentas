package com.service.impl;

import com.service.IVentaService;
import com.sysventas.model.Venta;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.VentaRepository;

public class VentaServiceImp extends ICrudGenericoServiceImp<Venta, Long> implements IVentaService {

    private final VentaRepository ventaRepository;

    public VentaServiceImp(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @Override
    protected ICrudGenericoRepository<Venta, Long> getRepository(){
        return ventaRepository;
    }
}
