package com.hbt.semillero.dto;

import java.io.Serializable;
import java.sql.Date;

/**
 * Objeto de transferencia que permite mapear los atributos de la entidad Pedido.
 * @author Mateo Arias Ávila
 *
 */

public class PedidoDTO implements Serializable{
	/**
	 * Código del pedido
	 */
	private String idPedido;
	
	/**
	 * Tipo del Pedido
	 */
	private String tipoPedido;
	
	/**
	 * Medio de pago para el pedido.
	 */
	private String medioPago;
	
	/**
	 * Fecha de la creación del pedido.
	 */
	private Date fechaCreacionPedido;
	
	/**
	 * Código del cliente (llave foránea)
	 */
	private String idCliente;
	
	/**
	 * Código de la bebida (llave foránea)
	 */
	private String idBebida;
	
	/**
	 * Código del plato (llave foránea)
	 */
	private String idPlato;
	
	/**
	 * Código de la sugerencia para el cliente (llave foránea)
	 */
	private String idSugerencia;
	
	/**
	 * Estado actual del pedido (Verdadero o Falso, según su vigencia)
	 */
	private Boolean estadoPedido;
	
	/**
	 * Métodos Get y Set de la clase
	 * @return
	 */
	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getTipoPedido() {
		return tipoPedido;
	}

	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public Date getFechaCreacionPedido() {
		return fechaCreacionPedido;
	}

	public void setFechaCreacionPedido(Date fechaCreacionPedido) {
		this.fechaCreacionPedido = fechaCreacionPedido;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(String idBebida) {
		this.idBebida = idBebida;
	}

	public String getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(String idPlato) {
		this.idPlato = idPlato;
	}

	public String getIdSugerencia() {
		return idSugerencia;
	}

	public void setIdSugerencia(String idSugerencia) {
		this.idSugerencia = idSugerencia;
	}

	public Boolean getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(Boolean estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	
	

}
