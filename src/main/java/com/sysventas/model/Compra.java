package com.sysventas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    private LocalDate fechaComp;
    private LocalDate fechaReg;
    private Proveedor idProveedor;
    private Usuario idUsuario;
    private List<CompraDetalle> detalleCompra = new ArrayList<>();

    public double calcularTotal() {
        return detalleCompra.stream()
                .mapToDouble(CompraDetalle::getSubtotal)
                .sum();
    }
}
