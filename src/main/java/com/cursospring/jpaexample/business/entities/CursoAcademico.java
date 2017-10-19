package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the curso_academico database table.
 * 
 */
@Entity
@Table(name="curso_academico")
@NamedQuery(name="CursoAcademico.findAll", query="SELECT c FROM CursoAcademico c")
public class CursoAcademico extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_fin")
	private Date fechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	private String nombre;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="cursoAcademico")
	private Set<Grupo> grupos;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="cursoAcademico")
	private Set<Matricula> matriculas;

	public CursoAcademico() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
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
		grupo.setCursoAcademico(this);

		return grupo;
	}

	public Grupo removeGrupo(Grupo grupo) {
		getGrupos().remove(grupo);
		grupo.setCursoAcademico(null);

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
		matricula.setCursoAcademico(this);

		return matricula;
	}

	public Matricula removeMatricula(Matricula matricula) {
		getMatriculas().remove(matricula);
		matricula.setCursoAcademico(null);

		return matricula;
	}

}