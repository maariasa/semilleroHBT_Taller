package com.hbt.semillero.dto;

import java.io.Serializable;


/**
 * Objeto de transferencia que permite mapear los atributos de la entidad Bebida.
 * @author Mateo Arias Ávila
 *
 */

public class BebidaDTO implements Serializable{

	private String idBebida;
	
	private String nombreBebida;
	
	private Double precioBebida;

	public String getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(String idBebida) {
		this.idBebida = idBebida;
	}

	public String getNombreBebida() {
		return nombreBebida;
	}

	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}

	public Double getPrecioBebida() {
		return precioBebida;
	}

	public void setPrecioBebida(Double precioBebida) {
		this.precioBebida = precioBebida;
	}
	
	
}
