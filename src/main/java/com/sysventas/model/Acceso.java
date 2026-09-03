package com.sysventas.model;

import com.sysventas.enums.Menus;
import com.sysventas.enums.TipoTab;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Acceso {
    private String idAcceso;
    private String urlAcceso;
    private String menuItemNombre;
    private Menus menuNombre;
    private TipoTab nombreTab;
}
