package com.cursospring.jpaexample.business.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface IAbstractCRUDJpaDAO<T extends Serializable> extends CrudRepository<T, Long>{

	T getById(long id);

	List<T> getAll();

}
