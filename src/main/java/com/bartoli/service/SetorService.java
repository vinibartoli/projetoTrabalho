package com.bartoli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Setor;
import com.bartoli.repository.SetorRepository;

@Service
public class SetorService {

	@Autowired
	private SetorRepository repo;
	
	public List<Setor> findAll() {
		List<Setor> list = repo.findAll();
		return list;
	}
	
	public Setor findByID(Integer id) {
		Setor obj = repo.findByID(id);
		return obj;
	}
	
	public Setor create(Setor obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public Setor update(Setor obj) {
		Setor obj2 = findByID(obj.getId());
		
		obj2.setDescricao(obj.getDescricao());
		obj2.setFuncionario(obj.getFuncionario());
		obj2.setStatus(obj.getStatus());
		
		return repo.save(obj);
	}
	
	
}
