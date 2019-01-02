package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.Travel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TravelServiceTest {
    @Autowired
    private TravelRepository travelRepository;

    @Test
    public void saveTravelTest() {
        Travel travel = new Travel();
        travel.setContent1("昆明动物园，春天看樱花，平时看动物，还是带小一点的小朋友去看看大象。");
        travel.setContent2("昆明动物园虽然比不上野生动物园规模大设施新，但在市区这类小型动物园中，算是环境比较好的了。");
        travel.setContent3("人好多，一进门就是各种的鲜花，门票20元，当地人好悠闲，樱花树下打麻将。");
        travel.setImgUrl1("/api/images/87.png");
        travel.setImgUrl2("/api/images/88.png");
        travel.setImgUrl3("/api/images/89.png");
        travelRepository.save(travel);
    }
}
