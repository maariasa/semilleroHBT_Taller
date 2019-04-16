package com.hbt.semillero.modelos;

/**
 * Clase que representa al cliente
 * @author Mateo Arias Ávila
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente /*implements Serializable*/ {

	
	@Id
	@GeneratedValue(generator = "SEQ")
	
	/**
	 * Nombre del cliente
	 */
	@Column(name = "cliente_id")
	private String nombreCliente;
	
	/**
	 * ID del cliente
	 */
	@Column(name = "cliente_nombre")
	private String idCliente;
	
	/**
	 * Métodos Get y Set de la clase
	 * @return
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
}