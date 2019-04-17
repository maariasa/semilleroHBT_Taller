import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { APP_BASE_HREF } from '@angular/common';
import { NucleoComponent } from './nucleo/nucleo.component';
import { CapaComponent } from './nucleo/capa/capa.component';
import { PrincipalComponent } from './nucleo/capa/principal/principal.component';
import { GestionPedidosComponent } from './nucleo/capa/principal/gestion-pedidos/gestion-pedidos.component';

@NgModule({
  declarations: [
    AppComponent,
    NucleoComponent,
    CapaComponent,
    PrincipalComponent,
    GestionPedidosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule
  ],
  providers: [
  	{ provide: APP_BASE_HREF, useValue: '/SemilleroHBT' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
