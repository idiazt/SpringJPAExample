package com.cursospring.jpaexample.business.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursospring.jpaexample.business.dao.IRolDAO;
import com.cursospring.jpaexample.business.dao.IUsuarioDAO;
import com.cursospring.jpaexample.business.entities.Rol;
import com.cursospring.jpaexample.business.entities.Usuario;
import com.cursospring.jpaexample.business.service.IUsuarioService;
import com.cursospring.jpaexample.business.ws.dto.RolDTO;
import com.cursospring.jpaexample.business.ws.dto.UsuarioDTO;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	IUsuarioDAO usuarioDAO;
	@Autowired
	IRolDAO rolDAO;

	@Override
	@Transactional
	public UsuarioDTO save(UsuarioDTO dto) {
		Usuario usuario = toEntity(dto);
		usuario = usuarioDAO.save(usuario);
		return toDTO(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UsuarioDTO> getAll() {
		List<UsuarioDTO> result = new ArrayList<UsuarioDTO>();
		for (Usuario usuario : usuarioDAO.getAll()) {
			result.add(toDTO(usuario));
		}
		return result;
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioDTO getById(Long id) {
		return toDTO(usuarioDAO.getById(id));
	}
	
	private Usuario toEntity(UsuarioDTO dto) {
		Usuario usuario;
		if (dto.getId() != null)
			usuario = usuarioDAO.getById(dto.getId());
		else
			usuario = new Usuario();
		usuario.setNombre(dto.getNombre());
		if (dto.getRoles() != null && dto.getRoles().size() > 0) {
			for (RolDTO rolDTO : dto.getRoles()) {
				Rol rol;
				if (rolDTO.getId() != null)
					rol = rolDAO.getById(rolDTO.getId());
				else rol = new Rol();
				rol.setDescripcion(rolDTO.getDescripcion());
				usuario.getRols().add(rol);
			}
		}
		return usuario;
	}
	
	private UsuarioDTO toDTO(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setId(usuario.getId());
		dto.setNombre(usuario.getNombre());
		for (Rol rol : usuario.getRols()) {
			RolDTO rDTO = new RolDTO();
			rDTO.setId(rol.getId());
			rDTO.setDescripcion(rol.getDescripcion());
			dto.getRoles().add(rDTO);
		}
		return dto;
	}


}
