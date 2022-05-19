package com.example.UD26EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UD26EJ3.dao.IEquipoDAO;
import com.example.UD26EJ3.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{
	
	
	@Autowired
	IEquipoDAO iEquipoDAO;
	
	
	@Override
	public List<Equipo> listarEquipos() {
		// TODO Auto-generated method stub
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		return iEquipoDAO.save(equipo);
	}

	public Equipo equipoXID(String numerserie) {
		// TODO Auto-generated method stub
		return iEquipoDAO.findById(numerserie).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String numerserie) {
		// TODO Auto-generated method stub
		iEquipoDAO.deleteById(numerserie);

		
	}

}
