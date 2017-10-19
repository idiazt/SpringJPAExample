package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the matricula database table.
 * 
 */
@Entity
@Table(name="matricula")
@NamedQuery(name="Matricula.findAll", query="SELECT m FROM Matricula m")
public class Matricula extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	private String observaciones;

	//bi-directional many-to-one association to Alumno
	@ManyToOne
	private Alumno alumno;

	//bi-directional many-to-one association to Asignatura
	@ManyToOne
	private Asignatura asignatura;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	private Curso curso;

	//bi-directional many-to-one association to CursoAcademico
	@ManyToOne
	@JoinColumn(name="curso_academico_id")
	private CursoAcademico cursoAcademico;

	public Matricula() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Alumno getAlumno() {
		return this.alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public CursoAcademico getCursoAcademico() {
		return this.cursoAcademico;
	}

	public void setCursoAcademico(CursoAcademico cursoAcademico) {
		this.cursoAcademico = cursoAcademico;
	}

}