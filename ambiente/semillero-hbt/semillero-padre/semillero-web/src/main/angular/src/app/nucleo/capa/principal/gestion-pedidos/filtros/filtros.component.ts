import { Component, OnInit } from '@angular/core';
import { EventEmitter } from "@angular/core";
import { ConsultarOpcionesService } from '';
import { BebidaDTO } from '../../../../opciones/modelo/bebidaDTO';
import { PlatoDTO } from '../../../../opciones/modelo/platoDTO';
import { PedidosDTO } from '../../../../opciones/modelo/pedidosDTO';

@Component({
  selector: 'app-filtros',
  templateUrl: './filtros.component.html',
  styleUrls: ['./filtros.component.css']
})
export class FiltrosComponent implements OnInit {
  public bebidas: BebidaDTO[];
  public platos: PlatoDTO[];
  public pedido: PedidosDTO[];
  public bebidaFiltro: string;
  public platoFiltro: string;
  public pedidoFiltro: string;
  @Output() PlatoEmiter = new EventEmitter();
  @Output() BebidaEmiter=new EventEmitter();
  @Output() PlatoEmiter=new EventEmitter();

  constructor() { private servicioBebidas: ConsultarBebidasService,
             private servicioPlatos: ConsultarPlatosService }

  ngOnInit() {
  }

 this.servicioBebidas.consultarBebidas().subscribe(
   bebidas => {
     this.bebidas = bebidas;
   },
   error => {
     console.log(error);
   }
 );


 console.log('Resultado de la consulta de bebidas: ' + this.bebidas)


 this.servicioPlatos.consultarPlatos().subscribe(
   platos => {
     this.platos = platos;
   },
   error => {
     console.log(error);
   }
 );
 console.log('Resultado de la consulta de platos: ' + this.platos)
}

this.servicioTipoPedidos.consultarTipoPedidos().subscribe(
  pedidos => {
    this.pedidos = pedidos;
  },
  error => {
    console.log(error);
  }
);
console.log('Resultado de la consulta de tipo de pedidos: ' + this.pedidos)
}

cambiarBebida(){
 this.LineaEmiter.emit(this.bebidaFiltro);
}

cambiarPlato(){
 this.PlatoEmiter.emit(this.platoFiltro);
}

cambiarTipoPedido(){
 this.PedidoEmiter.emit(this.pedidoFiltro);
}

}
