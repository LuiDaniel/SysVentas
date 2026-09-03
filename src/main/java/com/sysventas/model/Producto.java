package com.sysventas.model;

import com.sysventas.enums.TipoProducto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Long idProducto;
    private String nombre;
    private Double pu;
    private Double puold;
    private Double utilidad;
    private Double stock;
    private Double stockold;
    private Categoria idCategoria;
    private Marca idMarca;
    private UnidMedida idUnidad;
    private TipoProducto tipoProducto;
}
