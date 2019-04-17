import { Component, OnInit, Input } from '@angular/core';
import { BebidasDTO } from '';

@Component({
  selector: 'app-bebida-detalle',
  templateUrl: './bebida-detalle.component.html',
  styleUrls: ['./bebida-detalle.component.css']
})
export class BebidaDetalleComponent implements OnInit {
  @Input() bebida: BebidasDTO;
  constructor() { }

  ngOnInit() {
  }

}
