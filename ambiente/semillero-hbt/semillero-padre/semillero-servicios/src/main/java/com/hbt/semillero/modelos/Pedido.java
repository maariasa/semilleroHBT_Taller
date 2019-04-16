package com.hbt.semillero.modelos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa el pedido a hacerse.
 * @author Mateo Arias Ávila
 *
 */
@Entity
@Table(name = "PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(generator = "SEQ")
	/**
	 * Código del pedido
	 */
	@Column(name="pedido_id")
	private String idPedido;
	
	/**
	 * Tipo del Pedido
	 */
	@Column(name="pedido_tipo")
	private String tipoPedido;
	
	/**
	 * Medio de pago para el pedido.
	 */
	@Column(name="medio_pago")
	private String medioPago;
	
	/**
	 * Fecha de la creación del pedido.
	 */
	@Column(name="fecha_creacion")
	private Date fechaCreacionPedido;
	
	/**
	 * Estado actual del pedido (Verdadero o Falso, según su vigencia)
	 */
	@Column(name="pedido_estado")
	private Boolean estadoPedido;
	
	/**
	 * Código del cliente (llave foránea)
	 */
	@Column(name="cliente_id")
	private String idCliente;
	
	/**
	 * Código de la bebida (llave foránea)
	 */
	@Column(name="bebida_id")
	private String idBebida;
	
	/**
	 * Código del plato (llave foránea)
	 */
	@Column(name="plato_id")
	private String idPlato;
	
	/**
	 * Código de la sugerencia para el cliente (llave foránea)
	 */
	@Column(name="sugerencia_id")
	private String idSugerencia;
	


}
