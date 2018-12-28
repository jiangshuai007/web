import { NavController } from 'ionic-angular';
import { Component,OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
@Component({
  selector: 'page-strategy',
  templateUrl: 'strategy.html'
})
export class StrategyPage implements OnInit{
  heroes;
  token;
  constructor(private http: HttpClient) {
  }
  ngOnInit(): void {
    this.token ="04a084b1-967a-4678-86b4-32b28fff7521";
    const headers = new HttpHeaders().set("Authorization", "Bearer "+this.token);
    this.http.get('http://192.168.43.10:8080/api/travel', {headers})
      .subscribe(res => {
        this.heroes = res;
      });
  }

}