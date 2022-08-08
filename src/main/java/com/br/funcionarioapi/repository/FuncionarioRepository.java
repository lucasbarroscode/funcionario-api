package com.br.funcionarioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.funcionarioapi.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>  {

}
