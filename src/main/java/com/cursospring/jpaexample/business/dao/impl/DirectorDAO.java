package com.cursospring.jpaexample.business.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cursospring.jpaexample.business.dao.AbstractCRUDJpaDao;
import com.cursospring.jpaexample.business.dao.IDirectorDAO;
import com.cursospring.jpaexample.business.entities.Director;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DirectorDAO extends AbstractCRUDJpaDao<Director> implements IDirectorDAO {

	@PostConstruct
	public void addClazz() {
		setClazz(Director.class);
	}
}
