package com.cursospring.jpaexample.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="operario")
public class Operario extends AbstractEntity {

	private static final long serialVersionUID = 4037265005971747157L;

	@Id
	@GeneratedValue	
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne(targetEntity = Departamento.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;


	public Operario() {
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}