package org.bibliotecalivro.bibliotecalivro.controller;

import java.util.List;

import org.bibliotecalivro.bibliotecalivro.model.TB_EMPRESTIMO_LIVRO;
import org.bibliotecalivro.bibliotecalivro.repository.EmprestimoRepository;
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
@RequestMapping("/emprestimo") 
@CrossOrigin("*")
public class EmprestimoController {

	@Autowired
	private EmprestimoRepository repositoryEmprestimo;	
	
	@GetMapping
	public ResponseEntity<List<TB_EMPRESTIMO_LIVRO>> GetAll(){
		return ResponseEntity.ok(repositoryEmprestimo.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TB_EMPRESTIMO_LIVRO> GetById(@PathVariable long id){
		return repositoryEmprestimo.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	
	@PostMapping
	public ResponseEntity<TB_EMPRESTIMO_LIVRO> post(@RequestBody TB_EMPRESTIMO_LIVRO emprestimo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryEmprestimo.save(emprestimo));
	}
	
	@PutMapping
	public ResponseEntity<TB_EMPRESTIMO_LIVRO> put(@RequestBody TB_EMPRESTIMO_LIVRO emprestimo){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryEmprestimo.save(emprestimo));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositoryEmprestimo.deleteById(id);
	}
	
}
