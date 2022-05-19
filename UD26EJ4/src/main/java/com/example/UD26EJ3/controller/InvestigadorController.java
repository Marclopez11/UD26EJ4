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

import com.example.UD26EJ3.dto.Investigador;
import com.example.UD26EJ3.service.InvestigadorServiceImpl;
@RestController
@RequestMapping("/api")
public class  InvestigadorController{
	
	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;
	
	
	
	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigadores(){
		return investigadorServiceImpl.listarInvestigadors();
	}
	
	
	@PostMapping("/investigadores")
	public Investigador salvarInvestigador(@RequestBody Investigador investigador) {
		
		return investigadorServiceImpl.guardarInvestigador(investigador);
	}
	
	
	@GetMapping("/investigador/{id}")
	public Investigador investigadorXID(@PathVariable(name="id") String dni) {
		
		Investigador Investgador_xid= new Investigador();
		
		Investgador_xid=investigadorServiceImpl.investigadorXID(dni);
		
		//System.out.println("Investigador XID: "+Investgador_xid);
		
		return Investgador_xid;
	}
	
	@PutMapping("/investigador/{id}")
	public Investigador actualizarInvestigador(@PathVariable(name="id") String dni,@RequestBody Investigador investigador) {
		
		Investigador Investigador_seleccionado= new Investigador();
		Investigador Investigador_actualizado= new Investigador();
		
		Investigador_seleccionado= investigadorServiceImpl.investigadorXID(dni);
		
		Investigador_seleccionado.setNomapels(investigador.getNomapels());
		Investigador_seleccionado.setFacultad(investigador.getFacultad());

		
		Investigador_actualizado = investigadorServiceImpl.actualizarInvestigador(Investigador_seleccionado);
		
		//System.out.println("El investigador actualizado es: "+ Investigador_actualizado);
		
		return Investigador_actualizado;
	}
	
	@DeleteMapping("/investigador/{id}")
	public void eleiminarInvestigador(@PathVariable(name="id") String dni) {
		investigadorServiceImpl.eliminarInvestigador(dni);
	}


}
