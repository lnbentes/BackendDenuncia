package br.com.generation.lucasbentes.tabelas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.lucasbentes.tabelas.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findAllByCategoriaContainingIgnoreCase(String categoria);
	
}
