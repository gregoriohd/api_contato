package br.com.gregoriohd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gregoriohd.model.Contato;
import br.com.gregoriohd.service.ContatoService;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService contatoService;
	
	@GetMapping
	public List<Contato> listarContatos(){
		return contatoService.listaContatos();		
	}
	
	@GetMapping("/{email}")
	public Optional<Contato> obterContato(@PathVariable String email) {
		return contatoService.obterContato(email);
	}
	
	@PostMapping
	public Contato adicionar(@RequestBody Contato contato) {
		return contatoService.adicionar(contato);
	}
	
	@PutMapping("/{email}")
	public Contato atualizar(@PathVariable String email, @RequestBody Contato contato) {
		return contatoService.atualizar(email, contato);
	}
	
	@DeleteMapping("/{email}")
	public void remover(@PathVariable String email) {
		contatoService.remover(email);
	}

}
