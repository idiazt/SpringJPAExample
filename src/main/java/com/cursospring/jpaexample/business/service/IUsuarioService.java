package com.cursospring.jpaexample.business.service;

import java.util.List;

import com.cursospring.jpaexample.business.ws.dto.UsuarioDTO;

public interface IUsuarioService {
	
	public UsuarioDTO save(UsuarioDTO usuario);
	public List<UsuarioDTO> getAll();
	public UsuarioDTO getById(Long id);

}
