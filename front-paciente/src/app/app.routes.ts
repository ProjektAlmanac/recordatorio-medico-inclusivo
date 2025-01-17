import { Routes } from '@angular/router';
import { HomePage } from './home/home.page';
import { NotificacionMedicamentoComponent } from './pages/notificacion-medicamento/notificacion-medicamento.component';
import { PrescriptionsComponent } from './pages/prescriptions/prescriptions.component';
import { SigupPatientComponent } from './pages/sigup-patient/sigup-patient.component';

export const routes: Routes = [
  {
    path: 'leer-qr',
    loadComponent: () =>
      import('./pages/leer-qr/leer-qr.page').then((m) => m.LeerQrPage),
  },
  {
    path: 'home',
    loadComponent: () =>
      import('./pages/sigup-patient/sigup-patient.component').then(
        (m) => m.SigupPatientComponent,
      ),
  },
  {
    path: 'message/:id',
    loadComponent: () =>
      import('./view-message/view-message.page').then((m) => m.ViewMessagePage),
  },
  {
    path: 'signup-patient',
    component: SigupPatientComponent,
  },
  {
    path: 'prescriptions',
    component: PrescriptionsComponent,
  },
  {
    path: 'notificacion-medicamento/:id',
    component: NotificacionMedicamentoComponent,
  },
  {
    path: '',
    component: HomePage,
  },
];
