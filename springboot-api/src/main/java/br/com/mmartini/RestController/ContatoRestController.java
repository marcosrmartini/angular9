package br.com.mmartini.RestController;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mmartini.modal.Contato;
import br.com.mmartini.payload.ContatoPayload;
import br.com.mmartini.service.ContatoService;

@RestController
@RequestMapping(value = "/contato")
public class ContatoRestController {
	
	private static final Logger log = Logger.getLogger(ContatoRestController.class);
	
	@Autowired
	private ContatoService service;
	
	@GetMapping
	public ResponseEntity<List<Contato>> listagem(){
		List<Contato> response = new ArrayList();
		try {
			response = service.listagem();
			if (response.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			} else {
				return ResponseEntity.ok().body(response);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<Contato> inclusao(@RequestBody ContatoPayload payload){
		Contato response = new Contato();
		try {
			
			response = service.incluir(service.build(payload));
			if (response.getIdContato() == null) {
				return ResponseEntity.status(HttpStatus.METHOD_FAILURE).build();
			} else {
				return ResponseEntity.ok().body(response);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.notFound().build();
	}

}
