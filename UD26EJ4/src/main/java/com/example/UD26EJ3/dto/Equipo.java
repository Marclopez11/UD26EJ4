package com.example.UD26EJ3.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
@Table(name="equipos")//en caso que la tabala sea diferente
public class Equipo {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	

	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	
	@ManyToOne
	@JoinColumn(name = "facultad")
	Facultad facultad;
	 
	 
	 
	@OneToMany
    @JoinColumn(name="id")
    private List<Reserva> reserva;


	
	
	public Equipo() {
		super();
	
	}



	


	public Equipo(int id, String nombre, Facultad facultad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.facultad = facultad;
	}
	
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}






	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Facultad getFacultad() {
		return facultad;
	}



	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}



	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}
	
	
	
	

	



	
	
	
	
	
	
	
	
	
	
	
	

}