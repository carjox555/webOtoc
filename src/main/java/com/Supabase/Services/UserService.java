package com.Supabase.Services;

import com.Supabase.Entity.Usuario;
import com.Supabase.Repository.UsuarioRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service              //Objeto para
public class UserService {

    @Autowired
    private  UsuarioRepos usuarioRepository;

    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }
    public Usuario getUsuario(String id) throws Exception {
        Optional<Usuario> usuarioOptinal =usuarioRepository.findById(id);
        if(usuarioOptinal.isPresent()){
            return usuarioOptinal.get();
        }else{
            throw new Exception("Usuario no Existe");
        }
    }
}
