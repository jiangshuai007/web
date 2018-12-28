import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { DiscoverPage } from './discover';
import {HttpClientModule} from '@angular/common/http';
@NgModule({
  imports: [IonicModule,HttpClientModule],
  declarations: [DiscoverPage],
  entryComponents: [DiscoverPage],
  providers: [],
  exports: [IonicModule]
})
export class DiscoverModule {
}