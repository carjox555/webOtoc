package com.Supabase.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private String NIT;

    Empleado empleado;

    public Empresa(String nombre, String direccion, String telefono, String NIT, Empleado empleado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
        this.empleado = empleado;
    }
}
