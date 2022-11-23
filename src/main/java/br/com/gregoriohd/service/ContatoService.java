package br.com.gregoriohd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gregoriohd.model.Contato;
import br.com.gregoriohd.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	
	public List<Contato> listaContatos() {
		return contatoRepository.listaContatos();		
	}

	public Optional<Contato> obterContato(String email) {
		return contatoRepository.obterContato(email);
	}

	public Contato adicionar(Contato contato) {
		return contatoRepository.adicionar(contato);		
	}
	
	public Contato atualizar(String emial, Contato contato) {
		contato.setEmail(emial);
		return contatoRepository.atualizar(contato);
	}
	
	public void remover(String email) {
		contatoRepository.remover(email);		
	}
}
