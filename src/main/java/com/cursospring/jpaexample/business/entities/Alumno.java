package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the alumno database table.
 * 
 */
@Entity
@Table(name="alumno")
@NamedQuery(name="Alumno.findAll", query="SELECT a FROM Alumno a")
public class Alumno extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	private String nombre;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="alumno")
	private Set<Matricula> matriculas;

	public Alumno() {
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

	public Set<Matricula> getMatriculas() {
		return this.matriculas;
	}

	public void setMatriculas(Set<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Matricula addMatricula(Matricula matricula) {
		getMatriculas().add(matricula);
		matricula.setAlumno(this);

		return matricula;
	}

	public Matricula removeMatricula(Matricula matricula) {
		getMatriculas().remove(matricula);
		matricula.setAlumno(null);

		return matricula;
	}

}