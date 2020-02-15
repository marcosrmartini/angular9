package br.com.mmartini.service;

import java.util.List;

import br.com.mmartini.modal.Contato;
import br.com.mmartini.payload.ContatoPayload;

public interface ContatoService {
	
	public Contato incluir(Contato contato);
	public boolean excluir(Contato contato);
	public Contato alterar(Contato contato);
	public List<Contato> listagem();
	
	public Contato build(ContatoPayload payload);

}
