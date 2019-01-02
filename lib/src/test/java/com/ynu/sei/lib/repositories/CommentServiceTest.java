package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceTest {
    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void saveCommentTest() {
        Comment comment = new Comment();
        comment.setScenic("福建土楼永定景区");
        comment.setWriter("爱睡觉的老田狗");
        comment.setImgUrl("/api/images/91.png");
        comment.setContent("土楼是国家5A级景区、世界文化遗产，也被戏称为“中国古建筑的一朵奇葩”。景区主要由洪坑土楼群、高北土楼群、初溪土楼群、南溪土楼群、中川古村落等组成。");
        comment.setTime(LocalDateTime.now());
        commentRepository.save(comment);
    }
}
