package com.example.UD26EJ3.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="investigadores")//en caso que la tabala sea diferente
public class Investigador {
	
	@Id
	@OneToMany
	@JoinColumn(name="dni")
	private List<Reserva> dni;
	
	
	@Column(name = "nomapels")
	private String nomapels;
	
	
	@ManyToOne
	@JoinColumn(name = "id_facultad")
	Facultad facultad;

	
	
	public Investigador() {
		super();
	
	}

	public Investigador(List<Reserva> dni, String nomapels, Facultad facultad) {
		super();
		this.dni = dni;
		this.nomapels = nomapels;
		this.facultad = facultad;
	}

	
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getDni() {
		return dni;
	}

	public void setDni(List<Reserva> dni) {
		this.dni = dni;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	
	
	
	
	
	
	
	

}
