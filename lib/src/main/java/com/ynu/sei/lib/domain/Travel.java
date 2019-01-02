package com.ynu.sei.lib.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Travel {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    @Column(nullable = false)
    private String imgUrl1;
    @Column(nullable = false)
    private String imgUrl2;
    @Column(nullable = false)
    private String imgUrl3;
    @Column(nullable = false)
    private String content1;
    @Column(nullable = false)
    private String content2;
    @Column(nullable = false)
    private String content3;

    public Travel() {
    }

    public Travel(String imgUrl1, String imgUrl2, String imgUrl3, String content1, String content2, String content3) {
        this.imgUrl1 = imgUrl1;
        this.imgUrl2 = imgUrl2;
        this.imgUrl3 = imgUrl3;
        this.content1 = content1;
        this.content2 = content2;
        this.content3 = content3;
    }
}
