package org.bibliotecalivro.bibliotecalivro.repository;

import java.util.List;

import org.bibliotecalivro.bibliotecalivro.model.TB_CLIENTE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<TB_CLIENTE, Long> {
	
public List<TB_CLIENTE>findAllByNm_clienteContainingIgnoreCase (String nm_cliente); 

}
