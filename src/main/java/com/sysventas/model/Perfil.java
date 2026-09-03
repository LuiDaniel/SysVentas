package com.sysventas.model;

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
public class Perfil {
    private Long idPerfil;
    private String nombre;
    private String codigo;
    private List<Acceso> accesos = new ArrayList<>();
}
