import { NavController } from 'ionic-angular';
import { Component,OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { CommentPage } from './comment/comment';
import { TestService } from '../test/TestService';
import { NativeService } from '../../providers/NativeService';
import { ScenicPage } from './scenic/scenic';
import { StrategyPage } from './strategy/strategy';
import { TravelPage } from './travel/travel';
@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage implements OnInit{
  heroes;
  constructor(private http: HttpClient, private navCtrl: NavController, public testService: TestService, public nativeService: NativeService) {
  }
  ngOnInit(): void {
    this.http.get('https://www.easy-mock.com/mock/5c08dcb9d3afb9061016212d/user')
      .subscribe(res => {
        this.heroes = res;
      });
  }
  toComment() {
    this.navCtrl.push(CommentPage);
  }
  toScenic() {
    this.navCtrl.push(ScenicPage);
  }
  toStrategy(){
    this.navCtrl.push(StrategyPage);
  }
  toTravel(){
    this.navCtrl.push(TravelPage);
  }
}
