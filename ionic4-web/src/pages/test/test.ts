import { Component } from '@angular/core';
import { TestService } from './TestService';
import { FileObj } from '../../model/FileObj';
import { NativeService } from '../../providers/NativeService';
import { FormDemoPage } from '../demo/form-demo/form-demo';
import { NavController } from 'ionic-angular';
import { WorkMapPage } from './work-map/work-map';
@Component({
  selector: 'page-test',
  templateUrl: 'test.html',
})
export class TestPage {

  fileObjList: FileObj[] = [];

  constructor(private navCtrl: NavController, public testService: TestService, public nativeService: NativeService) {
  }
  map() {
    this.navCtrl.push(WorkMapPage);
  }

  getFileData() {
    this.testService.getFileData().subscribe(res => {
      this.fileObjList = res;
    });
  }

  formDemo() {
    this.navCtrl.push(FormDemoPage);
  }
  notice() {
    this.nativeService.alert('暂未开发，请使用在线地图');
  }
}
