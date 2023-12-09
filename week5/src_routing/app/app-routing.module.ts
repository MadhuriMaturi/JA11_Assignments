import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactusComponent } from './components/contactus/contactus.component';
import { HomeComponent } from './components/home/home.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { PayementComponent } from './components/payement/payement.component';

const routes: Routes = [
 //{path:'',redirectTo:'home',pathMatch:'full'},
  {path:'home',component:HomeComponent},
  {path:'contactus/:username',component:ContactusComponent},
  {path:'aboutus',component:AboutusComponent},
  {path:'callnow',redirectTo:'contactus'},
  {path:'payment/:amount',component:PayementComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
