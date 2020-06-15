package org.bibliotecalivro.bibliotecalivro.controller;

import java.util.List;

import org.bibliotecalivro.bibliotecalivro.model.TB_CLIENTE;
import org.bibliotecalivro.bibliotecalivro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cliente")
@CrossOrigin("*") 

public class ClienteController {
	
@Autowired	
private ClienteRepository repository;

@GetMapping
public ResponseEntity<List<TB_CLIENTE>> GetAll(){
	return ResponseEntity.ok(repository.findAll());
	}


@GetMapping("/{id}")
public ResponseEntity<TB_CLIENTE> GetById(@PathVariable long id){
	return repository.findById(id)
			.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
}

@GetMapping("/titulo/{titulo}")
public ResponseEntity<List<TB_CLIENTE>> GetByTitulo(@PathVariable String nome){
	return ResponseEntity.ok(repository.findAllByNm_clienteContainingIgnoreCase(nome));
}

@PostMapping
public ResponseEntity<TB_CLIENTE> post(@RequestBody TB_CLIENTE cliente){
	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
}

@PutMapping
public ResponseEntity<TB_CLIENTE> put(@RequestBody TB_CLIENTE cliente){
	return ResponseEntity.status(HttpStatus.OK).body(repository.save(cliente));
}

@DeleteMapping("/{id}")
public void delete(@PathVariable long id) {
	repository.deleteById(id);
}

}
