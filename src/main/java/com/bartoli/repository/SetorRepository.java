package com.bartoli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bartoli.domain.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Integer> {

	@Query(value = "SELECT * FROM setor", nativeQuery = true)
	List<Setor> findAll();
	
	@Query(value = "SELECT * FROM setor where id = ?", nativeQuery = true)
	Setor findByID(Integer id);

}
