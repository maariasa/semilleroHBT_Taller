import { TestBed } from '@angular/core/testing';

import { ConsultarOpcionesService } from './consultar-opciones.service';

describe('ConsultarOpcionesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ConsultarOpcionesService = TestBed.get(ConsultarOpcionesService);
    expect(service).toBeTruthy();
  });
});
