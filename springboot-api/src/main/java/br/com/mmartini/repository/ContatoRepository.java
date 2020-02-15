package br.com.mmartini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mmartini.modal.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
