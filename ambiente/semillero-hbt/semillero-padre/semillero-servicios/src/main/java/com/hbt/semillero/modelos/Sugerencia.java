package com.hbt.semillero.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Clase que representa la sugerencia opcional que completa el pedido.
 * @author Mateo Arias Ávila
 *
 */
@Entity
@Table(name="SUGERENCIA")
public class Sugerencia {
	@Id
	@GeneratedValue(generator="SEQ")
	
	/**
	 * Código de la sugerencia
	 */
	@Column(name="sugerencia_id")
	private String idSugerencia;
	
	/**
	 * Nombre de la sugerencia
	 */
	@Column(name="sugerencia_nombre")
	private String nombreSugerencia;
	
	
	/**
	 * Tipo de Sugerencia
	 */
	@Column(name="sugerencia_tipo")
	private String tipoSugerencia;
	
	
	/**
	 * 
	 * Descripción de la sugerencia
	 */
	@Column(name="sugerencia_descripcion")
	private String descripSugerencia;

}
