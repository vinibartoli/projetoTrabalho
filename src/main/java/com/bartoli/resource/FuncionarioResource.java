package com.bartoli.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bartoli.domain.Funcionario;
import com.bartoli.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioResource {

	@Autowired
	private FuncionarioService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Funcionario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/{idfuncionario}" ,method = RequestMethod.GET)
	public ResponseEntity<?> findByID(@PathVariable Integer id) {
		Funcionario obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Funcionario funcionario) {
		Funcionario obj = service.create(funcionario);
		return ResponseEntity.created(null).body(obj);
	}
	
	@RequestMapping(value = "/{idfuncionario}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@RequestMapping(value = "/{idfuncionario}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Funcionario funcionario) {
		funcionario.setId(id);
		Funcionario obj = service.update(funcionario);
		return ResponseEntity.ok().body(obj);
	}
	
}
