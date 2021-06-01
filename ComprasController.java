package com.manager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manager.app.dao.ComprasEntity;
import com.manager.app.model.RConsultaFechas;
import com.manager.app.model.Response;
import com.manager.app.service.ComprasService;

@RestController
@CrossOrigin("*")
@RequestMapping("compras")
public class ComprasController {
	
	@Autowired
	private ComprasService comprasService;
	
	@PostMapping("/consulta")
	public ResponseEntity<Response> consultaCompras(@RequestBody RConsultaFechas requestFechas){
		return this.comprasService.consultaComprasFechas(requestFechas);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Response> crearCompras(@RequestBody ComprasEntity requestCompras){
		return this.comprasService.crearCompras(requestCompras);
	}

}
