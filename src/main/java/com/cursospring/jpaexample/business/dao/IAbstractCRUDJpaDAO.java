package com.cursospring.jpaexample.business.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;


public interface IAbstractCRUDJpaDAO<T extends Serializable> extends CrudRepository<T, Long>{

}
