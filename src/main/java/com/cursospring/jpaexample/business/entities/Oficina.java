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
@Table(name="oficina")
public class Oficina extends AbstractEntity {

	private static final long serialVersionUID = -2828051208883622263L;

	@Id
	@GeneratedValue	
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = AreaGeografica.class)
	@JoinColumn(name = "area_geografica_id")
	private AreaGeografica areaGeografica;


	public Oficina() {
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

	public AreaGeografica getAreaGeografica() {
		return areaGeografica;
	}

	public void setAreaGeografica(AreaGeografica areaGeografica) {
		this.areaGeografica = areaGeografica;
	}

}