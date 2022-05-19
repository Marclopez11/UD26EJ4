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
	private Long codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Equipo> equipo;


	
	public Facultad() {
		super();
	}


	public Facultad(Long codigo, String nombre, List<Equipo> equipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.equipo = equipo;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipo() {
		return equipo;
	}

	
	


	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}


	@Override
	public String toString() {
		return "Facultad [codigo=" + codigo + ", nombre=" + nombre + ", equipo=" + equipo + "]";
	}
	
	
	
	
	
	
	
	

}
