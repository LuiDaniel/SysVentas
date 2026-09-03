package com.sysventas.model;

import com.sysventas.enums.TipoDocumento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String dniruc;
    private String nombres;
    private String repLegal;
    private String direccion;
    private TipoDocumento tipoDocumento;
}
