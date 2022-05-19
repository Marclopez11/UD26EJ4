package com.example.UD26EJ3.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="facultad")//en caso que la tabala sea diferente
public class Facultad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int  id;
	
	@Column(name = "nombre")
	private String nombre;
	

	
	@OneToMany
	@JoinColumn(name="id") 
	private List<Investigador> investigadores;

	
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Equipo> equipos;
	
	//referencia investigadores
	


	
	public Facultad() {
		super();
	}


	
	
	






	
	

	public Facultad(int id, String nombre, List<Investigador> investigadores, List<Equipo> equipos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}














	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	
	public List<Investigador> getInvestigador() {
		return investigadores;
	}



	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public void setInvestigador(List<Investigador> investigador) {
		this.investigadores = investigador;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	public List<Equipo> getEquipo() {
		return equipos;
	}

	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")

	public void setEquipo(List<Equipo> equipo) {
		this.equipos = equipo;
	}


	
	
	
	
	
	
	
	

}
