package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IRolDAO;
import com.cursospring.jpaexample.business.entities.Rol;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class RolDAO extends AbstractCRUDJpaDao<Rol> implements IRolDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(Rol.class);
	}
}
