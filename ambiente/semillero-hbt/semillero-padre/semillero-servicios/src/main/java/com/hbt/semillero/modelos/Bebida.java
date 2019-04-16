package com.hbt.semillero.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * Clase que representa las bebidas en el menú.
 * @author Mateo Arias Ávila
 *
 */

@Entity
@Table(name = "BEBIDA")
public class Bebida {
	@Id
	@GeneratedValue(generator = "SEQ")
	
	/**
	 * Código de la bebida.
	 */
	@Column(name = "bebida_id")
	private String idBebida;
	
	/**
	 * Nombre de la bebida.
	 */
	@Column(name = "bebida_nombre")
	private String nombreBebida;
	
	/**
	 * Precio de la bebida.
	 */
	@Column(name = "precio")
	private Double precioBebida;
	
	/**
	 * Métodos Get y Set de la clase.
	 * @param idBebida
	 */
	public String getIdBebida() {
		return idBebida;
	}
	
	/**
	 * Métodos Get y Set de la Clase
	 * @param idBebida
	 */
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
