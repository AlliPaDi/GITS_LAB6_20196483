package com.example.gtics_lab6_20196483.repository;

import org.springframework.stereotype.Repository;




import com.example.gtics_lab6_20196483.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    public Usuario findByEmail(String correo);

}


