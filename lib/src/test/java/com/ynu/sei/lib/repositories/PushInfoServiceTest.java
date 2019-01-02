package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.PushInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PushInfoServiceTest {

    @Autowired
    private PushInfoRepository pushInfoRepository;

    @Test
    public void savePushInfoTest() {
        PushInfo pushInfo = new PushInfo();
        pushInfo.setTitle("鼓浪屿欢迎你的到来");
        pushInfo.setNews("鼓浪屿位于厦门岛西南隅，与厦门市隔海相望，这里既有独特的侨乡风情，又有美味的闽南特色小吃，各式的异国建筑更是让鼓浪屿别具一格。");
        pushInfo.setImgUrl("/api/images/85.png");
        pushInfoRepository.save(pushInfo);
    }
}
