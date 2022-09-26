package com.Supabase.controler;

import com.Supabase.Entity.Empresa;
import com.Supabase.Services.ServEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaControler {
    ServEmpresa se1 = new ServEmpresa();
    Empresa emp1;

    public void ControlEmpresa(){
        this.emp1 = this.se1.getEmpresa();
    }

@GetMapping("/info")
    public Empresa informacion(){
    return this.emp1;
}
}
