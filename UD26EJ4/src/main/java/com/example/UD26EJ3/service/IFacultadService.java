package com.example.UD26EJ3.service;

import java.util.List;

import com.example.UD26EJ3.dto.Facultad;


public interface IFacultadService {
	
	//Metodos del CRUD
	public List<Facultad> listarFacultads(); //Listar All 
	
	public Facultad guardarFacultad(Facultad facultad);	//Guarda un Facultad CREATE
	
	public Facultad facultadXID(Long id); //Leer datos de un Facultad READ
	
	public Facultad actualizarFacultad(Facultad facultad); //Actualiza datos del Facultad UPDATE
	
	public void eliminarFacultad(Long id);// Elimina el Facultad DELETE

}
