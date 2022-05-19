package com.example.UD26EJ3.service;

import java.util.List;

import com.example.UD26EJ3.dto.Reserva;


public interface IReservaService {
	
	
	//Metodos del CRUD
	public List<Reserva> listarReservas(); //Listar All 
	
	public Reserva guardarReserva(Reserva reserva);	//Guarda un Reserva CREATE
	
	public Reserva reservaXID(String dni); //Leer datos de un Reserva READ
	
	public Reserva actualizarReserva(Reserva reserva); //Actualiza datos del Reserva UPDATE
	
	public void eliminarReserva(String id);// Elimina el Reserva DELETE

}
