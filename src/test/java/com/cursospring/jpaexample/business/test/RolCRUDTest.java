package com.cursospring.jpaexample.business.test;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cursospring.jpaexample.business.dao.IRolDAO;
import com.cursospring.jpaexample.business.entities.Rol;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-context.xml" })
public class RolCRUDTest {

	@Autowired
	IRolDAO rolDAO;

	@Test
	@Transactional
	@Rollback
	public void testCRUDRol() {
		Rol rol = new Rol();
		rol.setDescripcion("ROL_USUARIO");
		rolDAO.save(rol);
		Assert.assertEquals(rolDAO.count(), 2);
		Assert.assertEquals(rolDAO.findAll().iterator().next().getDescripcion(), "ROL_ADMINISTRADOR");
	}

}
