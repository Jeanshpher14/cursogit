package com.manager.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.manager.app.dao.ComprasEntity;
import com.manager.app.model.RConsultaFechas;
import com.manager.app.model.Response;
import com.manager.app.repository.IComprasRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ComprasService {

	@Autowired
	IComprasRepository iCompras;

	public ResponseEntity<Response> consultaComprasFechas(RConsultaFechas requestFechas) {
		Response respuesta= new Response();
		respuesta.setCode("400");
		respuesta.setMensaje("Error");
		
		try {
			
			List<ComprasEntity> listaCompras= this.iCompras.findByFechaBetween(requestFechas.getFechaDesde(), requestFechas.getFechaHasta());
			respuesta.setCode("200");
			respuesta.setMensaje("OK");
			respuesta.setResponse(listaCompras);
			
		} catch (Exception e) {
			log.error("Exception: {}", e);
		}
		
		return ResponseEntity.ok(respuesta);
	}

	public ResponseEntity<Response> crearCompras(ComprasEntity requestCompras) {
		Response respuesta= new Response();
		respuesta.setCode("400");
		respuesta.setMensaje("Error");
		
		try {
			
			ComprasEntity compras= this.iCompras.save(requestCompras);
			respuesta.setCode("200");
			respuesta.setMensaje("OK");
			respuesta.setResponse(compras);
			
		} catch (Exception e) {
			log.error("Exception: {}", e);
		}
		
		return ResponseEntity.ok(respuesta);
	}
	
	
}
