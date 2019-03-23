package com.pessoa.pessoa.controle;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoa.pessoa.modelo.Usuario;
import com.pessoa.pessoa.repository.usuariorepository;


@RequestMapping(value="/api")
@RestController
public class PessoaRest {
	
	// instanciar o repositório
	@Autowired
	usuariorepository us;
	
	@GetMapping("/usuario")
	public List<Usuario> listarusuario(){
		
		return us.findAll();
		
	}
	
	@PostMapping("/usuario")
	public Usuario salvarusuario(@RequestBody @Valid Usuario usuario) {
		return us.save(usuario);
	}
	
    
	@DeleteMapping("/usuario")
	public void deletarusuario(@RequestBody @Valid Usuario usuario) {
	    us.delete(usuario);
	}
	
	@PutMapping("/usuario")
	public Usuario alterarusuario(@RequestBody @Valid Usuario usuario) {
	   return us.save(usuario);
	}
	
	
	
	
	/*
	 get -> url
	 post > formulário(salvar)
	 put -> update(alterar)
	 delete -> deletar 
	 
	 */
	

}
