package com.service.impl;

import com.service.IVentaDetalleService;
import com.sysventas.model.VentaDetalle;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.VentaDetalleRepository;

public class VentaDetalleServiceImp extends ICrudGenericoServiceImp<VentaDetalle, Long> implements IVentaDetalleService {

    private final VentaDetalleRepository ventaDetalleRepository;

    public VentaDetalleServiceImp(VentaDetalleRepository ventaDetalleRepository) {
        this.ventaDetalleRepository = ventaDetalleRepository;
    }

    @Override
    protected ICrudGenericoRepository<VentaDetalle, Long> getRepository(){
        return ventaDetalleRepository;
    }
}
