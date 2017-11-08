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
@Table(name="director")
public class Director extends AbstractEntity {

	private static final long serialVersionUID = -7625814269988305826L;

	@Id
	@GeneratedValue	
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "director")
	private Set<AreaGestion> areasGestion = new LinkedHashSet<AreaGestion>();
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;


	public Director() {
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

	public Set<AreaGestion> getAreasGestion() {
		return areasGestion;
	}

	public void setAreasGestion(Set<AreaGestion> areasGestion) {
		this.areasGestion = areasGestion;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}