import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { ScenicPage } from './scenic';
import {HttpClientModule} from '@angular/common/http';
@NgModule({
  imports: [IonicModule,HttpClientModule],
  declarations: [ScenicPage],
  entryComponents: [ScenicPage],
  providers: [],
  exports: [IonicModule]
})
export class ScenicModule {
}