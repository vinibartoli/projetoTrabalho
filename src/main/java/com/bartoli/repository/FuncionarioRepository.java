package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

	@Query(value = "SELECT * FROM funcionario", nativeQuery = true)
	List<Funcionario> findAll();
	
	@Query(value = "SELECT * FROM funcionario where id = ?", nativeQuery = true)
	Funcionario findByID(Integer id);

}
