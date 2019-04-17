import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BebidaDetalleComponent } from './bebida-detalle.component';

describe('BebidaDetalleComponent', () => {
  let component: BebidaDetalleComponent;
  let fixture: ComponentFixture<BebidaDetalleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BebidaDetalleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BebidaDetalleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
