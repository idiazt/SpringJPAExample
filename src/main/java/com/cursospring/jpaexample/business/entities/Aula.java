package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the aula database table.
 * 
 */
@Entity
@Table(name="aula")
@NamedQuery(name="Aula.findAll", query="SELECT a FROM Aula a")
public class Aula extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	private String nombre;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="aula")
	private Set<Grupo> grupos;

	public Aula() {
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

	public Set<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Grupo addGrupo(Grupo grupo) {
		getGrupos().add(grupo);
		grupo.setAula(this);

		return grupo;
	}

	public Grupo removeGrupo(Grupo grupo) {
		getGrupos().remove(grupo);
		grupo.setAula(null);

		return grupo;
	}

}