package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IOficinaDAO;
import com.cursospring.jpaexample.business.entities.Oficina;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class OficinaDAO extends AbstractCRUDJpaDao<Oficina> implements IOficinaDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(Oficina.class);
	}
}
