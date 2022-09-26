package com.Supabase.controler;

import com.Supabase.Entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController            //Trabajar con Json
public class UserControler {

    @GetMapping("/usuarios")
    //Responde con un Json
    public ResponseEntity<List<Usuario>>getUsuario(){
    return null;
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario>getUsuario(@PathVariable String id){
        return null;
    }

    @GetMapping("/usuario")
    public ResponseEntity<Usuario>getUsuarios(@RequestParam String id){
        return null;
    }
}
