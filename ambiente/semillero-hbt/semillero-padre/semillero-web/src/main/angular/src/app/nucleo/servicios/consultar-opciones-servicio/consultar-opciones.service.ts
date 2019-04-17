import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { BebidaDTO } from '';
import { PlatoDTO } from '';
import { PedidosDTO } from '';

@Injectable({
  providedIn: 'root'
})
export class ConsultarOpcionesService {
  public bebida: BebidaDTO;
  public plato: PlatoDTO;
  public pedido: PedidoDTO;
  public listaBebidas: BebidaDTO[];
  public listaPlatos: PlatoDTO[];
  public listaPedidos: PedidosDTO[];

  constructor() { }
  public consultarBebidas(): Observable<BebidaDTO[]>{
    return this.get<BebidaDTO[]>("/semillero-servicios", "/ConsultasRest/consultarBebidas",
    {
        "idBebida":idBebida,
        "nombreBebida":nombreBebida,
        "precioBebida":precioBebida,
      });
  }

  public consultarPlatos(): Observable<PlatoDTO[]>{
    return this.get<PlatoDTO[]>("/semillero-servicios", "/ConsultasRest/consultarPlatos",
    {
        "idPlato":idPlato,
        "nombrePlato":nombrePlato,
        "precioPlato":precioPlato,
        "descripcionPlato":descripcionPlato,
      });
  }

  public consultarPedidos(): Observable<PedidosDTO[]>{
    return this.get<PedidosDTO[]>("/semillero-servicios", "/ConsultasRest/consultarPedidos",
    {
        "idPedido":idPedido,
        "nombrePedido":nombrePedido,
        "tipoPedido":tipoPedido,
        "medioPago":medioPago,
        "fechaCreacion":fechaCreacion,
        "idCliente":idCliente;
        "idBebida":idBebida;
        "idPlato":idPlato;
        "idSugerencia":idSugerencia;
        "estadoPedido":estadoPedido;
      });
  }

}
