package com.hbt.semillero.servicios.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.modelos.Bebida;
import com.hbt.semillero.servicios.interfaces.IConsultasEjbLocal;

/**
 * Clase que implementa todos los métodos de la interface
 * @author Mateo Arias Ávila
 *
 */

public class ConsultasEjb implements IConsultasEjbLocal{
	@PersistenceContext
	private EntityManager emanager;
	
	/**
	 * Método que consulta los datos de todas las bebidas existentes en el sistema
	 */
	@Override
	public List<BebidaDTO> consultarBebidasExistentes() {
		List<Bebida> bebidas = emanager.createQuery("SELECT * FROM bebidas").getResultList();
		List<BebidaDTO> bebidasRecibidas = new ArrayList<>();
		for (Bebida bebida: bebidas) {
			BebidaDTO bebidaDto = construirBebidaDTO(bebida);
			bebidasRecibidas.add(bebidaDto);
		}
		return bebidasRecibidas;
	}
	
	/**
	 * Método que consulta los datos de todos los pedidos existentes en el sistema
	 */

	@Override
	public List<PedidoDTO> consultarPedidosExistentes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlatoDTO> consultarPlatosPorNombre(String nombrePlato) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	private BebidaDTO construirBebidaDTO(Bebida bebida) {
		BebidaDTO bebidaDto = new BebidaDTO();
		bebidaDto.setIdBebida(bebida.getIdBebida());
		bebidaDto.setNombreBebida(bebida.getNombreBebida());
		bebidaDto.setPrecioBebida(bebida.getPrecioBebida());
		return bebidaDto;
	}

}
