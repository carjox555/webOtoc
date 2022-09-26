package com.Supabase.Services;

import com.Supabase.Entity.Empresa;

public class ServEmpresa {
    Empresa ep1;
    public void ServiceEmpresa(){
        this.ep1 =new Empresa("joxEntrerprice", "calle",
                "46564", "0938409", null);
    }
    public Empresa getEmpresa(){
        return this.ep1;
    }
}
