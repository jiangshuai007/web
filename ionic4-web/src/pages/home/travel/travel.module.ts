import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { TravelPage } from './travel';
import {HttpClientModule} from '@angular/common/http';
@NgModule({
  imports: [IonicModule,HttpClientModule],
  declarations: [TravelPage],
  entryComponents: [TravelPage],
  providers: [],
  exports: [IonicModule]
})
export class TravelModule {
}