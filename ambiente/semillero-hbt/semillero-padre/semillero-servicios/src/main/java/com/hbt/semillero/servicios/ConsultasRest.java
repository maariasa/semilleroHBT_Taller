package com.hbt.semillero.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.servicios.interfaces.IConsultasEjbLocal;

/**
 * Clase encargada de la gestión de los Servicios Rest
 * @author Mateo Arias Ávila
 *
 */

@Path("/ConsultasRest")
public class ConsultasRest {

	@EJB
	private IConsultasEjbLocal consultaEJB;

	/**
	 * Consulta encargada de consultar las bebidas disponibles
	 */
	@GET
	@Path("/consultarBebidas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BebidaDTO> consultarBebidas(){
		return consultaEJB.consultarBebidasExistentes();
	}

	@GET
	@Path("/consultarPlatos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PlatoDTO> consultarPlatos(){
		return consultaEJB.consultarPlatosPorNombre();
	}

	@GET
	@Path("/consultarPedidos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PedidosDTO> consultarPedidos(){
		return consultaEJB.consultarPedidosExistentes();
	}



}
