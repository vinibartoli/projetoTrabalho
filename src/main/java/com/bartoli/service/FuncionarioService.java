package com.bartoli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Funcionario;
import com.bartoli.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repo;
	
	public List<Funcionario> findAll() {
		List<Funcionario> list = repo.findAll();
		return list;
	}
	
	public Funcionario findByID(Integer id) {
		Funcionario obj = repo.findByID(id);
		return obj;
	}
	
	public Funcionario create(Funcionario obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public Funcionario update(Funcionario obj) {
		Funcionario obj2 = findByID(obj.getId());
		
		obj2.setCpf(obj.getCpf());
		obj2.setDatanasc(obj.getDatanasc());
		obj2.setNome(obj.getNome());
		obj2.setRg(obj.getRg());
		obj2.setStatus(obj.getStatus());
		
		return repo.save(obj);
	}
	
}
