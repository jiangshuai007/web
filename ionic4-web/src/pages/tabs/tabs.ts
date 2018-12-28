import { Component, ViewChild } from '@angular/core';
import { HomePage } from '../home/home';
import { MinePage } from '../mine/mine';
import { Events, Tabs } from 'ionic-angular';
import { TestPage } from '../test/test';
import { DemoPage } from '../demo/demo';
import { DiscoverPage } from '../discover/discover';
@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {
  @ViewChild('mainTabs') tabs: Tabs;
  testRoot: any = TestPage;
  demoRoot: any = DiscoverPage;
  homeRoot: any = HomePage;
  mineRoot: any = MinePage;
  discoverRoot: any = DiscoverPage;

  constructor(public events: Events) {
    this.events.subscribe('selectTab', () => {
      this.tabs.select(1);
      debugger;
    });
  }

}
