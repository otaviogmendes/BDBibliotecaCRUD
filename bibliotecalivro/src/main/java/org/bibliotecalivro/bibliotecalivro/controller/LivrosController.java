package org.bibliotecalivro.bibliotecalivro.controller;

import java.util.List;

import org.bibliotecalivro.bibliotecalivro.model.TB_LIVRO;
import org.bibliotecalivro.bibliotecalivro.repository.LivroRepository;
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
@RequestMapping("/livro") 
@CrossOrigin("*")
public class LivrosController {

	@Autowired 
	private LivroRepository repository;	
	
	@GetMapping
	public ResponseEntity<List<TB_LIVRO>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TB_LIVRO> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeLivro/{nomeLivro}")
	public ResponseEntity<List<TB_LIVRO>> GetByTitulo(@PathVariable String nm_livro){
		return ResponseEntity.ok(repository.findAllByNomeLivroContainingIgnoreCase(nm_livro));
	}
	
	@PostMapping
	public ResponseEntity<TB_LIVRO> post(@RequestBody TB_LIVRO livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(livro));
	}
	
	@PutMapping
	public ResponseEntity<TB_LIVRO> put(@RequestBody TB_LIVRO livro){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(livro));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
