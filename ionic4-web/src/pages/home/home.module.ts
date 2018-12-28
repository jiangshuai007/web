import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { HomePage } from './home';
import { HttpClientModule } from '@angular/common/http';
import { CommentPage } from './comment/comment';
import { ScenicPage } from './scenic/scenic';
import { StrategyPage } from './strategy/strategy';
import { TravelPage } from './travel/travel';
@NgModule({
  imports: [IonicModule, HttpClientModule],
  declarations: [HomePage, CommentPage, ScenicPage, StrategyPage, TravelPage],
  entryComponents: [HomePage, CommentPage, ScenicPage, StrategyPage, TravelPage],
  providers: [],
  exports: [IonicModule]
})
export class HomeModule {
}
