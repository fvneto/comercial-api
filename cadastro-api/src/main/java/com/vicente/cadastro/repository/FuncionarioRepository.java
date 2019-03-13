package com.vicente.cadastro.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vicente.cadastro.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Optional<Funcionario> findByNome(String nome_funcionario);
	
}