import { Component, OnInit } from '@angular/core';
import { PlatoDTO } from '';

@Component({
  selector: 'app-plato',
  templateUrl: './plato.component.html',
  styleUrls: ['./plato.component.css']
})
export class PlatoComponent implements OnInit {
  public platos PlatoDTO;
  constructor() { }

  ngOnInit() {
  }

  platoSeleccionado: PlatoDTO;

  //Método que permite mostrar los detalles de un plato seleccionado
  onSelect(plato: Plato){
    this.platoSeleccionado= plato;
  }

}
