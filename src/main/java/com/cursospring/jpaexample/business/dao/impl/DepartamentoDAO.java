package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IDepartamentoDAO;
import com.cursospring.jpaexample.business.entities.Departamento;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DepartamentoDAO extends AbstractCRUDJpaDao<Departamento> implements IDepartamentoDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(Departamento.class);
	}
}
