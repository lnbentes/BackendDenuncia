package br.com.generation.lucasbentes.tabelas.controller;

import java.util.List;

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

import br.com.generation.lucasbentes.tabelas.model.UF;
import br.com.generation.lucasbentes.tabelas.repository.UfRepository;

@RestController
@RequestMapping("/uf")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UfController {

	@Autowired
	private UfRepository repository;
	
	@GetMapping
	public ResponseEntity<List<UF>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UF> getByID(@PathVariable Long id){
		return  repository.findById(id).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<UF>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/sigla/{sigla}")
	public ResponseEntity<List<UF>> getBySigla(@PathVariable String sigla){
		return ResponseEntity.ok(repository.findAllBySiglaContainingIgnoreCase(sigla));
	}
	
	@PostMapping
	public ResponseEntity<UF> post(@RequestBody UF uf){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(uf));
	}
	
	@PutMapping
	public ResponseEntity<UF> put(@RequestBody UF uf){
		return ResponseEntity.ok(repository.save(uf));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
