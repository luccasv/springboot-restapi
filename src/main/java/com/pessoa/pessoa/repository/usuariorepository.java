package com.pessoa.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoa.pessoa.modelo.Usuario;

public interface usuariorepository extends JpaRepository<Usuario, String>{

}
