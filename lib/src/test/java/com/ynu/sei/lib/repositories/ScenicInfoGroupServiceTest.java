package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.ScenicInfoGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScenicInfoGroupServiceTest {

    @Autowired
    private ScenicInfoGroupRepository scenicInfoGroupRepository;

    @Test
    public void savePushInfoTest() {
        ScenicInfoGroup scenicInfoGroup = new ScenicInfoGroup();
        scenicInfoGroup.setScenic1("骑楼老街");
        scenicInfoGroup.setScenic2("雷琼地质公园");
        scenicInfoGroup.setLocation1("海口市龙华区水巷口路34号");
        scenicInfoGroup.setLocation2("海口市秀英区石山镇火山群世界地质公园");
        scenicInfoGroup.setImgUrl1("/api/images/83.png");
        scenicInfoGroup.setImgUrl2("/api/images/84.png");
        scenicInfoGroup.setTicket1(0);
        scenicInfoGroup.setTicket2(60);
        scenicInfoGroupRepository.save(scenicInfoGroup);
    }
}
