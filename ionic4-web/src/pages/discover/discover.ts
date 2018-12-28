import { NavController } from 'ionic-angular';
import { Component,OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'page-discover',
  templateUrl: 'discover.html'
})
export class DiscoverPage implements OnInit {
  heroes;
  constructor(private http: HttpClient) {
  }
  ngOnInit(): void {
    this.http.get(' https://www.easy-mock.com/mock/5c08dcb9d3afb9061016212d/user')
      .subscribe(res => {
        this.heroes = res;
      });
  }

}