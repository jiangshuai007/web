import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { StrategyPage } from './strategy';
import {HttpClientModule} from '@angular/common/http';
@NgModule({
  imports: [IonicModule,HttpClientModule],
  declarations: [StrategyPage],
  entryComponents: [StrategyPage],
  providers: [],
  exports: [IonicModule]
})
export class StrategyModule {
}