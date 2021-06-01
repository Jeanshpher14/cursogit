package com.manager.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.manager.app.dto.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "COMPRAS")
public class ComprasEntity {
	
	@Id
	private String id;
	private List<String> lista;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
	private Usuario usuario;
	

}
