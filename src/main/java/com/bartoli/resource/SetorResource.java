package com.bartoli.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bartoli.domain.Setor;
import com.bartoli.service.SetorService;

@RestController
@RequestMapping(value = "/setores")
public class SetorResource {

	@Autowired
	private SetorService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Setor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/{idfuncionario}" ,method = RequestMethod.GET)
	public ResponseEntity<?> findByID(@PathVariable Integer id) {
		Setor obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Setor setor) {
		Setor obj = service.create(setor);
		return ResponseEntity.created(null).body(obj);
	}
	
	@RequestMapping(value = "/{idfuncionario}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@RequestMapping(value = "/{idfuncionario}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Setor setor) {
		Setor obj = service.update(setor);
		return ResponseEntity.ok().body(obj);
	}
	
}
