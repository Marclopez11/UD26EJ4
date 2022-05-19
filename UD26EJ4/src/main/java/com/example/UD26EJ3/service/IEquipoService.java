package com.example.UD26EJ3.service;

import java.util.List;

import com.example.UD26EJ3.dto.Equipo;

public interface IEquipoService {
	
	//Metodos del CRUD
			public List<Equipo> listarEquipos(); //Listar All 
			
			public Equipo guardarEquipo(Equipo equipo);	//Guarda un Equipo CREATE
			
			public Equipo equipoXID(int numserie); //Leer datos de un Equipo READ
			
			public Equipo actualizarEquipo(Equipo equipo); //Actualiza datos del Equipo UPDATE
			
			public void eliminarEquipo(int numserie);// Elimina el Equipo DELETE

}
