package br.com.mmartini.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mmartini.RestController.ContatoRestController;
import br.com.mmartini.modal.Contato;
import br.com.mmartini.payload.ContatoPayload;
import br.com.mmartini.repository.ContatoRepository;

@Service
public class ContatoServiceImpl implements ContatoService {

	private static final Logger log = Logger.getLogger(ContatoRestController.class);

	@Autowired
	private ContatoRepository repositorio;

	@Override
	public Contato incluir(Contato contato) {
		return repositorio.save(contato);
	}

	@Override
	public boolean excluir(Contato contato) {
		try {
			repositorio.delete(contato);
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public Contato alterar(Contato contato) {
		return repositorio.save(contato);
	}

	@Override
	public Contato build(ContatoPayload payload) {
		Contato contato = new Contato(null, payload.getNome(), payload.getSobreNome(), payload.getEmpresa(),
				payload.getCargo(), payload.getEmail(), payload.getTelefone(), payload.getObservacao(),
				payload.getFoto());
		return contato;
	}

	@Override
	public List<Contato> listagem() {
		return repositorio.findAll();
	}

}
