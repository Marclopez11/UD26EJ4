package com.example.UD26EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UD26EJ3.dao.IReservaDAO;
import com.example.UD26EJ3.dto.Reserva;

@Service

public class ReservaServiceImpl implements IReservaService{
	
	
	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReservas() {
		// TODO Auto-generated method stub
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva reservaXID(String dni) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(dni).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(String dni) {
		iReservaDAO.deleteById(dni);
		
	}

}
