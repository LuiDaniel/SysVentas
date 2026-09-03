package com.sysventas.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Venta extends DocumentoComercial {
    private LocalDateTime fechaGener;
    private Cliente dniruc;
    private Usuario idUsuario;
    private List<VentaDetalle> detalleVenta = new ArrayList<>();

    public Venta() {
        super();
    }

    public Venta(Long id, double precioBase, double igv, double precioTotal, String serie,
            String numDoc, String tipoDoc, LocalDateTime fechaGener, Cliente dniruc,
            Usuario idUsuario, List<VentaDetalle> detalleVenta) {
        super(id, precioBase, igv, precioTotal, serie, numDoc, tipoDoc);
        this.fechaGener = fechaGener;
        this.dniruc = dniruc;
        this.idUsuario = idUsuario;
        this.detalleVenta = detalleVenta;
    }

    @Override
    public double calcularTotal() {
        double total = detalleVenta.stream()
                .mapToDouble(VentaDetalle::getSubtotal)
                .sum();
        setPrecioTotal(total);
        return total;
    }
}
