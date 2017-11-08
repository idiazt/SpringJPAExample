package com.cursospring.jpaexample.business.test;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cursospring.jpaexample.business.dao.IAreaGeograficaDAO;
import com.cursospring.jpaexample.business.dao.IAreaNegocioDAO;
import com.cursospring.jpaexample.business.dao.IDirectorDAO;
import com.cursospring.jpaexample.business.dao.IRolDAO;
import com.cursospring.jpaexample.business.entities.AreaGeografica;
import com.cursospring.jpaexample.business.entities.AreaGestion;
import com.cursospring.jpaexample.business.entities.AreaNegocio;
import com.cursospring.jpaexample.business.entities.Director;
import com.cursospring.jpaexample.business.entities.Rol;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-context.xml" })
public class CRUDTest {

	@Autowired
	IRolDAO rolDAO;
	@Autowired
	IDirectorDAO directorDAO;
	@Autowired
	IAreaGeograficaDAO areaGeograficaDAO;
	@Autowired
	IAreaNegocioDAO areaNegocioDAO;

	@Test
	@Transactional
	@Rollback
	public void testCRUDRol() {
		long size = rolDAO.count();
		Rol rol = new Rol();
		rol.setDescripcion("ROL_USUARIO");
		rolDAO.save(rol);
		Assert.assertEquals(size+1, rolDAO.count());
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testCRUDDirector() {
		AreaGeografica geo = new AreaGeografica();
		geo.setNombre("AREA_GEO_1");
		AreaGeografica resGeo = areaGeograficaDAO.save(geo);
		
		AreaNegocio negocio = new AreaNegocio();
		negocio.setNombre("FINANZAS");
		AreaNegocio resNegocio = areaNegocioDAO.save(negocio);
		
		Director director = new Director();
		director.setNombre("DIRECTOR_1");
		AreaGestion gestion = new AreaGestion();
		gestion.setAreaGeografica(resGeo);
		gestion.setAreaNegocio(resNegocio);
		gestion.setDirector(director);
		director.getAreasGestion().add(gestion);
		Director resDirector = directorDAO.save(director);
		Assert.assertEquals(resDirector.getAreasGestion().size(), 1);
		Assert.assertEquals(resDirector.getNombre(), "DIRECTOR_1");
		resDirector.getAreasGestion().clear();
		Director res2Director = directorDAO.save(resDirector);
		Assert.assertEquals(res2Director.getAreasGestion().size(), 0);
	}

}
