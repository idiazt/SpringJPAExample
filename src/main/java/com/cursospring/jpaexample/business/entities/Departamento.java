package com.cursospring.jpaexample.business.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="departamento")
public class Departamento extends AbstractEntity {

	private static final long serialVersionUID = -5040576118308554646L;

	@Id
	@GeneratedValue	
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Operario> operarios = new LinkedHashSet<Operario>();
	
	@OneToOne(mappedBy = "departamento", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "director_id")
	private Director director;


	public Departamento() {
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

	public Set<Operario> getOperarios() {
		return operarios;
	}

	public void setOperarios(Set<Operario> operarios) {
		this.operarios = operarios;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

}