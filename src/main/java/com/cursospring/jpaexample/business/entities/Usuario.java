package com.cursospring.jpaexample.business.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue	
	private Long id;

	private String nombre;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
		name="usuario_rol"
		, joinColumns={
			@JoinColumn(name="usuario_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="rol_id")
			}
		)
	private Set<Rol> roles = new LinkedHashSet<Rol>();

	public Usuario() {
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

	public Set<Rol> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

}