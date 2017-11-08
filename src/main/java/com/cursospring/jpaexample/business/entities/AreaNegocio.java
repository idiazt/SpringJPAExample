package com.cursospring.jpaexample.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="area_negocio")
public class AreaNegocio extends AbstractEntity {


	private static final long serialVersionUID = 8420528885629341395L;

	@Id
	@GeneratedValue	
	private Long id;

	@Column(name = "nombre")
	private String nombre;


	public AreaNegocio() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}