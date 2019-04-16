package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.dto.PlatoDTO;

/**
 * Interfaz que contiene los métodos para las acciones de persistencia (CRUD)
 * @author Mateo Arias Ávila
 *
 */
public interface IConsultasEjbLocal {
	/**
	 * Consulta las bebidas existentes en el sistema.
	 * @return
	 */
	public List<BebidaDTO> consultarBebidasExistentes();
	/**
	 * Consulta los pedidos existentes en el sistema.
	 * @return
	 */
	public List<PedidoDTO> consultarPedidosExistentes();
	/**
	 * Consulta los platos existentes filtrando datos según el nombre
	 * @return
	 */
	public List<PlatoDTO> consultarPlatosPorNombre(String nombrePlato);
	
}
