package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grupo database table.
 * 
 */
@Entity
@Table(name="grupo")
@NamedQuery(name="Grupo.findAll", query="SELECT g FROM Grupo g")
public class Grupo extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	//bi-directional many-to-one association to Aula
	@ManyToOne
	private Aula aula;

	//bi-directional many-to-one association to Curso
	@Id
	@ManyToOne
	private Curso curso;

	//bi-directional many-to-one association to CursoAcademico
	@Id
	@ManyToOne
	@JoinColumn(name="curso_academico_id")
	private CursoAcademico cursoAcademico;

	//bi-directional many-to-one association to Horario
	@Id
	@ManyToOne
	private Horario horario;

	//bi-directional many-to-one association to Profesor
	@ManyToOne
	private Profesor profesor;

	public Grupo() {
	}

	public Aula getAula() {
		return this.aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
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

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}