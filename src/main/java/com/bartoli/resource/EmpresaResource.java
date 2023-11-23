package com.bartoli.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bartoli.domain.Empresa;
import com.bartoli.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {
	
	@Autowired
	private EmpresaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Empresa> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/{idempresa}" ,method = RequestMethod.GET)
	public ResponseEntity<?> findByID(@PathVariable Integer id) {
		Empresa obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Empresa empresa) {
		Empresa obj = service.create(empresa);
		return ResponseEntity.created(null).body(obj);
	}
	
	@RequestMapping(value = "/{idempresa}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@RequestMapping(value = "/{idempresa}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Empresa empresa) {
		empresa.setId(id);
		Empresa obj = service.update(empresa);
		return ResponseEntity.ok().body(obj);
	}

}
