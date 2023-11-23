package com.bartoli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartoli.domain.Empresa;
import com.bartoli.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repo;

	public List<Empresa> findAll() {
		List<Empresa> list = repo.findAll();
		return list;
	}
	
	public Empresa findByID(Integer id) {
		Empresa obj = repo.findByID(id);
		return obj;
	}
	
	public Empresa create(Empresa obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public Empresa update(Empresa obj) {
		Empresa obj2 = findByID(obj.getId());
		
		obj2.setBairro(obj.getBairro());
		obj2.setCep(obj.getCep());
		obj2.setCidade(obj.getCidade());
		obj2.setCnpj(obj.getCnpj());
		obj2.setComplemento(obj.getComplemento());
		obj2.setEmail(obj.getEmail());
		obj2.setLogradouro(obj.getLogradouro());
		obj2.setNumero(obj.getNumero());
		obj2.setRazaosocial(obj.getRazaosocial());
		obj2.setSetor(obj.getSetor());
		obj2.setStatus(obj.getStatus());
		obj2.setTelefone(obj.getTelefone());
		obj2.setUf(obj.getUf());
		
		return repo.save(obj);
	}
	
}
