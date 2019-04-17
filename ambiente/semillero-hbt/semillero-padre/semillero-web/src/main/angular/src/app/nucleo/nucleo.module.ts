import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CapaComponent } from './capa/capa.component';
import { PrincipalComponent } from './capa/principal/principal.component';
import { GestionPedidosComponent } from './capa/principal/gestion-pedidos/gestion-pedidos.component';
import { OpcionesComponent } from './capa/principal/opciones/opciones.component';
import { BebidaComponent } from './capa/principal/opciones/bebida/bebida.component';
import { PlatoComponent } from './capa/principal/opciones/plato/plato.component';
import { PedidoComponent } from './capa/principal/opciones/pedido/pedido.component';
import { BebidaDetalleComponent } from './capa/principal/opciones/bebida-detalle/bebida-detalle.component';
import { PedidoDetalleComponent } from './capa/principal/opciones/pedido-detalle/pedido-detalle.component';
import { PlatoDetalleComponent } from './capa/principal/opciones/plato-detalle/plato-detalle.component';
import { FiltrosComponent } from './capa/principal/gestion-pedidos/filtros/filtros.component';
import { ResultadosComponent } from './capa/principal/gestion-pedidos/resultados/resultados.component';

@NgModule({
  declarations: [CapaComponent, PrincipalComponent, GestionPedidosComponent, OpcionesComponent, BebidaComponent, PlatoComponent, PedidoComponent, BebidaDetalleComponent, PedidoDetalleComponent, PlatoDetalleComponent, FiltrosComponent, ResultadosComponent],
  imports: [
    CommonModule
  ]
})
export class NucleoModule { }
