package com.hbt.semillero.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa la factura de los alimentos consumidos.
 *
 * @author Mateo Arias Ávila
 *
 */

@Entity
@Table(name = "FACTURA")
public class Factura {
	@Id
	@GeneratedValue(generator = "SEQ")
	
	/**
	 * Código de la Factura
	 */
	@Column(name = "factura_id")
	private String idFactura;
	
	/**
	 * Código del cliente - Llave foránea
	 */
	@Column(name = "cliente_id")
	private String idCliente;
	
	/**
	 * Valor del IVA
	 */
	@Column(name = "iva")
	private Double IVA;
	
	/**
	 * Precio Total
	 */
	@Column(name = "total")
	private Double total;

	
	/**
	 * Métodos Get y Set de la clase
	 * @return
	 */
	public String getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public Double getIVA() {
		return IVA;
	}

	public void setIVA(Double iVA) {
		IVA = iVA;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	
}
