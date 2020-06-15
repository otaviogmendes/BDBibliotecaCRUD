package org.bibliotecalivro.bibliotecalivro.repository;

import java.util.List;


import org.bibliotecalivro.bibliotecalivro.model.TB_LIVRO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface LivroRepository extends JpaRepository<TB_LIVRO, Long> {

	public List<TB_LIVRO>findAllByNomeLivroContainingIgnoreCase(String nm_livro);

	

	
}
