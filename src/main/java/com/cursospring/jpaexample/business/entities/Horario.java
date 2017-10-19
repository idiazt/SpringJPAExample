package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@Table(name="horario")
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
@GeneratedValue	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="hora_fin")
	private Date horaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="hora_inicio")
	private Date horaInicio;

	private String nombre;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="horario")
	private Set<Grupo> grupos;

	public Horario() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
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
		grupo.setHorario(this);

		return grupo;
	}

	public Grupo removeGrupo(Grupo grupo) {
		getGrupos().remove(grupo);
		grupo.setHorario(null);

		return grupo;
	}

}