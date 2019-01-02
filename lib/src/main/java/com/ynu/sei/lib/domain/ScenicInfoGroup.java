package com.ynu.sei.lib.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
public class ScenicInfoGroup {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    @Column(nullable = false)
    private String scenic1;
    @Column(nullable = false)
    private String location1;
    @Column(nullable = false)
    private Integer ticket1;
    @Column(nullable = false)
    private String imgUrl1;
    @Column(nullable = false)
    private String scenic2;
    @Column(nullable = false)
    private String location2;
    @Column(nullable = false)
    private Integer ticket2;
    @Column(nullable = false)
    private String imgUrl2;

    public ScenicInfoGroup() {
    }

    public ScenicInfoGroup(String scenic1, String location1, Integer ticket1, String imgUrl1, String scenic2, String location2, Integer ticket2, String imgUrl2) {
        this.scenic1 = scenic1;
        this.location1 = location1;
        this.ticket1 = ticket1;
        this.imgUrl1 = imgUrl1;
        this.scenic2 = scenic2;
        this.location2 = location2;
        this.ticket2 = ticket2;
        this.imgUrl2 = imgUrl2;
    }
}
