import { Component, OnInit } from '@angular/core';
import { BebidaDTO } from '';
import { PedidosDTO } from '';
import { ConsultarOpcionesService } from '';

@Component({
  selector: 'app-resultados',
  templateUrl: './resultados.component.html',
  styleUrls: ['./resultados.component.css']
})
export class ResultadosComponent implements OnInit {
    @Input() public :string;
  	@Input() public pedidos: PedidosDTO[];


    public listaPedidosTO: PedidosDTO[];
    public pedidoDTO: PedidoDTO;


    constructor(private vehiculosService: ConsultaVehiculosService) { }

    ngOnInit() {
    }

     public listarPedidos() {
  	    this.listaPedidosDTO = [];
  	  	this.consultarOpcionesService.consultarPedidos().subscribe(
  	    	veh => {
  		        this.pedido = veh.pedido;
  		      },
  		      error => {
  		        console.log(error);
  		      }
  	    );
  	 }

}
