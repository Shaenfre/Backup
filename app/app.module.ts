import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LatestInformationComponent } from './component/latest-information/latest-information.component';
import { InformationService } from './services/information.service';

@NgModule({
  declarations: [
    AppComponent,
    LatestInformationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [InformationService, HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
