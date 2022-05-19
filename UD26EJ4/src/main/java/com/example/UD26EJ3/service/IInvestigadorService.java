package com.example.UD26EJ3.service;

import java.util.List;

import com.example.UD26EJ3.dto.Investigador;


public interface IInvestigadorService {
	
	//Metodos del CRUD
	public List<Investigador> listarInvestigadors(); //Listar All 
	
	public Investigador guardarInvestigador(Investigador investigador);	//Guarda un Investigador CREATE
	
	public Investigador investigadorXID(int dni); //Leer datos de un Investigador READ
	
	public Investigador actualizarInvestigador(Investigador investigador); //Actualiza datos del Investigador UPDATE
	
	public void eliminarInvestigador(int dni);// Elimina el Investigador DELETE

}
