package org.bibliotecalivro.bibliotecalivro.repository;

import org.bibliotecalivro.bibliotecalivro.model.TB_EMPRESTIMO_LIVRO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmprestimoRepository extends JpaRepository<TB_EMPRESTIMO_LIVRO, Long> {

}
