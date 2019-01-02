package com.ynu.sei.lib.domain;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    @Column(nullable = false)
    private String writer;
    @Column(nullable = false)
    private String scenic;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private LocalDateTime time;
    @Column(nullable = false)
    private String imgUrl;

    public Comment() {
    }

    public Comment(String writer, String scenic, String content, String imgUrl) {
        this.writer = writer;
        this.scenic = scenic;
        this.content = content;
        this.time = LocalDateTime.now();
        this.imgUrl = imgUrl;
    }
}
