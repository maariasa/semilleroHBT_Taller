import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OpcionesComponent } from '';
import { GestionPedidosComponent } from '';

const routes: Routes = [
	{
		path: opciones,
		component: OpcionesComponent;
	}

	{
		path: pedidos-gestion,
		component: GestionPedidosComponent;
	}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
