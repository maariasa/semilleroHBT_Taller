import { Component, OnInit, Input } from '@angular/core';
import { PlatoDTO } from '';

@Component({
  selector: 'app-plato-detalle',
  templateUrl: './plato-detalle.component.html',
  styleUrls: ['./plato-detalle.component.css']
})
export class PlatoDetalleComponent implements OnInit {
  @Input() plato: PlatoDTO;
  constructor() { }

  ngOnInit() {
  }

}
