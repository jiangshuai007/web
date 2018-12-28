import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { CommentPage } from './comment';
import {HttpClientModule} from '@angular/common/http';
import { FormDemoPage } from '../../demo/form-demo/form-demo';
import { ScenicPage } from '../scenic/scenic';
@NgModule({
  imports: [IonicModule,HttpClientModule],
  declarations: [CommentPage, FormDemoPage],
  entryComponents: [CommentPage, FormDemoPage],
  providers: [],
  exports: [IonicModule]
})
export class CommentModule {
}