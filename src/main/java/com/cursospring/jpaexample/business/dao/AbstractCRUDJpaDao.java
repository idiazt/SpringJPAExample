package com.cursospring.jpaexample.business.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractCRUDJpaDao<T extends Serializable> implements IAbstractCRUDJpaDAO<T> {

	private Class<T> clazz;

	@PersistenceContext
	EntityManager entityManager;

	public void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T getById(long id) {
		return entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	@Override
	public <S extends T> S save(S entity) {
		entityManager.persist(entity);
		return entity;
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public void delete(T entity) {
		entityManager.remove(entity);
	}

	public void deleteById(Long entityId) {
		T entity = getById(entityId);
		delete(entity);
	}

	@Override
	public long count() {
		return findAll().size();
	}

	@Override
	public void deleteAll() {
		for (T obj : findAll()) {
			delete(obj);
		}
	}

	@Override
	public void deleteAll(Iterable<? extends T> list) {
		for (T obj : list)
			delete(obj);
	}

	@Override
	public boolean existsById(Long id) {
		try {
			if (getById(id) != null) 
				return true;
			else return false;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Iterable<T> findAllById(Iterable<Long> ids) {
		List<T> result = new ArrayList<T>();
		for (Long id : ids)
			result.add(getById(id));
		return result;
	}

	@Override
	public Optional<T> findById(Long id) {
		//unused
		return null;
	}

	@Override
	public <S extends T> Iterable<S> saveAll(Iterable<S> values) {
		for (T s : values)
			s = save(s);
		return values;
	}
}
