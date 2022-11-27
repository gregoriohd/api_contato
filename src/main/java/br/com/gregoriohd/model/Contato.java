package br.com.gregoriohd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contato {
	
	private String nome;
	
	@Id
	private String email;
	
	private String telefone;
	
	private Boolean whatsApp;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(Boolean whatsApp) {
		this.whatsApp = whatsApp;
	}

}
