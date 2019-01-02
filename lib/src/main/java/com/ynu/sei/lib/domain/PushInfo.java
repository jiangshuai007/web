package com.ynu.sei.lib.domain;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class PushInfo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String news;
    @Column(nullable = false)
    private String imgUrl;

    public PushInfo() {
    }

    public PushInfo(String title, String news, String imgUrl) {
        this.title = title;
        this.news = news;
        this.imgUrl = imgUrl;
    }
}
