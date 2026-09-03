package com.sysventas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class DocumentoComercial {
    private Long id;
    private double precioBase;
    private double igv;
    private double precioTotal;
    private String serie;
    private String numDoc;
    private String tipoDoc;

    protected DocumentoComercial(Long id, double precioBase, double igv, double precioTotal,
            String serie, String numDoc, String tipoDoc) {
        this.id = id;
        this.precioBase = precioBase;
        this.igv = igv;
        this.precioTotal = precioTotal;
        this.serie = serie;
        this.numDoc = numDoc;
        this.tipoDoc = tipoDoc;
    }

    public abstract double calcularTotal();
}
