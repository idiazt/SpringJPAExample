package com.cursospring.jpaexample.business.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.jpaexample.business.service.IUsuarioService;
import com.cursospring.jpaexample.business.ws.dto.UsuarioDTO;

@RestController
@RequestMapping("/services/usuario")
public class UsuarioRESTController {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@RequestMapping(value = "/alta", method = RequestMethod.POST)
    public @ResponseBody UsuarioDTO altaUsuario(@RequestBody UsuarioDTO dto)
            throws Exception {
        return usuarioService.save(dto);
    }
	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
    public @ResponseBody List<UsuarioDTO> getTodosFiltro() throws Exception {
        return usuarioService.getAll();
    }
	
	@RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    public @ResponseBody UsuarioDTO getUsuarioById(
            @PathVariable("idUsuario") Long idUsuario) throws Exception {
        return usuarioService.getById(idUsuario);
    }
}
