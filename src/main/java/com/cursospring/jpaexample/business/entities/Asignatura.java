package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the asignatura database table.
 * 
 */
@Entity
@Table(name="asignatura")
@NamedQuery(name="Asignatura.findAll", query="SELECT a FROM Asignatura a")
public class Asignatura extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	private String nombre;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	private Curso curso;

	//bi-directional many-to-many association to Profesor
	@ManyToMany
	@JoinTable(
		name="asignatura_profesor"
		, joinColumns={
			@JoinColumn(name="asignatura_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="profesor_id")
			}
		)
	private Set<Profesor> profesors;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="asignatura")
	private Set<Matricula> matriculas;

	public Asignatura() {
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

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Set<Profesor> getProfesors() {
		return this.profesors;
	}

	public void setProfesors(Set<Profesor> profesors) {
		this.profesors = profesors;
	}

	public Set<Matricula> getMatriculas() {
		return this.matriculas;
	}

	public void setMatriculas(Set<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Matricula addMatricula(Matricula matricula) {
		getMatriculas().add(matricula);
		matricula.setAsignatura(this);

		return matricula;
	}

	public Matricula removeMatricula(Matricula matricula) {
		getMatriculas().remove(matricula);
		matricula.setAsignatura(null);

		return matricula;
	}

}