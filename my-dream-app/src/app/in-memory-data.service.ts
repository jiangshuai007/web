import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Hero } from './hero';
import { Scenic } from './scenic';
import { Comment } from './comment';
import { Strategy } from './strategy';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const heroes = [
      { id: 11, name: 'jiangshuai', password:'123' },
      { id: 12, name: 'hulinfeng', password:'123' },
      { id: 13, name: '赵闰暄', password:'123' },
      { id: 14, name: '杨芬', password:'123' },
      { id: 15, name: '班主任', password:'123' },
      { id: 16, name: '辅导员', password:'123' },
      { id: 17, name: 'yuan', pyuassword:'123' },
      { id: 18, name: 'Dr IQ', password:'123' },
      { id: 19, name: 'Magma', password:'123' },
      { id: 20, name: 'Tornado', password:'123' }
    ];
    const scenics =[
      {id:1, name:'捞鱼河', imgUrl:'', location:'云南省昆明市呈贡区', ticket:'50'},
      {id:2, name:'七彩云南欢乐世界', imgUrl:'', location:'云南省昆明市', ticket:'100'},
      {id:3, name:'大理', imgUrl:'', location:'云南省大理', ticket:'1000'},
      {id:4, name:'玉龙雪山', imgUrl:'', location:'云南省丽江市', ticket:'200'},
      {id:5, name:'梅里雪山', imgUrl:'', location:'西藏察隅县', ticket:'50'}
    ];
    const comment =[
      {id:1, senic:'', time:'', writer:'', imgUrl:''},
      {id:2, senic:'', time:'', writer:'', imgUrl:''},
      {id:3, senic:'', time:'', writer:'', imgUrl:''},
      {id:4, senic:'', time:'', writer:'', imgUrl:''},
      {id:5, senic:'', time:'', writer:'', imgUrl:''}
    ];
    const strategy =[
      {id:1, name:'', imgUrl1:'',imgUrl2:'', imgUrl3:'', content1:'', content2:'', content3:'' },
      {id:2, name:'', imgUrl1:'',imgUrl2:'', imgUrl3:'', content1:'', content2:'', content3:''},
      {id:3, name:'', imgUrl1:'',imgUrl2:'', imgUrl3:'', content1:'', content2:'', content3:''},
      {id:4, name:'', imgUrl1:'',imgUrl2:'', imgUrl3:'', content1:'', content2:'', content3:''},
      {id:5, name:'', imgUrl1:'',imgUrl2:'', imgUrl3:'', content1:'', content2:'', content3:''}
    ]
    return {heroes, scenics, comment, strategy};
  }

  // Overrides the genId method to ensure that a hero always has an id.
  // If the heroes array is empty,
  // the method below returns the initial number (11).
  // if the heroes array is not empty, the method below returns the highest
  // hero id + 1.
  genId(heroes: Hero[]): number {
    return heroes.length > 0 ? Math.max(...heroes.map(hero => hero.id)) + 1 : 11;
  }
}
