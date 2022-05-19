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

import com.example.UD26EJ3.dto.Reserva;
import com.example.UD26EJ3.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class  ReservaController{
	
	
	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	
	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas(){
		return reservaServiceImpl.listarReservas();
	}
	
	
	@PostMapping("/Reserva")
	public Reserva salvarReserva(@RequestBody Reserva reserva) {
		
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	
	@GetMapping("/reserva/{dni}")
	public Reserva reservaXID(@PathVariable(name="dni") String dni) {
		
		Reserva Reserva_xid= new Reserva();
		
		Reserva_xid=reservaServiceImpl.reservaXID(dni);
		
		System.out.println("Reserva XID: "+Reserva_xid);
		
		return Reserva_xid;
	}
	
	@PutMapping("/reserva/{dni}")
	public Reserva actualizarReserva(@PathVariable(name="dni") String dni,@RequestBody Reserva reserva) {
		
		Reserva Reserva_seleccionado= new Reserva();
		Reserva Reserva_actualizado= new Reserva();
		
		Reserva_seleccionado= reservaServiceImpl.reservaXID(dni);
		
		Reserva_seleccionado.setInvestigador(reserva.getInvestigador());
		Reserva_seleccionado.setEquipo(reserva.getEquipo());
		Reserva_seleccionado.setComienzoAt(reserva.getComienzoAt());
		Reserva_seleccionado.setFinAt(reserva.getFinAt());


		
		Reserva_actualizado = reservaServiceImpl.actualizarReserva(Reserva_seleccionado);
		
		System.out.println("La reserva actualizado es: "+ Reserva_actualizado);
		
		return Reserva_actualizado;
	}
	
	@DeleteMapping("/reserva/{dni}")
	public void eleiminarReserva(@PathVariable(name="dni") String dni) {
		reservaServiceImpl.eliminarReserva(dni);
	}


}
