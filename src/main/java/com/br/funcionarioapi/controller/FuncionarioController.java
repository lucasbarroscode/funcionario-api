package com.br.funcionarioapi.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.funcionarioapi.model.Funcionario;
import com.br.funcionarioapi.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository repository;

	@GetMapping
	public List<Funcionario> obterTodos() {
		return repository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Funcionario salvar(@RequestBody @Valid Funcionario funcionario) {
		return repository.save(funcionario);
	}

	@GetMapping("{id}")
	public ResponseEntity<Funcionario> getOneProduct(@PathVariable(value = "id") Long id) {
		Optional<Funcionario> funcionario = repository.findById(id);
		if (funcionario.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Funcionario>(funcionario.get(), HttpStatus.OK);
	}

}
