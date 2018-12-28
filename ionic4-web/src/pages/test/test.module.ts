import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { TestPage } from './test';
import { TestService } from './TestService';
import { SelectPicturePageModule } from '../../shared/select-picture/select-picture.module';
import { WorkMapPage } from './work-map/work-map';
import { MapLocationModule } from '../../shared/map-component/map-location/map-location.module';
@NgModule({
  imports: [
    IonicModule,
    MapLocationModule,
    SelectPicturePageModule
  ],
  declarations: [ TestPage,WorkMapPage,],
  entryComponents: [TestPage, WorkMapPage,],
  providers: [TestService]
})
export class TestModule {
}
