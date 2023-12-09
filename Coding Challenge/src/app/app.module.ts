import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule}  from '@angular/common/http'
import {FormsModule}  from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GetallComponent } from './component/getall/getall.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { AddplayerComponent } from './component/addplayer/addplayer.component';
@NgModule({
  declarations: [
    AppComponent,
    GetallComponent,
    DashboardComponent,
    AddplayerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
