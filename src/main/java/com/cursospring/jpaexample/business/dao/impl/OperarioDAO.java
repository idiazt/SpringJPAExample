package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IOperarioDAO;
import com.cursospring.jpaexample.business.entities.Operario;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class OperarioDAO extends AbstractCRUDJpaDao<Operario> implements IOperarioDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(Operario.class);
	}
}
