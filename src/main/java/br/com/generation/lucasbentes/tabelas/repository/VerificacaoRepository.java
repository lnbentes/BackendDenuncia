package br.com.generation.lucasbentes.tabelas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.lucasbentes.tabelas.model.Verificacao;

@Repository
public interface VerificacaoRepository extends JpaRepository<Verificacao, Long>{

	public List<Verificacao> findAllByStatusContainingIgnoreCase(String status);
	
}
