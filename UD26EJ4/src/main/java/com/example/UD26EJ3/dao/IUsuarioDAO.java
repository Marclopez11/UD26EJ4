package com.example.UD26EJ3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UD26EJ3.dto.Usuario;



public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}