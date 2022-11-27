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
		return contatoRepository.findAll();		
	}

	public Optional<Contato> obterContato(String email) {
		return contatoRepository.findById(email);
	}

	public Contato adicionar(Contato contato) {
		return contatoRepository.save(contato);		
	}
	
	public Contato atualizar(String emial, Contato contato) {
		contato.setEmail(emial);
		return contatoRepository.save(contato);
	}
	
	public void remover(String email) {
		contatoRepository.deleteById(email);		
	}
}
