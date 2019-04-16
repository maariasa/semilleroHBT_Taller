package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Objeto de transferencia que permite mapear los atributos de la entidad Plato.
 * @author Mateo Arias Ávila
 *
 */

public class PlatoDTO implements Serializable{
	/**
	 * Código del plato
	 */
	private String idPlato;
	
	/**
	 * Nombre del plato
	 */
	private String nombrePlato;
	
	/**
	 * Precio del plato
	 */
	private Double precio;
	
	/**
	 * Descripción del plato
	 */
	private String descripcionPlato;
	
	/**
	 * Métodos Get y Set de la clase
	 * @return
	 */

	public String getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(String idPlato) {
		this.idPlato = idPlato;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcionPlato() {
		return descripcionPlato;
	}

	public void setDescripcionPlato(String descripcionPlato) {
		this.descripcionPlato = descripcionPlato;
	}
	
	
	
}
