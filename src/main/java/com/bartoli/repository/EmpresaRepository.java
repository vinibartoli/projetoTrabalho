package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

	@Query(value = "SELECT * FROM empresa", nativeQuery = true)
	List<Empresa> findAll();
	
	@Query(value = "SELECT * FROM empresa where id = ?", nativeQuery = true)
	Empresa findByID(Integer id);
}
