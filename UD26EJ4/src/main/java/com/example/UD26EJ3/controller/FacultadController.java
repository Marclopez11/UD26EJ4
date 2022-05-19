package com.example.UD26EJ3.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UD26EJ3.dto.Facultad;
import com.example.UD26EJ3.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController{
	
	
	
	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	
	
	@GetMapping("/facultades")
	public List<Facultad> listarFacultades(){
		return facultadServiceImpl.listarFacultads();
	}
	
	
	@PostMapping("/facultades")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {
		
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	
	@GetMapping("/facultad/{codigo}")
	public Facultad facultadXID(@PathVariable(name="codigo") Long codigo) {
		
		Facultad Facultad_xid= new Facultad();
		
		Facultad_xid=facultadServiceImpl.facultadXID(codigo);
		
	//	System.out.println("Facultad XID: "+Facultad_xid);
		
		return Facultad_xid;
	}
	
	@PutMapping("/facultad/{codigo}")
	public Facultad actualizarFacultad(@PathVariable(name="codigo") Long codigo,@RequestBody Facultad facultad) {
		
		Facultad Facultad_seleccionado= new Facultad();
		Facultad Facultad_actualizado= new Facultad();
		
		Facultad_seleccionado= facultadServiceImpl.facultadXID(codigo);
		
		Facultad_seleccionado.setNombre(facultad.getNombre());
		Facultad_seleccionado.setCodigo(facultad.getCodigo());
		Facultad_seleccionado.setEquipo(facultad.getEquipo());

		
		Facultad_actualizado = facultadServiceImpl.actualizarFacultad(Facultad_seleccionado);
		
	//	System.out.println("El Curso actualizado es: "+ Facultad_actualizado);
		
		return Facultad_actualizado;
	}
	
	@DeleteMapping("/facultad/{codigo}")
	public void eleiminarFacultad(@PathVariable(name="codigo") Long codigo) {
		facultadServiceImpl.eliminarFacultad(codigo);
	}


}
