package com.Supabase.Repository;

import com.Supabase.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepos extends JpaRepository<Usuario, String> {
}
