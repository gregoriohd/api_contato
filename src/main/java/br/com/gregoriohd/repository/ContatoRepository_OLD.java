package br.com.gregoriohd.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.gregoriohd.exception.ResourceNotFoundExceptioon;
import br.com.gregoriohd.model.Contato;

@Repository
@Deprecated
public class ContatoRepository_OLD {

	private List<Contato> contatos;

	public ContatoRepository_OLD() {
		this.contatos = new ArrayList<>();
	}

	public List<Contato> listaContatos() {
		return contatos;
	}

	public Optional<Contato> obterContato(String email) {
		return contatos.stream().filter(contato -> contato.getEmail().equalsIgnoreCase(email)).findFirst();
	}

	public Contato adicionar(Contato contato) {
		contatos.add(contato);
		return contato;
	}
	
	public Contato atualizar(Contato contato) {
		
		Optional<Contato> contatoEncontrado = obterContato(contato.getEmail());
		
		if(contatoEncontrado.isEmpty()) {
			throw new ResourceNotFoundExceptioon("Contato não encontrado");
		}
		
		remover(contato.getEmail());
		adicionar(contato);
		
		return contato;
	}
	
	public void remover(String email) {
		contatos.removeIf(contato -> contato.getEmail().equalsIgnoreCase(email));
		
	}

}
