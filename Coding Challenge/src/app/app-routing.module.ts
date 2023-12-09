import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetallComponent } from './component/getall/getall.component';
import { AddplayerComponent } from './component/addplayer/addplayer.component';

const routes: Routes = [
  {path:'add',component:AddplayerComponent},
  {path:'getall',component:GetallComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 


}

