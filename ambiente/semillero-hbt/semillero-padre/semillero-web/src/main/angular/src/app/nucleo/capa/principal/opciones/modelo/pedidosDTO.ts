import { BebidaDTO } from '';
import { PlatoDTO } from '';
import { ClienteDTO } from '';
//Clase que utiliza los mismos atributos que se encuentran en el archivo PedidosDTO en Java
export interface PedidosDTO{
  idPedido: string;
  tipoPedido: string;
  medioPago: string;
  fechaCreacion: string;
  idCliente: ClienteDTO;
  idBebida: BebidaDTO;
  idPlato: PlatoDTO;
  idSugerencia: SugerenciaDTO;
  estadoPedido: boolean;

}
