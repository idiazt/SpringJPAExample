package com.cursospring.jpaexample.business.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="area_geografica")
public class AreaGeografica extends AbstractEntity {

	private static final long serialVersionUID = -102626047982114804L;

	@Id
	@GeneratedValue	
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "areaGeografica", fetch = FetchType.LAZY, orphanRemoval = true)
	private Set<Oficina> oficinas = new LinkedHashSet<Oficina>();


	public AreaGeografica() {
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

	public Set<Oficina> getOficinas() {
		return oficinas;
	}

	public void setOficinas(Set<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

}