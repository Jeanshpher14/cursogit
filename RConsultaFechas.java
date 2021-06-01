package com.manager.app.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RConsultaFechas {
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaDesde;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaHasta;

}
