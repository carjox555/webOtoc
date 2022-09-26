package com.Supabase.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Empleado {

    private String nombre;
    private String correo;
    private String empresa;
    private String rolEmpleado;

    MovimientoDinero movimiento1;

    public Empleado() {
    }

    public Empleado(String nombre, String correo, String empresa, String rolEmpleado, MovimientoDinero movimiento1) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rolEmpleado = rolEmpleado;
        this.movimiento1 = movimiento1;
    }

}
