import { NavController } from 'ionic-angular';
import { Component,OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
@Component({
  selector: 'page-travel',
  templateUrl: 'travel.html'
})
export class TravelPage implements OnInit{
  heroes;
  token;
  constructor(private http: HttpClient) {
  }
  ngOnInit(): void {
    const headers = new HttpHeaders().set("Authorization", "Bearer 04a084b1-967a-4678-86b4-32b28fff7521");
    this.http.get('http://192.168.43.10:8080/api/travel', {headers})
      .subscribe(res => {
        this.heroes = res;
      });
  }

}