package com.service.impl;

import com.service.IProductoService;
import com.sysventas.model.Producto;
import com.sysventas.repository.ICrudGenericoRepository;
import com.sysventas.repository.ProductoRepository;

public class ProductoServiceImp extends ICrudGenericoServiceImp<Producto, Long> implements IProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImp(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    protected ICrudGenericoRepository<Producto, Long> getRepository(){
        return productoRepository;
    }
}
