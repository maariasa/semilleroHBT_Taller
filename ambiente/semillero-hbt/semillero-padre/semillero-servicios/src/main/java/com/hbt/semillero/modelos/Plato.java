package com.hbt.semillero.modelos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa el plato a consumir.
 * @author Mateo Arias Ávila
 *
 */

@Entity
@Table(name = "PLATO")
public class Plato {
	
	@Id
	@GeneratedValue(generator = "SEQ")
	
	/**
	 * Código del plato
	 */
	@Column(name = "plato_id")
	private String idPlato;
	
	/**
	 * Nombre del plato
	 */
	@Column(name = "plato_nombre")
	private String nombrePlato;
	
	/**
	 * Precio del plato
	 */
	@Column(name = "precio")
	private Double precio;
	
	/**
	 * Descripción del plato
	 */
	@Column(name = "plato_descripcion")
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
