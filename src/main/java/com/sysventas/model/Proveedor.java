package com.sysventas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {
    private Long idProveedor;
    private String dniruc;
    private String nombresRaso;
    private String tipoDoc;
    private String celular;
    private String email;
    private String direccion;
}
