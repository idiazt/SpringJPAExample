package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the profesor database table.
 * 
 */
@Entity
@Table(name="profesor")
@NamedQuery(name="Profesor.findAll", query="SELECT p FROM Profesor p")
public class Profesor extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	private String nombre;

	//bi-directional many-to-many association to Asignatura
	@ManyToMany(mappedBy="profesors")
	private Set<Asignatura> asignaturas;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="profesor")
	private Set<Grupo> grupos;

	public Profesor() {
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

	public Set<Asignatura> getAsignaturas() {
		return this.asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Set<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Grupo addGrupo(Grupo grupo) {
		getGrupos().add(grupo);
		grupo.setProfesor(this);

		return grupo;
	}

	public Grupo removeGrupo(Grupo grupo) {
		getGrupos().remove(grupo);
		grupo.setProfesor(null);

		return grupo;
	}

}