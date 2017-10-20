package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IUsuarioDAO;
import com.cursospring.jpaexample.business.entities.Usuario;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class UsuarioDAO extends AbstractCRUDJpaDao<Usuario> implements IUsuarioDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(Usuario.class);
	}
}
