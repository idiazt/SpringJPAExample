package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IAreaNegocioDAO;
import com.cursospring.jpaexample.business.entities.AreaNegocio;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AreaNegocioDAO extends AbstractCRUDJpaDao<AreaNegocio> implements IAreaNegocioDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(AreaNegocio.class);
	}
}
