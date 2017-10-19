package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the curso database table.
 * 
 */
@Entity
@Table(name="curso")
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	private String nombre;

	//bi-directional many-to-one association to Asignatura
	@OneToMany(mappedBy="curso")
	private Set<Asignatura> asignaturas;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="curso")
	private Set<Grupo> grupos;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="curso")
	private Set<Matricula> matriculas;

	public Curso() {
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

	public Asignatura addAsignatura(Asignatura asignatura) {
		getAsignaturas().add(asignatura);
		asignatura.setCurso(this);

		return asignatura;
	}

	public Asignatura removeAsignatura(Asignatura asignatura) {
		getAsignaturas().remove(asignatura);
		asignatura.setCurso(null);

		return asignatura;
	}

	public Set<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Grupo addGrupo(Grupo grupo) {
		getGrupos().add(grupo);
		grupo.setCurso(this);

		return grupo;
	}

	public Grupo removeGrupo(Grupo grupo) {
		getGrupos().remove(grupo);
		grupo.setCurso(null);

		return grupo;
	}

	public Set<Matricula> getMatriculas() {
		return this.matriculas;
	}

	public void setMatriculas(Set<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Matricula addMatricula(Matricula matricula) {
		getMatriculas().add(matricula);
		matricula.setCurso(this);

		return matricula;
	}

	public Matricula removeMatricula(Matricula matricula) {
		getMatriculas().remove(matricula);
		matricula.setCurso(null);

		return matricula;
	}

}