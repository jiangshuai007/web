import { NavController } from 'ionic-angular';
import { Component,OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { FormDemoPage } from '../../demo/form-demo/form-demo';
import { ScenicPage } from '../scenic/scenic';
@Component({
  selector: 'page-comment',
  templateUrl: 'comment.html'
})
export class CommentPage implements OnInit{
  heroes;
  token;
  constructor(private http: HttpClient, private navCtrl: NavController) {
  }
  ngOnInit(): void {
    this.token ="04a084b1-967a-4678-86b4-32b28fff7521";
    const headers = new HttpHeaders().set("Authorization", "Bearer "+this.token);
    this.http.get('  http://192.168.43.10:8080/api/comment', {headers})
      .subscribe(res => {
        this.heroes = res;
      });
  }
  formDemo() {
    this.navCtrl.push(FormDemoPage);
  }

}