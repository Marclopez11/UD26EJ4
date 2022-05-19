package com.example.UD26EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UD26EJ3.dao.IFacultadDAO;
import com.example.UD26EJ3.dto.Facultad;

@Service

public class FacultadServiceImpl implements IFacultadService{

	@Autowired
	IFacultadDAO iFacultadDAO;
	
	
	@Override
	public List<Facultad> listarFacultads() {
		// TODO Auto-generated method stub
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadXID(Long codigo) {
		// TODO Auto-generated method stub
		return iFacultadDAO.findById(codigo).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return  iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(Long id) {
		iFacultadDAO.deleteById(id);
		
	}

}
