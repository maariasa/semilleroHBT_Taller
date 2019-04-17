import { Component, OnInit } from '@angular/core';
import { BebidasDTO } from '';
import { ConsultarOpcionesService } from '';

@Component({
  selector: 'app-bebida',
  templateUrl: './bebida.component.html',
  styleUrls: ['./bebida.component.css']
})
export class BebidaComponent implements OnInit {
  public bebidas: BebidasDTO[];
  constructor(private consultarOpcionesService: ConsultarOpcionesService) { }

  ngOnInit() {
    this.consultarBebidas();
  }

  bebidaSeleccionada: bebidas;

  //Método que permite mostrar los detalles de una bebida seleccionada
  onSelect(bebida: Bebida){
    this.bebidaSeleccionada= bebida;
  }

  public consultarBebidas(){
    this.vehiculosService.consultarBebidas().subscribe(
      personas => {
        this.listaBebidasDTO = personas;
      },
      error => {
        console.log(error);
      }
    );
    console.log('resultado servicio...' + this.listaBebidasDTO);
  }

}
