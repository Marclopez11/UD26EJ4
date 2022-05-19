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
@Table(name="investigadores")//en caso que la tabala sea diferente
public class Investigador {
	
	//pasado de List a string
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	
	@Column(name = "nomapels")
	private String nomapels;
	
	
	@ManyToOne
	@JoinColumn(name = "facultad")
	Facultad facultad;

	@OneToMany
	@JoinColumn(name = "id")
	List<Reserva> listaReservas;
	
	
	public Investigador() {
		super();
	
	}




	


	public Investigador(int id, String nomapels, Facultad facultad, List<Reserva> listaReservas) {
		super();
		this.id = id;
		this.nomapels = nomapels;
		this.facultad = facultad;
		this.listaReservas = listaReservas;
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


	public List<Reserva> getListaReservas() {
		return listaReservas;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	

}