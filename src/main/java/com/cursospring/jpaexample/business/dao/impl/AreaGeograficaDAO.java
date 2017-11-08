package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IAreaGeograficaDAO;
import com.cursospring.jpaexample.business.entities.AreaGeografica;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AreaGeograficaDAO extends AbstractCRUDJpaDao<AreaGeografica> implements IAreaGeograficaDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(AreaGeografica.class);
	}
}
