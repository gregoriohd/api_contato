package br.com.gregoriohd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gregoriohd.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, String> {

}
