package com.cursospring.jpaexample.business.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="area_gestion")
public class AreaGestion extends AbstractEntity {

	private static final long serialVersionUID = -2301226334587122875L;

	@Id
	@ManyToOne(targetEntity = Director.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "director_id")
	private Director director;
	
	@Id
	@ManyToOne(targetEntity = AreaGeografica.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "area_geografica_id")
	private AreaGeografica areaGeografica;
	
	@Id
	@ManyToOne(targetEntity = AreaNegocio.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "area_negocio_id")
	private AreaNegocio areaNegocio;

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public AreaGeografica getAreaGeografica() {
		return areaGeografica;
	}

	public void setAreaGeografica(AreaGeografica areaGeografica) {
		this.areaGeografica = areaGeografica;
	}

	public AreaNegocio getAreaNegocio() {
		return areaNegocio;
	}

	public void setAreaNegocio(AreaNegocio areaNegocio) {
		this.areaNegocio = areaNegocio;
	}
}