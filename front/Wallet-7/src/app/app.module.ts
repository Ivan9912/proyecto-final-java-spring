import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './Components/home/home.component';
import { PerfilComponent } from './Components/perfil/perfil.component';
import { NavBarComponent } from './ComponentesReutilizables/nav-bar/nav-bar.component';
import { FormComponent } from './ComponentesReutilizables/form/form.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PerfilComponent,
    NavBarComponent,
    FormComponent,
     ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
